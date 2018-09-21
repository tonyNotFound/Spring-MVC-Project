package com.spring.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Required;

public class Register {
	
	
	
	private String firstName;
	private String lastName;
	
	@NotNull(message="is required")
	@Size(min = 4, message="is required")
	private String email;
	
	@NotNull(message="is required")
	@Size(min = 4, message="is required")
	private String password;
	
	
	private String country;
	
	
	
	private String userType;
	private String terms;
	
	
	public Register() {
		
	}
	
	public String getTerms() {
		return terms;
	}

	public void setTerms(String terms) {
		this.terms = terms;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}



}
