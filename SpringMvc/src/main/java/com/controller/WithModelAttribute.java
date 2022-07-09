package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.User;

@Controller
public class WithModelAttribute {

	@RequestMapping("/register2")
	public String register() {
		return "register2";
	}
	
	@RequestMapping(path="/post_register2" , method=RequestMethod.POST)
	public String handlerRegister1(@ModelAttribute("us") User u, Model mregister) 
	{   System.out.println(u);
		return "success2";
	}
}
