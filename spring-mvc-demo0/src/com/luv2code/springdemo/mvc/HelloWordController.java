package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

	//add a new controller method to read form data
	// add data to the model
	
	@RequestMapping("/showFormVersion2")	
	public String readcontroller(HttpServletRequest request, Model model) {
		
		//read the request parameter from the HTML
		String theName=request.getParameter("studentName");
		
		//convert the data to caps
		theName = theName.toUpperCase();
		
		//create the message
		String result = "Hi there!" + theName;
		
		//add message to model
		model.addAttribute("message",result);
		
		return "helloworld";
	}
	
	@RequestMapping("/showFormVersion3")	
	public String showFormVersion3(@RequestParam("studentName")String theName, Model model) {
		
	 
		//convert the data to caps
		theName = theName.toUpperCase();
		
		//create the message
		String result = "Hi there!" + theName;
		
		//add message to model
		model.addAttribute("message",result);
		
		return "helloworld";
	}
	
}
