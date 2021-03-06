package cn.yufei.ssm.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.yufei.ssm.system.annotation.SystemControllerLog;
import cn.yufei.ssm.system.core.ApplicationCode;
import cn.yufei.ssm.system.core.data.MessageData;
import cn.yufei.ssm.system.core.data.SimpleData;
import cn.yufei.ssm.system.po.SysOpperson;
import cn.yufei.ssm.system.service.SysOppersonService;

@Controller
@RequestMapping("/person")
public class PersonManagerController {
	
	@Autowired
	private SysOppersonService sysOppersonService;
	
	//根据人员编码查询数据
	@RequestMapping(value = "/getPersonCode", method = { RequestMethod.GET,RequestMethod.POST })
	public @ResponseBody SimpleData getCode(String code) throws Exception{
		SysOpperson person=sysOppersonService.findPersonByCode(code);
		SimpleData simpleData=new SimpleData(person);
		return simpleData;
	}
	
	//根据人员id查询数据
	@RequestMapping(value = "/getPersonId", method = { RequestMethod.GET,RequestMethod.POST })
	public @ResponseBody SimpleData getId(String id) throws Exception{
		SysOpperson person=sysOppersonService.findPersonById(id);
		SimpleData simpleData=new SimpleData(person);
		return simpleData;
	}
	
	//保存人员信息
	@SystemControllerLog(operationType="组织机构操作:",operationName="添加人员信息") 
	@RequestMapping(value = "/savePersonData", method = { RequestMethod.GET,RequestMethod.POST })
	public @ResponseBody MessageData savePerson(String jsonData) throws Exception{
		int count=sysOppersonService.save(jsonData);
		MessageData message=null;
		if(count>0){
			message=new MessageData(ApplicationCode.SUCCESS.getCode(),ApplicationCode.SUCCESS.getMessage());
		}else{
			message=new MessageData(ApplicationCode.ERROR.getCode(),ApplicationCode.ERROR.getMessage());
		}
		return message;
	}
	

}
