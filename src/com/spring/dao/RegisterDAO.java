package com.spring.dao;


import com.spring.model.Register;

public interface RegisterDAO {

	
	public void saveRegister(Register detailsRegister);

	public Register getJobSeeker(int id);

	public int getRegisteredUserId(String email);
	
	public String checkUserExists(String email);

	public String getUserTypeByEmail(String email, String password);

}
