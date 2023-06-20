package com.spring.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.spring.Model.User;
import com.spring.dao.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository ur;
	

	public String register(User user) {
		 Optional<User> usr = ur.findByusername(user.getUsername());
		 if(usr.isPresent()) {
			 return "user is already exist";
		 }
		 else {
			 ur.save(user);
			 return "user registered successfully";
		 }
	}

}
