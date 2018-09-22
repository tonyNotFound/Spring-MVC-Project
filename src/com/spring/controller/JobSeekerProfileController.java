package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.model.JobSeekerProfile;
import com.spring.model.Register;
import com.spring.service.RegisterService;

@Controller
@RequestMapping("/profile")
public class JobSeekerProfileController {
	
	@Autowired
	private RegisterService registerService;
	
	@RequestMapping("/jobSeekerProfile")
	public String getJobSeekerProfile(@RequestParam("jobSeekerId") int id, Model model) {
		//adding all attributes of registerDetails to jobSeekerDetails for using in JSP page of Job Seeker
		JobSeekerProfile jobSProfile = new JobSeekerProfile();
		Register register = registerService.getJobSeeker(id);
        model.addAttribute("jobSeekerDetails", register);
        System.out.println(register.getFirstName());
		return "jobSeekerProfile";
	}
}
