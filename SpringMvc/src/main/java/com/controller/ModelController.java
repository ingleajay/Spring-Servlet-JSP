package com.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// @RequestMapping("/first")
public class ModelController {

	// by default all request is get 
	//@RequestMapping(path = "/model", method=RequestMethod.GET)
	
	// if you write request mapping at first in controller then your sequence will be - /first/model
	
	@RequestMapping("/model")
	public String printname(Model model) {
		model.addAttribute("name","Ajay Ingle");
		model.addAttribute("Id",101);
		List<String> l = Arrays.asList("Ajay","Vijay","Sonali","Manohar");
		model.addAttribute("friends",l);
		return "profile";
	}
}
