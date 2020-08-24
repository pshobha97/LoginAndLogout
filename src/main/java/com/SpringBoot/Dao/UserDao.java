package com.SpringBoot.Dao;

import com.SpringBoot.Entity.User;

public interface UserDao {
	

	public User login(String userName, String password);

}
