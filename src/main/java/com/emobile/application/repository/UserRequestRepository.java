package com.emobile.application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emobile.application.entity.UserRequest;

@Repository
public interface UserRequestRepository extends JpaRepository<UserRequest, Integer> {

	List<UserRequest> findByuserRequestStatus(String message);

}
