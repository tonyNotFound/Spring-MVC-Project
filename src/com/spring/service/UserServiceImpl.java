package com.spring.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.RegisterDAO;
import com.spring.model.Register;

@Service
public class UserServiceImpl implements RegisterService {

	
	@Autowired
	private RegisterDAO registerDAO;

	@Override
	@Transactional
	public void saveRegister(Register detailsRegister) {
		// TODO Auto-generated method stub
		
		registerDAO.saveRegister(detailsRegister);
	}

	@Override
	@Transactional
	public Register getJobSeeker(int id) {
		// TODO Auto-generated method stub
		
		
		return registerDAO.getJobSeeker(id);
	}

	@Override
	@Transactional
	public int getRegsiteredUserId(String email) {
		// TODO Auto-generated method stub
		return registerDAO.getRegisteredUserId(email);
	}

	@Override
	@Transactional
	public String getUserTypeByEmail(String email, String password) {
		// TODO Auto-generated method stub
		return registerDAO.getUserTypeByEmail(email, password);
	}
	
	
	
}
