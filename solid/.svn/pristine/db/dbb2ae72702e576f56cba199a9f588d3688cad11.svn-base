package cn.yufei.ssm.system.exception;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class CustomExceptionResolver implements HandlerExceptionResolver{

	@Override
	public ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception e) {
		//输出异常
		e.printStackTrace();
		// 统一异常处理
		String message=null;
		
		CustomException customException=null;
		
		if(e instanceof CustomException){
			customException=(CustomException) e;
		}else{
			//未知错误
			customException=new CustomException("未知错误，请联系系统管理员");
		}
		 //1.针对系统未知错误的异常将异常处理在错误页面展示
		
		message=customException.getMessage();
		request.setAttribute("message", message);
		try {
			request.getRequestDispatcher("/WEB-INF/UI/error.jsp").forward(request, response);
		} catch (ServletException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return new ModelAndView();
	}

}
