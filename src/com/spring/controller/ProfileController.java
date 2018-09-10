package com.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProfileController {

	@RequestMapping("/profilePage")
	public String displayProfile(HttpServletRequest request, Model model) {
		
		String firstName = request.getParameter("firstname");

		if(firstName.charAt(0) > 90 )
		firstName = (char)((firstName.charAt(0) - 32 )) + firstName.substring(1) + " !";
		
		String lastName = request.getParameter("lastname");
		
		String email = request.getParameter("email");
		
		String displayUserName = "Hi " +firstName;
		
		model.addAttribute("username", displayUserName);
		return "profile";
	}
	
}
