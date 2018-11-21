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
import cn.yufei.ssm.system.service.SysOpmanagementService;

@Controller
@RequestMapping("/management")
public class SysOpmanagementController {
	
	@Autowired
	private  SysOpmanagementService sysOpmanagementService;
	
	//保存
	@SystemControllerLog(operationType="业务管理权限操作:",operationName="添加业务管理权限") 
	@RequestMapping(value = "/saveManagement", method = { RequestMethod.GET,RequestMethod.POST })
	public @ResponseBody MessageData saveManagement(HttpServletRequest request,String orgId,String manageTypeId,String orgData) throws Exception{
				int count=sysOpmanagementService.save(request,orgId,manageTypeId,orgData);
				MessageData message=null;
				if(count>0){
					message=new MessageData(ApplicationCode.SUCCESS.getCode(),ApplicationCode.SUCCESS.getMessage());
				}else{
					message=new MessageData(ApplicationCode.ERROR.getCode(),ApplicationCode.ERROR.getMessage());
				}
				return message;
	}
	//根据类型或输入内容模糊查询机构信息列表、
	@RequestMapping(value = "/findByTextManagementData", method = {RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody GridData findByTextManagementData(String orgId, String inputText,@RequestParam(value = "page", defaultValue = "1", required = false) Integer page,@RequestParam(value = "rows", defaultValue = "5", required = false) Integer rows) throws Exception {
				GridData datagrid = sysOpmanagementService.findByTextManagementData(orgId, inputText, page, rows);
				return datagrid;
	}	
	
	//删除功能信息
	@SystemControllerLog(operationType="授权信息操作:",operationName="删除授权信息") 
	@RequestMapping(value = "/deleteManagement", method = { RequestMethod.GET,RequestMethod.POST })
	public @ResponseBody MessageData deleteManagement(String id) throws Exception{
			int count = sysOpmanagementService.deleteById(id);
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
