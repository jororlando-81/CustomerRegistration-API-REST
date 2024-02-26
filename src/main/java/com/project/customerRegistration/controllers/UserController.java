package com.project.customerRegistration.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.customerRegistration.entities.User;
import com.project.customerRegistration.services.UserService;


@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping
	public ResponseEntity<User> insert ( @RequestBody User user){
		User newUser  = userService.insert(user) ;
		return ResponseEntity.ok().body(newUser);  
	}

}
