package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.model.Jobs;
import com.spring.model.Register;
import com.spring.service.RegisterService;

@Controller
@RequestMapping("/jobs")
public class JobsController extends HomepageController{
	
	@Autowired
	private RegisterService registerService;
	@RequestMapping("/displayJobs")

	public String displayJobs(@RequestParam("jobSeekerId") int id, @ModelAttribute("registerDetails") Register detailsRegister, Model model) {
		Jobs job = new Jobs();
		Register register = registerService.getJobSeeker(id);
		model.addAttribute("jobSeekerDetails", register);
		return "jobs";
	}

}
