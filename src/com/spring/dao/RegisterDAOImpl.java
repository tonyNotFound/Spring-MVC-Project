package com.spring.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.model.Register;

@Repository
public class RegisterDAOImpl implements RegisterDAO {

	
	//inject Session Factory
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveRegister(Register detailsRegister) {
		// TODO Auto-generated method stub
		
		//get hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		
		try {
	
		currentSession.save(detailsRegister);
		System.out.println(currentSession);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			currentSession.close();
		}
	}
}
