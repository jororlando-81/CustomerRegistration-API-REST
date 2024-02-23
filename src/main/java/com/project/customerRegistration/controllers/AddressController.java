package com.project.customerRegistration.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.customerRegistration.entities.Address;
import com.project.customerRegistration.services.AddressService;


@RestController
@RequestMapping(value = "/address")
public class AddressController {
	
	@Autowired
	private AddressService addressService;
	
	@PostMapping
	public ResponseEntity<Address> insert ( @RequestBody Address address){
		Address newAddress  = addressService.insert(address) ;
		return ResponseEntity.ok().body(newAddress);  
	}

}
