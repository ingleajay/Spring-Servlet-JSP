package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadController {

	@RequestMapping("/upload")
	public String showfileui() {
		return "fileupload";
	}
	
	@RequestMapping(value = "/uploadimg" ,method =RequestMethod.POST)
	public String processupload(@RequestParam MultipartFile file) {
		System.out.println(file.getSize() + " " + file.getName() + " " + file.getOriginalFilename());
		return "success4";
	}
}
