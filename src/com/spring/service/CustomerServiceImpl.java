package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.RegisterDAO;

@Service
public class CustomerServiceImpl implements RegisterService {

	
	@Autowired
	private RegisterDAO registerDAO;
	
	
}
