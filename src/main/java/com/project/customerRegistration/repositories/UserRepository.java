package com.project.customerRegistration.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.customerRegistration.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
