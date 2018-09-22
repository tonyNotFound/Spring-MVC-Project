package com.spring.dao;


import com.spring.model.Register;

public interface RegisterDAO {

	
	public void saveRegister(Register detailsRegister);

	public Register getJobSeeker(int id);

}
