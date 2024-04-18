package com.project.customerRegistration.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.project.customerRegistration.entities.Customer;
import com.project.customerRegistration.repositories.CustomerRepository;
import com.project.customerRegistration.services.exceptions.DatabaseException;
import com.project.customerRegistration.services.exceptions.ResourceNotFoundException;

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

	public Customer findById ( Long id )   {
		Optional<Customer> customer =  customerRepository.findById(id) ;
		return customer.orElseThrow( () -> new ResourceNotFoundException(id));
	}

	public void delete ( Long id ) {
		try {
				  customerRepository.deleteById(id);
		    }catch 	( EmptyResultDataAccessException e ) {
		          throw new ResourceNotFoundException(id) 	;
		    }catch 	( DataIntegrityViolationException e ) {
		          throw new DatabaseException(e.getMessage() );
		    }
	     }

	public Customer update ( Long id , Customer customer ) {
		  
		  Customer entity =  customerRepository.getReferenceById(id);
		  upDateData( entity , customer );
		  return customerRepository.save(entity);
	}

	private void upDateData(Customer entity, Customer customer) {
		
		entity.setName(customer.getName());
		entity.setIdentification(customer.getIdentification());
		entity.setMaritalstatus(customer.getMaritalstatus());
		entity.setGender(customer.getGender());
		entity.setBirth(customer.getBirth());
	}
	
	
	
}
