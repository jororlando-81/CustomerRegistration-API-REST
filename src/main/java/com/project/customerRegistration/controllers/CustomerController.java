package com.project.customerRegistration.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.customerRegistration.entities.Customer;
import com.project.customerRegistration.services.CustomerService;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping
	public ResponseEntity<Customer> insert ( @RequestBody Customer customer){
		Customer newCustomer  = customerService.insert(customer) ;
		return ResponseEntity.ok().body(newCustomer);  
	}
	
	@GetMapping
	public ResponseEntity<  List <Customer>  > findALL(){
		List <Customer> listCustomers = customerService.findAll();
		return ResponseEntity.ok().body(listCustomers);
	}
	
	
}


