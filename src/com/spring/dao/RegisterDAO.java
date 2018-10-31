package com.spring.dao;


import com.spring.model.Register;

public interface RegisterDAO {

	
	public void saveRegister(Register detailsRegister);

	public Register getJobSeeker(int id);

	public int getRegisteredUserId(String email);
<<<<<<< HEAD
	
	public String checkUserExists(String email);
=======
>>>>>>> branch 'master' of https://github.com/neha9029/Spring-MVC-Project.git

	public String getUserTypeByEmail(String email, String password);

}
