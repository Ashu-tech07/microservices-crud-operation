package com.crudoperation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudoperation.model.User;
import com.crudoperation.repository.UserRepository;

@Service
public class UserServiceImp implements UserService {
	
 @Autowired
 private UserRepository userRepository;
 
 @Override
 public List<User> getAllUsers(){
	 return userRepository.findAll();
 }
 
 @Override
 public User getUserById(Long userId) {
	
	 return userRepository.findById(userId).orElseThrow(()->new RuntimeException("User not found!!"));
	
 }
 
 @Override
 public User createUser(User user) {
	 return userRepository.save(user);
 }
 
 @Override
 public User updateUser(Long id, User updatedUser) {
	 User existingUser=getUserById(id);
	 existingUser.setUsername(updatedUser.getUsername());
	 existingUser.setEmail(updatedUser.getEmail());
	 existingUser.setCity(updatedUser.getCity());
	 return userRepository.save(existingUser);		 
 }
 
 @Override
 public void deleteUser(Long userId) {
	 userRepository.deleteById(userId);
	 
 }
}
