package com.spring.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.model.Register;
import com.spring.service.RegisterService;

@Controller
public class RegistrationController {
	
	/* Request Mapped to "/register"
	 * "http://localhost:8080/Spring-MVC-Project/register" to run application
	 * 
	 */
	@Autowired
	private RegisterService registerService;
	
	@RequestMapping("/register")
	public String displayRegisterPage(Model model) {
		Register detailsRegister = new Register();
		model.addAttribute("registerDetails", detailsRegister);
		return "register";
	}
	
	
	@RequestMapping("/processRegisterForm")
		public String checkSuccessfulSubmission(@Valid @ModelAttribute("registerDetails") Register detailsRegister, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
		
		String userType  = detailsRegister.getUserType();
		   System.out.println(userType);


		if(bindingResult.hasErrors()) {
			return "register";
		}
		else {
			
			//redirecting all attributes of model "registerDetails" to jobSeeker and Profile pages
	           redirectAttributes.addFlashAttribute("registerDetails", detailsRegister);

				if(userType.equals("jobSeeker"))
					return "redirect:/homepage/jobSeeker";
				else 
					return "redirect:/homepage/recruiter";		
			}
	}
		
	
}
