package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jobs")
public class JobsController {
	
	@RequestMapping("/displayJobs")
	public String displayJobs(Model model) {
		Jobs job = new Jobs();
		model.addAttribute("jobs", job);
		return "jobs";
	}

}
