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
		
	}

	@Override
	public Register getJobSeeker(int id) {
		// TODO Auto-generated method stub
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		Register jobSeeker = currentSession.get(Register.class, id);
		
		return jobSeeker;
	}

	@Override
	public int getRegisteredUserId(String emailString) {
		// TODO Auto-generated method stub
		
		Session currentSession = sessionFactory.getCurrentSession();
		int id  = (int) currentSession.createQuery("Select id from Register l where email = :email").setParameter("email", emailString).uniqueResult();
		System.out.println("id is" +id);
		
		return id;
	}

	@Override
	public String getUserTypeByEmail(String email, String password) {
		// TODO Auto-generated method stub
		
		Session currentSession = sessionFactory.getCurrentSession();
		String userType = (String) currentSession.createQuery("Select userType from Register where email = :email and password = :password").
				setParameter("email",email).setParameter("password", password).uniqueResult();
		
		return userType;
	}

	@Override
	public String checkUserExists(String email) {
		// TODO Auto-generated method stub
		
		Session currentSession = sessionFactory.getCurrentSession();
		String emailExists =(String) currentSession.createQuery("Select email from Register where email = :email").setParameter("email", email).uniqueResult();
		return emailExists;
	}
}
