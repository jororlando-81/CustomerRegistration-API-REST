package com.project.customerRegistration.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.customerRegistration.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
