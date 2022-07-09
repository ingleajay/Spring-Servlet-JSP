package com.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CentralizeException {

	
	@ExceptionHandler(value=NullPointerException.class)
	public String nullpointer(Model m) {
		m.addAttribute("error", "This is null exception");
		return "error";
	}
	
	@ExceptionHandler(value=Exception.class)
	public String anyexception(Model m) {
		m.addAttribute("error", "This is any exception");
		return "error";
	}
}
