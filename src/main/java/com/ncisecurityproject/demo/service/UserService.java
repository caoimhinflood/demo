package com.ncisecurityproject.demo.service;

import com.ncisecurityproject.demo.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
