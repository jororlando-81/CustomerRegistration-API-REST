package com.project.customerRegistration.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.customerRegistration.entities.Phone;
import com.project.customerRegistration.services.PhoneService;


@RestController
@RequestMapping(value = "/phone")
public class PhoneController {
	
	@Autowired
	private PhoneService phoneService;
	
	@PostMapping
	public ResponseEntity<Phone> insert ( @RequestBody Phone phone){
		Phone newPhone  = phoneService.insert(phone) ;
		return ResponseEntity.ok().body(newPhone);  
	}
	
	
}
