package com.emobile.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emobile.application.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
