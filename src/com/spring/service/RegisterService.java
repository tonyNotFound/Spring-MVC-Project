package com.spring.service;


import com.spring.model.Register;

public interface RegisterService {

	public void saveRegister(Register detailsRegister);

	public Register getJobSeeker(int id);


}
