package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


// use of requestparam

@Controller
public class RegisterViewtoController {
	
	@RequestMapping("/register")
	public String register() {
		return "register";
	}

	@RequestMapping(path="/post_register" , method=RequestMethod.POST)
	public String handlerRegister1(
			@RequestParam("email") String user_email,
			@RequestParam("password") String user_password,
			@RequestParam("address") String user_address,
			@RequestParam("city") String user_city,
			@RequestParam("state") String user_state,
			@RequestParam("zip") String user_zip,
			@RequestParam("check") String user_check,
			Model mregister
			) 
	{   
		mregister.addAttribute("model_email",user_email);
		mregister.addAttribute("model_password",user_password);
		mregister.addAttribute("model_address",user_address);
		mregister.addAttribute("model_city",user_city);
		mregister.addAttribute("model_state",user_state);
		mregister.addAttribute("model_zip",user_zip);
	    mregister.addAttribute("model_check",user_check);
		return "success";
	}
}
