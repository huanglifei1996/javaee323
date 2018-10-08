package com.itheima.service;

import java.sql.SQLException;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;

public class UserService {

	public User login(String username, String password) throws SQLException {
		UserDao userDao = new UserDao();
		
		return userDao.login(username,password);
	}
	}
