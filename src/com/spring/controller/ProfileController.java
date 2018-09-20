package com.spring.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/homepage")
public class ProfileController {

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
	
}
