package com.spring.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	
	
	@RequestMapping("/processRegisterForm")
		public String checkSuccessfulSubmission(@Valid @ModelAttribute("registerDetails") Register detailsRegister, BindingResult bindingResult) {
		
		String userType  = detailsRegister.getUserType();
		   System.out.println(userType);

		
		if(bindingResult.hasErrors()) {
			return "register";
		}
		else {
			if(userType.equals("jobSeeker"))
				return  "redirect:/profile/jobSeeker";
			else 
				return "redirect:/profile/recruiter";		
			}
	}
		
	
}
