package com.security.service;

import java.util.List;

import com.security.entity.User;

public interface UserService {
	
	User  createUser(User user);
	
	List<User> getAll();

}
