package com.gk.service.impl;

import org.springframework.stereotype.Service;

import com.gk.model.User;
import com.gk.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private User user;
	
	@Override
	public User save(User user) {
		this.user = user;
		return this.user;
	}

	@Override
	public User update(User user) {
		this.user.setDepartmentId(user.getDepartmentId());
		this.user.setDepartmentName(user.getDepartmentName());
		this.user.setDisplayName(user.getDisplayName());
		this.user.setEmail(user.getEmail());
		this.user.setFirstName(user.getFirstName());
		this.user.setLastName(user.getLastName());
		this.user.setUserLogin(user.getUserLogin());
		this.user.setTelephoneNumber(user.getTelephoneNumber());
		return this.user;
	}

}
