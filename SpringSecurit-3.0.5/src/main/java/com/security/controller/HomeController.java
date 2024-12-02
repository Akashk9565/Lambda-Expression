package com.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.entity.User;
import com.security.service.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {

	@Autowired
	private UserService userService;
	
	//@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/createUsers")
	public User createUser(@RequestBody User user) {
		User createUser = userService.createUser(user);
		return user;
	}
	
	//@PreAuthorize("hasRole('NORMAL','ADMIN')")
	@GetMapping("/getUsers")
	public List<User> getAllUser(){
		List<User> allUser = userService.getAll();
		return allUser;
	}
	
	//@PreAuthorize("hasRole('NORMAL')")
	@GetMapping("/normal")
	public ResponseEntity<String> normalUser() {
		return ResponseEntity.ok("Yes, I am Normal User");
	}
	
	//@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/admin")
	public ResponseEntity<String> adminUser() {
		return ResponseEntity.ok("Yes, I am Admin User");
	}
	
	@GetMapping("/public")
	public ResponseEntity<String> publicUser() {
		return ResponseEntity.ok("Yes, I am Public User");
	}
	
	
}
