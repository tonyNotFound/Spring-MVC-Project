package com.spring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/profile")
public class ProfileController {

	/*
	 * @ModelAttribute will bind all data to Registration data upon form submission 
	 * to registerDetails
	 */
	@RequestMapping("/profileDetails")
	public String getRegistrationDetails(@ModelAttribute("registerDetails") Register detailsRegister) {
		
		String userType  = detailsRegister.getUserType();
		if(userType.equals("jobSeeker"))
			return "jobSeekerProfile";
		else 
			return "recruiterProfile";
		
	}
	
}
