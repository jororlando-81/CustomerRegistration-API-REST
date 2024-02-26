package com.project.customerRegistration.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.customerRegistration.entities.User;
import com.project.customerRegistration.repositories.UserRepository;



@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public User insert ( User user ) {
		  
		return userRepository.save(user);
	}
	
	

}
