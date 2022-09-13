package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWordController {
  
	
	
		// controller to show init form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
		
	}
	
		// controller to process html
	@RequestMapping("/processForm")
	public String processForm() {
		
		return "helloworld";
	}
	
}
