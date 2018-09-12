package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistrationController {
	
	/* Request Mapped to "/register"
	 * "http://localhost:8080/Spring-MVC-Project/register" to run application
	 * 
	 */
	
	@RequestMapping("/register")
	public String displayRegisterPage(Model model) {
		Register detailsRegister = new Register();
		model.addAttribute("registerDetails", detailsRegister);
		return "register";
	}
}
