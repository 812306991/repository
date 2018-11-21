package cn.yufei.ssm.system.controller;

import java.util.List;

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
import cn.yufei.ssm.system.po.SysBasecode;
import cn.yufei.ssm.system.service.SysBaseCodeService;

@Controller
@RequestMapping("/baseCode")
public class SysBaseCodeController {

	@Autowired
	private SysBaseCodeService sysBaseCodeService;
	
	//根据输入内容模糊查询机构信息列表、
	@RequestMapping(value = "/findBaseCodeListData", method = {RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody GridData findBaseCodeListData( String inputText,@RequestParam(value = "page", defaultValue = "1", required = false) Integer page,@RequestParam(value = "rows", defaultValue = "5", required = false) Integer rows) throws Exception {
		GridData datagrid = sysBaseCodeService.findBaseCodeListData(inputText,page, rows);
		return datagrid;
	}
	
	//根据id查询
	@RequestMapping(value = "/queryBaseCodeById", method = { RequestMethod.GET,RequestMethod.POST })
    public @ResponseBody SysBasecode queryBaseCodeById(String id) throws Exception{
	  SysBasecode baseCode=sysBaseCodeService.findSysBaseCodeByID(id);
			return baseCode;
	}
	
	//根据id查询
	@RequestMapping(value = "/queryBaseCodeByCode", method = { RequestMethod.GET,RequestMethod.POST })
	public @ResponseBody SysBasecode queryBaseCodeByCode(String code) throws Exception{
	 SysBasecode baseCode=sysBaseCodeService.findSysBaseCodeByCode(code);
	return baseCode;
   }
	
	//根据类型查询数据
	@RequestMapping(value = "/queryBaseCodeByType", method = { RequestMethod.GET,RequestMethod.POST })
	public @ResponseBody List<SysBasecode> queryBaseCodeByType(String type) throws Exception{
		 List<SysBasecode> list=sysBaseCodeService.findSysBaseCodeByType(type);
			return list;
	 }
	
	//根据类型或输入内容模糊查询机构信息列表、
	@RequestMapping(value = "/findBaseCodeListDataLike", method = {RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody GridData findBaseCodeListData(String type,String inputText,@RequestParam(value = "page", defaultValue = "1", required = false) Integer page,@RequestParam(value = "rows", defaultValue = "5", required = false) Integer rows) throws Exception {
			GridData datagrid = sysBaseCodeService.findSysBaseCodeByTpey(type, inputText, page, rows);
			return datagrid;
	}
	//保存
	@SystemControllerLog(operationType="基础信息操作:",operationName="添加基础信息") 
	@RequestMapping(value = "/savebase", method = { RequestMethod.GET,RequestMethod.POST })
	public @ResponseBody MessageData saveBaseeData(String jsonData) throws Exception{
			int count=sysBaseCodeService.save(jsonData);
			MessageData message=null;
			if(count>0){
				message=new MessageData(ApplicationCode.SUCCESS.getCode(),ApplicationCode.SUCCESS.getMessage());
			}else{
				message=new MessageData(ApplicationCode.ERROR.getCode(),ApplicationCode.ERROR.getMessage());
			}
			return message;
	}
	
	//删除数据
	@SystemControllerLog(operationType="基础信息操作:",operationName="删除基础信息") 
	@RequestMapping(value = "/deletebase", method = { RequestMethod.GET,RequestMethod.POST })
	public @ResponseBody MessageData deleteBaseData(String id) throws Exception{
		int count=sysBaseCodeService.delete(id);
		MessageData message=null;
		if(count>0){
			message=new MessageData(ApplicationCode.SUCCESS.getCode(),ApplicationCode.SUCCESS.getMessage());
		}else{
			message=new MessageData(ApplicationCode.ERROR.getCode(),ApplicationCode.ERROR.getMessage());
		}
		return message;
	}
}
