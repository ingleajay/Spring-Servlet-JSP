package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeContoller {

	@RequestMapping("/home")
	public String home() {
//		String n = null;
//		System.out.println(n.length());
		return "Home";
	}
}
