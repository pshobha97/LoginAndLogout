package com.SpringBoot.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.Dao.UserDao;
import com.SpringBoot.Entity.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	@Transactional
	public User login(String userName, String password) {
		
		return userDao.login(userName, password);
	}

}
