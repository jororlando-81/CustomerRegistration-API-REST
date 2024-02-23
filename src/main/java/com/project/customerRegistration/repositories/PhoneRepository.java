package com.project.customerRegistration.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.customerRegistration.entities.Phone;

public interface PhoneRepository extends JpaRepository<Phone, Long> {

}
