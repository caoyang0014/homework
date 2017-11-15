package com.ir.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ir.bean.User;
import com.ir.service.IUserService;

/**
 *@author 曹洋
 *2017年7月10日 上午11:20:26
 *
 *
 *
 */
@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	private IUserService userService;
	
	@RequestMapping("getList")
	public String getList(HttpServletRequest request){
		List<User> list = userService.getList();
		request.setAttribute("list", list);
		return "/list";
		
	}
	
	
	
	
}
