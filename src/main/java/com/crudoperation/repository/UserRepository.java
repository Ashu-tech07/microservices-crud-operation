package com.crudoperation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudoperation.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
