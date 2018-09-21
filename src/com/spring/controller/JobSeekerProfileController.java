package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.model.JobSeekerProfile;

@Controller
@RequestMapping("/profile")
public class JobSeekerProfileController {
		
	@RequestMapping("/jobSeekerProfile")
	public String displayProfilePage(Model model) {
		JobSeekerProfile profile  = new JobSeekerProfile();
		model.addAttribute("jobSProfile", profile);
		return "jobSeekerProfile";
	}
}
