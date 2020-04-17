package com.gk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gk.model.User;
import com.gk.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/add")
	public User saveUser(@RequestBody User user) {
	    
		return userService.save(user);
	}
	
	@PutMapping("/update/{userLogin}")
	public User updateUser(@RequestBody User user , @PathVariable("userLogin") String userLogin) {
		
		return userService.update(user);
	}

}
