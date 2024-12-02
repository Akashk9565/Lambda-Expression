package com.security.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.security.entity.User;
import com.security.entity.repo.UserRepository;
import com.security.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User createUser(User user) {
		userRepository.save(user);
		return null;
	}

	@Override
	public List<User> getAll() {
		List<User> findAll = userRepository.findAll();
		return findAll;
	}

}
