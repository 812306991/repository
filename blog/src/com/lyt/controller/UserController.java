package com.lyt.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lyt.model.User;
import com.lyt.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	//添加所有用户列表
	@RequestMapping("/getAllUser")
	public String getAllUser(HttpServletRequest req,Model model){
		List<User> user=userService.findAll();
		model.addAttribute("userList",user);
		req.setAttribute("userList", user);
		return "/allUser";
	}
	
//	跳转到添加用户界面
	@RequestMapping("/toAddUser")
	public String toAddUser(){
		return "/addUser";
	}
	
//	添加用户并重定向
	@RequestMapping("/addUser")
	public String addUser(User user,Model model){
		userService.save(user);
		return "redirect:/user/getAllUser";
	}
	
//	编辑用户
	@RequestMapping("/updateUser")
	public String updateUser(User user,HttpServletRequest req,Model model){
		if(userService.update(user)){
			user=userService.findById(user.getId());
			req.setAttribute("user", user);
			model.addAttribute("user",user);
			return "redirect:/user/getAllUser";
		}else{
			return "error";
		}
	}
	
//	根据单个ID查询单个用户
	@RequestMapping("/getUser")
	public String getUser(int id,HttpServletRequest req,Model model){
		req.setAttribute("user", userService.findById(id));
		model.addAttribute("user",userService.findById(id));
		return "/editUser";
	}
	
//	删除用户
	@RequestMapping("/delUser")
	public void delUser(int id,HttpServletRequest req,HttpServletResponse res,Model model){
		String result="{\"result\":\"error\"}";
		if(userService.delete(id)){  
            result = "{\"result\":\"success\"}";  
        }  
        res.setContentType("application/json");  
        try {  
            PrintWriter out = res.getWriter();  
            out.write(result);  
        } catch (IOException e) {  
            e.printStackTrace();  
        }
	}
}
