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
	
	
}
