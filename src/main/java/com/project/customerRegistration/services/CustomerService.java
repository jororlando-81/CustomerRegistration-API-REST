package com.project.customerRegistration.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.customerRegistration.entities.Customer;
import com.project.customerRegistration.repositories.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public Customer insert ( Customer customer ) {
		  return customerRepository.save(customer);
	}
	
	public List<Customer> findAll () {
		return 	customerRepository.findAll();
	}


}
