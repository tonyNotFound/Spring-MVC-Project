package com.spring.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.model.Login;
import com.spring.model.Register;
import com.spring.service.RegisterService;




@Controller
@RequestMapping("/login")
public class LoginController {


	@Autowired
	private RegisterService registerService;
	
	@RequestMapping("/loginFormDisplay")
	public String returnForm(Model model) {
		Login detailsLogin = new Login();
		model.addAttribute("loginDetails", detailsLogin);
		return "login";
	}
	

	@RequestMapping("/processLoginForm")
	public String returnHomepage(@Valid @ModelAttribute("loginDetails") Login detailsLogin, BindingResult bindingResult, @RequestParam("email") String email ,@RequestParam("password") String password, Model model){
		
		if(bindingResult.hasErrors()) {
			return "login";
		}
		else {
			System.out.println(email);
			int id = registerService.getRegsiteredUserId(email);
			String userType = registerService.getUserTypeByEmail(email, password);
			model.addAttribute("loginDetails", detailsLogin);
			if(userType.equals("jobSeeker")) {
				//sending parameter jobSeeker id to get details associated by ID.
				return "redirect:/homepage/jobSeeker?" + "jobSeekerId="+id;
			}
			else {
				return "redirct:/homepage/recruiter/" + id;
			}
		}
		
	}
}
