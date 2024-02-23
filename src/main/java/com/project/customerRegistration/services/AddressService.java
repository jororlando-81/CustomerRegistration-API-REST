package com.project.customerRegistration.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.customerRegistration.entities.Address;
import com.project.customerRegistration.repositories.AddressRepository;



@Service
public class AddressService {
	
	@Autowired
	private AddressRepository addressRepository;
	
	public Address insert ( Address address ) {
		  
		return addressRepository.save(address);
	}
	
	

}
