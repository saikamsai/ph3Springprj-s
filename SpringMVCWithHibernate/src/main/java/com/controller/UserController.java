package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bean.User;
import com.service.UserService;

@Controller
public class UserController {

	
	@Autowired
	UserService userService;
	
	
	
	
	@RequestMapping(value = "updateUser",method = RequestMethod.POST)
	public ModelAndView updateProduct(HttpServletRequest req, User user) {
		int id = Integer.parseInt(req.getParameter("id"));
		int Age = Integer.parseInt(req.getParameter("Age"));
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		
		user.setId(id);
		user.setAge(Age);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		
		String result = userService.updateUser(user);
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", result);
		mav.setViewName("updateUser.jsp");
		return mav;
	}
	
	
	
	
	@RequestMapping(value = "searchUser",method = RequestMethod.GET)
	public ModelAndView searchUser(HttpServletRequest req) {
		int id = Integer.parseInt(req.getParameter("id"));
		
		String result = userService.searchUserById(id);
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", result);
		mav.setViewName("searchUserById.jsp");
		return mav;
	}
	
	
	
}
