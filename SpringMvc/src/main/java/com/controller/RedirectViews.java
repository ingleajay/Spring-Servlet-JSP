package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectViews {

	@RequestMapping("/map")
	public RedirectView one() {
		RedirectView r = new RedirectView();
		r.setUrl("regi");
		return r;
	}
	

	@RequestMapping("/regi")
	public String two() {
		return "register";
	}
	
	@RequestMapping("/web")
	public RedirectView website() {
		RedirectView r = new RedirectView();
		r.setUrl("https://www.google.com");
		return r;
	}
}
