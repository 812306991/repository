package cn.yufei.ssm.system.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.databind.ObjectMapper;

import cn.yufei.ssm.system.annotation.SystemControllerLog;
import cn.yufei.ssm.system.po.UserContext;
import cn.yufei.ssm.system.service.SysFunctionService;
import cn.yufei.ssm.system.service.SysService;

@Controller
public class MainController {
	
	@Autowired
	private SysService sysService;
	
	@Autowired
	private SysFunctionService sysFunctionService;
	
	//此处为记录AOP拦截Controller记录用户操作    
	@SystemControllerLog(operationType="登录操作:",operationName="登录系统") 
	@RequestMapping("/main")
	public String sysMain(Model model,HttpServletRequest request,HttpServletResponse response) throws Exception{
		HttpSession session=request.getSession();
		String userID=(String) session.getAttribute("userID");
		if(StringUtils.isEmpty(userID)){
			model.addAttribute("tipError", "用户未登录");
			return "login";
		}
		//系统路径
		String rootPath="\""+request.getContextPath()+"\"";
		//用户信息
		UserContext context=sysService.getOrgDataByUserID(userID);
		context.setSessionId(session.getId());
		session.setAttribute("userContext", context);
		//用户机构信息
		ObjectMapper mapper = new ObjectMapper();
		model.addAttribute("context", mapper.writeValueAsString(context).toString());
		model.addAttribute("context_rootPath",rootPath);
		//用户权限功能信息
		String funTreeJson=sysFunctionService.getFunctionTreeByUserOrgID(userID);
		model.addAttribute("funTree",funTreeJson);
		return "main";
	}
	
	
	@RequestMapping("/index")
	public String sysIndex(Model model,HttpServletRequest request,HttpServletResponse response) throws Exception{
		
		return "login";
	}

}
