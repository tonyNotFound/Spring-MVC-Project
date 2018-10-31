package com.spring.service;


import com.spring.model.Register;

public interface RegisterService {

	public void saveRegister(Register detailsRegister);

	public Register getJobSeeker(int id);

	public int getRegsiteredUserId(String email);

	public String getUserTypeByEmail(String email, String password);

	public String checkUserExists(String email);

}
