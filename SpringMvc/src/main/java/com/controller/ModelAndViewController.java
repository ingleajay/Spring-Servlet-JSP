package com.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ModelAndViewController {

	@RequestMapping("/dash")
	public ModelAndView dashboard() {
		ModelAndView m = new ModelAndView();
		m.addObject("name", "Vijay Ingle");
		m.addObject("Id",101);
		List<String> l = Arrays.asList("Ajay","Vijay","Sonali","Manohar");
		m.addObject("friends",l);
		m.setViewName("dash");
		return m;
	}
	
	@RequestMapping("/dash1")
	public ModelAndView dashboard1() {
		ModelAndView m = new ModelAndView();
		m.addObject("name", "Sonali Ingle");
		m.addObject("Id",102);
		List<String> l = Arrays.asList("Ajay","Vijay","Sonali","Manohar");
		m.addObject("friends",l);
		m.setViewName("dash1");
		return m;
	}
}
