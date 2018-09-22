package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.model.Jobs;
import com.spring.model.Register;

@Controller
@RequestMapping("/jobs")
public class JobsController extends HomepageController{
	
	@RequestMapping("/displayJobs")

	public String displayJobs(@ModelAttribute("registerDetails") Register detailsRegister, Model model) {
		Jobs job = new Jobs();
		model.addAttribute("jobs", job);
		model.addAttribute("registerDetails", detailsRegister);
		return "jobs";
	}

}
