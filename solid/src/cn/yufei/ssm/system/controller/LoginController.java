package cn.yufei.ssm.system.controller;

import java.awt.image.RenderedImage;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.yufei.ssm.system.annotation.SystemControllerLog;
import cn.yufei.ssm.system.core.ApplicationCode;
import cn.yufei.ssm.system.core.data.MessageData;
import cn.yufei.ssm.system.core.data.SimpleData;
import cn.yufei.ssm.system.exception.CustomException;
import cn.yufei.ssm.system.po.User;
import cn.yufei.ssm.system.po.UserContext;
import cn.yufei.ssm.system.service.SysOppersonService;
import cn.yufei.ssm.system.service.SysService;
import cn.yufei.ssm.system.utils.AuthCode;

@Controller
@RequestMapping("/core")
public class LoginController {
	
	// 注入service
		@Autowired
		private SysService sysService;
		
		@Autowired
		private SysOppersonService sysOppersonService;
	
	
	//生成验证码
	@RequestMapping("/authCode")
	public void getAuthCode(HttpServletRequest request,HttpServletResponse response,HttpSession session)throws Exception{
		//设置response头信息
        //禁止缓存
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        //获取图像验证码信息
        Map<String,Object> map=AuthCode.getGraphics(70, 28,4);
        session.setAttribute("validateCode", map.get("validateCode"));
        ImageIO.write((RenderedImage) map.get("image"), "JPEG", response.getOutputStream());
        response.getOutputStream().flush();
	}
	

	//用户登录
	@RequestMapping(value = "/login", method = { RequestMethod.GET,RequestMethod.POST })
	public String login(Model model,HttpSession session,String userCode,String password,String switchValidateCode,String validateCode)throws Exception{
		//判断是否需要校验验证码
		if (switchValidateCode.equals("true")) {
			if (StringUtils.isEmpty(validateCode)) {
				model.addAttribute("tipError", "验证码不能为空");
				//throw new CustomException("验证码不能为空");
				return "login";
			} else {
				// 从session校验验证码防止恶意性攻击
				String validateCode_s = (String) session.getAttribute("validateCode");
				if (!validateCode.equals(validateCode_s)) {
					model.addAttribute("tipError", "验证码错误");
					model.addAttribute("userCode", userCode);
					model.addAttribute("password", password);
					//throw new CustomException("验证码错误");
					return "login";
				}
			}
		}
		if(StringUtils.isEmpty(userCode)){
			model.addAttribute("tipError", "用户账号不能为空");
			//throw new CustomException("用户账号不能为空");
			return "login";
		}
		if(StringUtils.isEmpty(password)){
			model.addAttribute("tipError", "用户密码不能为空");
			//throw new CustomException("用户密码不能为空");
			return "login";
		}
		//调用service 校验账号和密码的正确性
		String  userId=sysService.authenticat(userCode, password);
		System.out.println("userID:"+userId);
		//如果校验通过，将用户信息记录到session
		session.setAttribute("userID", userId);
		return "redirect:/main.action";
		
		
	}
	
	//修改密码
	@SystemControllerLog(operationType="update操作:",operationName="修改密码") 
	@RequestMapping(value = "/changePassword", method = { RequestMethod.GET,RequestMethod.POST })
	public @ResponseBody MessageData changePassword(HttpSession session,String newPwd) throws Exception{
		UserContext userContext=(UserContext)session.getAttribute("userContext");
		String flag=sysService.updatePassword(userContext.getUserId(),newPwd);
		MessageData message=null;
		if(flag==null || "error".equals(flag)){
			message=new MessageData(ApplicationCode.ERROR.getCode(),ApplicationCode.ERROR.getMessage());
		}else{
			message=new MessageData(ApplicationCode.SUCCESS.getCode(),ApplicationCode.SUCCESS.getMessage());
		}
		return message;
	}
	
	//重置密码
	@SystemControllerLog(operationType="update操作:",operationName="重置密码") 
	@RequestMapping(value = "/resetPassword", method = { RequestMethod.GET,RequestMethod.POST })
	public @ResponseBody MessageData resetPassword(HttpSession session,String userId) throws Exception{
		MessageData message=null;
		int count=sysOppersonService.updateResetPassword(userId);
		if(count>0){
			message=new MessageData(ApplicationCode.SUCCESS.getCode(),ApplicationCode.SUCCESS.getMessage());
		}else{
			message=new MessageData(ApplicationCode.ERROR.getCode(),ApplicationCode.ERROR.getMessage());
		}
		return message;
	}
	
	
	//用户退出
	@RequestMapping(value = "/logout", method = { RequestMethod.GET,RequestMethod.POST })
	public String logout(HttpSession session){
		//session失效
		System.out.println("------用户退出系统------");
		session.invalidate();
		//重定向到登录页面
		return "login";
		
	}
	
	
}
