package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectPrefix {

	@RequestMapping("/one")
	public String one() {
		System.out.println("one print");
		return "redirect:/reg";
	}

	@RequestMapping("/reg")
	public String two() {
		return "register";
	}

}
