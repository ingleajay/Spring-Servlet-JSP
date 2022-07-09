package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.User;

// without model Attribute

@Controller
public class WithoutModelAttribute {

	@RequestMapping("/register1")
	public String register() {
		return "register1";
	}
	

	@RequestMapping(path="/post_register1" , method=RequestMethod.POST)
	public String handlerRegister1(
			@RequestParam("email") String user_email,
			@RequestParam("password") String user_password,
			@RequestParam("address") String user_address,
			@RequestParam("city") String user_city,
			@RequestParam("state") String user_state,
			@RequestParam("zip") int user_zip,
			@RequestParam("check") String user_check,
			Model mregister
			) 
	{   
		User u = new User();
		u.setEmail(user_email);
		u.setCity(user_city);
		u.setZip(user_zip);
		u.setPassword(user_password);
		u.setCheck(user_check);
		u.setState(user_state);
		u.setAddress(user_address);
		mregister.addAttribute("u", u);
		
		return "success1";
	}
}
