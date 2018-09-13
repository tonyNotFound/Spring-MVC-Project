package com.spring.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Controller
@RequestMapping("/profile")
public class ProfileController {

	/*
	 * @ModelAttribute will bind all data to Registration data upon form submission 
	 * to registerDetails
	 */
	
	
	@RequestMapping("/jobSeeker")
	public String getJobSeekerProfile() {
		return "jobSeekerProfile";
	
		
	}
	
	@RequestMapping("/recruiter")
	public String getRecruiterProfile() {
		return "recruiterProfile";
	}
	
}
