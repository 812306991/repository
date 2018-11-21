package com.yufei.doc.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.yufei.ssm.system.annotation.SystemControllerLog;
import cn.yufei.ssm.system.core.ApplicationCode;
import cn.yufei.ssm.system.core.data.GridData;
import cn.yufei.ssm.system.core.data.MessageData;

import com.yufei.doc.po.DocTree;
import com.yufei.doc.po.SysDocnodeWithBLOBs;
import com.yufei.doc.service.SysDocService;


@Controller
@RequestMapping("/doc")
public class SysDocController {
	
	@Autowired
	private SysDocService sysDocServicep;
	
	
	@RequestMapping(value = "/getDocTree", method = { RequestMethod.GET,RequestMethod.POST })
	public @ResponseBody  List<DocTree> getOrgTreeNode(HttpSession session,@RequestParam("id") String sid) throws Exception{
		List<SysDocnodeWithBLOBs> node=sysDocServicep.getDocTreeNode(sid);
		List<DocTree> tree=sysDocServicep.getDocTreeNode(node);
		return tree;
	}
	
	
	// 保存
	@SystemControllerLog(operationType="文档中心操作:",operationName="创建文件夹") 
	@RequestMapping(value = "/createDir", method = { RequestMethod.GET,RequestMethod.POST })
	public @ResponseBody MessageData saveDocData(HttpSession session, String jsonStr) throws Exception {
			int count = sysDocServicep.saveDir(session, jsonStr);
			MessageData message = null;
			if (count > 0) {
				message = new MessageData(ApplicationCode.SUCCESS.getCode(),
						ApplicationCode.SUCCESS.getMessage());
			} else {
				message = new MessageData(ApplicationCode.ERROR.getCode(),
						ApplicationCode.ERROR.getMessage());
			}
			return message;
	}
	//编辑文件夹属性
	@SystemControllerLog(operationType="文档中心操作:",operationName="编辑文件夹") 
	@RequestMapping(value = "/updateDir", method = { RequestMethod.GET,RequestMethod.POST })
	public @ResponseBody MessageData UpdateDocData(HttpSession session, String jsonStr) throws Exception {
		int count = sysDocServicep.updateDir(session, jsonStr);
		MessageData message = null;
		if (count > 0) {
			message = new MessageData(ApplicationCode.SUCCESS.getCode(),
					ApplicationCode.SUCCESS.getMessage());
		} else {
			message = new MessageData(ApplicationCode.ERROR.getCode(),
					ApplicationCode.ERROR.getMessage());
		}
		return message;
     }
	//根据id查询文档信息
	@RequestMapping(value = "/getDocById", method = { RequestMethod.GET,RequestMethod.POST })
	public @ResponseBody SysDocnodeWithBLOBs findDocDataById(String id) throws Exception {
		SysDocnodeWithBLOBs doc=sysDocServicep.finDocDataById(id);
		return doc;
	}
	
	//根据文档id,文件名称查询文件列表
	@RequestMapping(value = "/findFileByDocIdList", method = { RequestMethod.GET,RequestMethod.POST })
	public @ResponseBody GridData findFileByDocIdList(String dirId,String inputText,@RequestParam(value = "page", defaultValue = "1", required = false) Integer page,@RequestParam(value = "rows", defaultValue = "5", required = false) Integer rows)throws Exception{
		GridData grid=sysDocServicep.findFileDataByDirId(dirId, inputText, page, rows);
		return grid;
	}

}
