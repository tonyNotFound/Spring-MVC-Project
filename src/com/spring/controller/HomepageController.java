package com.spring.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.model.JobSeekerProfile;
import com.spring.model.Jobs;
import com.spring.model.Login;
import com.spring.model.Register;
import com.spring.service.RegisterService;


@Controller
@RequestMapping("/homepage")
public class HomepageController {

	/*
	 * @ModelAttribute will bind all data to Registration data upon form submission 
	 * to registerDetails
	 */

	@Autowired
	private RegisterService registerService;
	
	@RequestMapping("/jobSeeker")
	public String getJobSeekerProfile(@RequestParam("jobSeekerId") int id, @ModelAttribute("loginDetails") Login detailsLogin, @ModelAttribute("registerDetails") Register detailRegister,  Model model) {
		//adding all attributes of registerDetails to jobSeekerDetails for using in homepage.jsp page of Job Seeker
		
		/* finding registration details by id  */
		Register register = registerService.getJobSeeker(id);
        model.addAttribute("jobSeekerDetails", register);
       // System.out.println(detailsLogin.getEmail());
		return "jobSeekerHomepage";
	
		
	}
	

	
	@RequestMapping("/recruiter")
	public String getRecruiterProfile(@ModelAttribute("registerDetails") Register detailsRegister, Model model) {
		
		//adding all attributes of registerDetails to recruiterDetails for using in JSP page of recruiter
		model.addAttribute("recruiterDetails", detailsRegister);
		return "recruiterHomepage";
	}
	
/*	
	//Profile menu
	@RequestMapping("/jobSeekerProfile")
	public String displayProfilePage(Model model) {
		JobSeekerProfile profile  = new JobSeekerProfile();
		model.addAttribute("jobSProfile", profile);
		return "redirect:/profile/jobSeekerProfile";
	}
*/	
	/*
	Jobs menu
	@RequestMapping("/jobs")
	public String displayJobsPage(@ModelAttribute("registerDetails") Register detailsRegister, Model model) {
		Jobs job = new Jobs();
		model.addAttribute("jobpage", job);
		model.addAttribute("registerDetails", detailsRegister);
		return "redirect:/jobs/displayJobs";
	}
	
	*/
}
