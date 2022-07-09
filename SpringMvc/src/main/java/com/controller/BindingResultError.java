package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.User;

@Controller
public class BindingResultError {

	@RequestMapping("/register3")
	public String register() {
		return "register3";
	}
	
	@RequestMapping(path="/post_register3" , method=RequestMethod.POST)
	public String handlerRegister1(@ModelAttribute("us") User u, BindingResult error,Model mregister) 
	{   System.out.println(u);
	    if(error.hasErrors()) {
	    	return "register3";
	    }
		return "success3";
	}
	
}
