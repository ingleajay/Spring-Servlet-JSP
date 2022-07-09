package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExceptionHandleController {

	@RequestMapping("/home1")
	public String demo() {
		String n = null;
		System.out.println(n.length());
		return "Home";
	}
	
//	@ExceptionHandler(value=NullPointerException.class)
//	public String nullpointer(Model m) {
//		m.addAttribute("error", "This is null exception");
//		return "error";
//	}
	
//	@ExceptionHandler(value=Exception.class)
//	public String nullpointer(Model m) {
//		m.addAttribute("error", "This is any exception");
//		return "error";
//	}
	
}
