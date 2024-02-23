package com.project.customerRegistration.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.customerRegistration.entities.Phone;
import com.project.customerRegistration.repositories.PhoneRepository;

@Service
public class PhoneService {
	
	@Autowired
	private PhoneRepository phoneRepository;
	
	public Phone insert ( Phone phone ) {
		  
		return phoneRepository.save(phone);
	}
	
	
}
