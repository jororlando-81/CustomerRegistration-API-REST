package com.project.customerRegistration.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.customerRegistration.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
