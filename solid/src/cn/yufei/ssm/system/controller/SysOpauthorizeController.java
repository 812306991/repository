package cn.yufei.ssm.system.controller;

import javax.servlet.http.HttpServletRequest;

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
import cn.yufei.ssm.system.service.SysOpauthorizeService;

@Controller
@RequestMapping("/authorize")
public class SysOpauthorizeController {
	
	
	@Autowired
	private SysOpauthorizeService sysOpauthorizeService;
	
	
	//根据输入内容模糊查询授权信息列表、
	@RequestMapping(value = "/findTextAuthorizeListData", method = { RequestMethod.GET,RequestMethod.POST })
	public @ResponseBody GridData findTextPermissionListData(String orgid,String orgFid,String inputText,@RequestParam(value = "page", defaultValue = "1", required = false) Integer page,@RequestParam(value = "rows", defaultValue = "5", required = false) Integer rows) throws Exception {
	GridData datagrid = sysOpauthorizeService.findAuthorizeDataListByInput(orgid,orgFid, inputText, page, rows);
	 return datagrid;
	}
	//根据输入内容模糊查询授权，角色，功能列表信息
	@RequestMapping(value = "/findAllAuthorizeData", method = { RequestMethod.GET,RequestMethod.POST })
	public @ResponseBody GridData findAllAuthorizeData(String orgid,String orgFid,String inputText,@RequestParam(value = "page", defaultValue = "1", required = false) Integer page,@RequestParam(value = "rows", defaultValue = "5", required = false) Integer rows) throws Exception {
		GridData datagrid = sysOpauthorizeService.findAllAuthorizeData(orgid,orgFid, inputText, page, rows);
		 return datagrid;
	}
	
	// 保存
	@SystemControllerLog(operationType="授权信息操作:",operationName="添加授权信息") 
	@RequestMapping(value = "/saveAuthorize", method = { RequestMethod.GET,RequestMethod.POST })
	public @ResponseBody
	MessageData saveRoleData(HttpServletRequest request,String orgJson,String dataJson) throws Exception {
		int count = sysOpauthorizeService.save(request, orgJson, dataJson);
		MessageData message = null;
		if (count > 0) {
			message = new MessageData(ApplicationCode.SUCCESS.getCode(),
					ApplicationCode.SUCCESS.getMessage());
		} else {
			message = new MessageData(ApplicationCode.FAIL.getCode(),
					ApplicationCode.FAIL.getMessage());
		}
		return message;
	}
	
	//删除功能信息
	@SystemControllerLog(operationType="授权信息操作:",operationName="删除授权信息") 
	@RequestMapping(value = "/deleteAuthorize", method = { RequestMethod.GET,RequestMethod.POST })
	public @ResponseBody MessageData deletePermission(String id) throws Exception{
		int count = sysOpauthorizeService.deleteById(id);
		MessageData message = null;
		if (count > 0) {
			message = new MessageData(ApplicationCode.SUCCESS.getCode(),
					ApplicationCode.SUCCESS.getMessage());
		} else {
			message = new MessageData(ApplicationCode.FAIL.getCode(),
					ApplicationCode.FAIL.getMessage());
		}
		return message;
	}
	

}