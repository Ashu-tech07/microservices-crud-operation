package com.crudoperation.controller;

import com.crudoperation.model.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudoperation.service.UserService;

@CrossOrigin(allowedHeaders = "*", origins = "*")
@RestController
@RequestMapping("/users")
public class UserContoller {
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@GetMapping("/{userId}")
	public User getUserById(@PathVariable Long userId) {
		return userService.getUserById(userId);
	}
	
	@PostMapping
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	
	@PutMapping("/{userId}")
	public User updateUser(@PathVariable Long userId,@RequestBody  User user) {
		return userService.updateUser(userId, user);
	}
	
	@DeleteMapping("/{userId}")
	public void deleteUser(@PathVariable Long userId) {
		userService.deleteUser(userId);
	}
	

}
