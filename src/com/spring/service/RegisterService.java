package com.spring.service;


import com.spring.model.Register;

public interface RegisterService {

	public void saveRegister(Register detailsRegister);

	public Register getJobSeeker(int id);

	public int getRegsiteredUserId(String email);

	public String getUserTypeByEmail(String email, String password);

<<<<<<< HEAD
	public String checkUserExists(String email);
=======
>>>>>>> branch 'master' of https://github.com/neha9029/Spring-MVC-Project.git

}
