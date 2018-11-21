package cn.yufei.ssm.system.controller;

import java.math.BigDecimal;
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
import cn.yufei.ssm.system.exception.CustomException;
import cn.yufei.ssm.system.po.OrgTree;
import cn.yufei.ssm.system.po.SysOporg;
import cn.yufei.ssm.system.service.SysOrgService;
import cn.yufei.ssm.system.service.SysroleService;
import cn.yufei.ssm.system.utils.StringUtils;

@Controller
@RequestMapping("/org")
public class OrgManagerController {
	
	@Autowired
	private SysOrgService sysOrgService;
	
	@Autowired
	private SysroleService sysroleService;
	
	@RequestMapping(value = "/getOrgTree", method = { RequestMethod.GET,RequestMethod.POST })
	public @ResponseBody List<OrgTree> getOrgTreeNode(HttpSession session,@RequestParam("id") String id) throws Exception{
		String userID=(String) session.getAttribute("userID");
		
		if(StringUtils.isEmpty(userID)){
			throw new CustomException("getOrgTreeNode()---userID为空");
		}
		List<SysOporg> orgNode=null;
		//boolean roleManage=sysroleService.getManagerRoleByUserID(userID);
		//判断是否拥有管理员角色，如果拥有管理角色则可以查询所有否则只能查询自己的相关节点信息
		//if(roleManage){
			orgNode=sysOrgService.getChildOrgListByID(id);
		//}else{
			//UserContext context=(UserContext) session.getAttribute("userContext");
			//String[] parentId=context.getUserOrgId().split("@");
			//orgNode=sysOrgService.getParentOrgListByID(parentId[1]);
		//}
		List<OrgTree> tree=sysOrgService.getOrgTreeNode(orgNode);
		return tree;
	}
	
	
	//根据输入内容模糊查询机构信息列表、
	@RequestMapping(value = "/findByTextOrgListData", method = { RequestMethod.GET,RequestMethod.POST })
	public @ResponseBody GridData findByTextOrgData(String inputText,@RequestParam(value = "page", defaultValue = "1", required = false) Integer page,@RequestParam(value = "rows", defaultValue = "5", required = false) Integer rows) throws Exception {
		GridData datagrid = sysOrgService.findByTextOrgData(inputText, page, rows);
		return datagrid;
	}
	
	//单击机构树查询机构列表
	//根据输入内容模糊查询机构信息列表、
	@RequestMapping(value = "/findByOrgListOnTreeClick", method = { RequestMethod.GET,RequestMethod.POST })
	public @ResponseBody GridData findByOrgListOnTreeClick(String treeId,String inputText,@RequestParam(value = "page", defaultValue = "1", required = false) Integer page,@RequestParam(value = "rows", defaultValue = "20", required = false) Integer rows) throws Exception {
			GridData datagrid = sysOrgService.findByOrgListOnTreeClick(treeId,inputText, page, rows);
			return datagrid;
	}
	
	//保存组织机构
	@SystemControllerLog(operationType="组织机构操作:",operationName="添加组织机构") 
	@RequestMapping(value = "/saveOrg", method = { RequestMethod.GET,RequestMethod.POST })
	public @ResponseBody MessageData saveOrgData(String jsonData) throws Exception{
		int count=sysOrgService.save(jsonData);
		MessageData message=null;
		if(count>0){
			message=new MessageData(ApplicationCode.SUCCESS.getCode(),ApplicationCode.SUCCESS.getMessage());
		}else{
			message=new MessageData(ApplicationCode.FAIL.getCode(),ApplicationCode.FAIL.getMessage());
		}
		return message;
	}
	
	//根据id查询组织机构
	@RequestMapping(value = "/queryOrgById", method = { RequestMethod.GET,RequestMethod.POST })
	public @ResponseBody SysOporg queryOrgById(String id) throws Exception{
		SysOporg org=sysOrgService.findOrgByID(id);
		return org;
	}
	
	//组织机构禁用启用
	@SystemControllerLog(operationType="组织机构操作:",operationName="组织机构禁用或启用") 
	@RequestMapping(value = "/banOrgData", method = { RequestMethod.GET,RequestMethod.POST })
	public @ResponseBody MessageData banOrgData(String orgId,String state) throws Exception{
	     int count=sysOrgService.updateBanOrg(orgId, new BigDecimal(state));
		MessageData message=null;
			if(count>0){
				message=new MessageData(ApplicationCode.SUCCESS.getCode(),ApplicationCode.SUCCESS.getMessage());
			}else{
				message=new MessageData(ApplicationCode.FAIL.getCode(),ApplicationCode.FAIL.getMessage());
			}
			return message;
	}
	

}
