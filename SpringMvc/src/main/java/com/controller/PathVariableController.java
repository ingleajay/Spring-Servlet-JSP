package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PathVariableController {

	@RequestMapping("/pv/{userId}")
	public String pathvar(@PathVariable("userId") int id) {
		System.out.println("User id  - " + id);
		return "";
	}
	
}
