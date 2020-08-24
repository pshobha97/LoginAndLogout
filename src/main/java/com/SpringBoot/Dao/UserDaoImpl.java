package com.SpringBoot.Dao;


import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.SpringBoot.Entity.User;
@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private EntityManager entityManager;
	

	public User login(String userName, String password) {
		Session currentSession=entityManager.unwrap(Session.class);
		Query<User> theQuery=  currentSession.createQuery("from User where userName=:name and userPassword=:password");
		theQuery.setParameter("name", userName);
		theQuery.setParameter("password", password);
		User user=   theQuery.uniqueResult();
		
		
		
		return user;
	}

}
