package com.spring.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.model.JobSeekerProfile;
import com.spring.model.Jobs;
import com.spring.model.Register;


@Controller
@RequestMapping("/homepage")
public class HomepageController {

	/*
	 * @ModelAttribute will bind all data to Registration data upon form submission 
	 * to registerDetails
	 */
	
	
	@RequestMapping("/jobSeeker")
	public String getJobSeekerProfile(@ModelAttribute("registerDetails") Register detailsRegister, Model model) {
		//adding all attributes of registerDetails to jobSeekerDetails for using in JSP page of Job Seeker
        model.addAttribute("jobSeekerDetails", detailsRegister);
        System.out.println(detailsRegister.getFirstName());
		return "jobSeekerHomepage";
	
		
	}
	
	@RequestMapping("/recruiter")
	public String getRecruiterProfile(@ModelAttribute("registerDetails") Register detailsRegister, Model model) {
		
		//adding all attributes of registerDetails to recruiterDetails for using in JSP page of recruiter
		model.addAttribute("recruiterDetails", detailsRegister);
		return "recruiterHomepage";
	}
	
	
	//Profile menu
	@RequestMapping("/jobSeekerProfile")
	public String displayProfilePage(Model model) {
		JobSeekerProfile profile  = new JobSeekerProfile();
		model.addAttribute("jobSProfile", profile);
		return "redirect:/profile/jobSeekerProfile";
	}
	
	//Jobs menu
	@RequestMapping("/jobs")
	public String displayJobsPage(@ModelAttribute("registerDetails") Register detailsRegister, Model model) {
		Jobs job = new Jobs();
		model.addAttribute("jobpage", job);
		model.addAttribute("registerDetails", detailsRegister);
		return "redirect:/jobs/displayJobs";
	}
}
