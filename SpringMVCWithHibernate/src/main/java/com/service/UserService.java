package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.User;
import com.dao.UserDao;

@Service
public class UserService {

	@Autowired
	UserDao userDao;

	

	public String updateUser(User user) {
		if (userDao.updateUser(user) > 0) {
			return "Record updated successfully";
		} else {
			return "Record didn't update give Correct Id feild";
		}
	}

	public String searchUserById(int id) {
		User p = userDao.searchUserById(id);
		if (p == null) {
			return "Record not present";
		} else {
			return p.toString();
		}
	}


}
