package com.emobile.application.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.emobile.application.UserApplication;
import com.emobile.application.dto.UserRequestDto;
import com.emobile.application.dto.UserResponseDto;
import com.emobile.application.entity.UserRequest;
import com.emobile.application.exception.PlanIdNotFoundException;
import com.emobile.application.repository.UserRequestRepository;

@ExtendWith(MockitoExtension.class)
public class UserRequestServiceImplTest extends UserApplication {

	@Mock
	UserRequestRepository userRequestRepository;
	
	@InjectMocks
	UserRequestServiceImpl userRequestServiceImpl;
	
	static UserRequest userRequest;
	static UserRequestDto userRequestDto;
	static UserResponseDto userResponseDto;
	@BeforeAll
	public static void setUp() {
		userRequest = new UserRequest();
		userRequest.setUserEmail("deve@gmail.com");
		userRequest.setUserName("Devendra");
		userRequest.setUserPanNo("BAWQ");
		userRequest.setUserPlanId(1);
		userRequest.setApproverUserId(0);
		userRequest.setUserRequestDateTime(LocalDateTime.now());
		userRequest.setUserRequestStatus("inprogress");
		userRequestDto = new UserRequestDto();
		userRequestDto.setUserEmail("deve@gmail.com");
		userRequestDto.setUserName("Devendra");
		userRequestDto.setUserPanNo("BAWQ");
		userRequestDto.setUserPlanId(1);
		userResponseDto.setRequestId(11);
		userResponseDto.setMessage("requesed placed sucessuly");
	}
	
	@Test
	public void simRegistrationTest() throws PlanIdNotFoundException {
		when(userRequestRepository.save(userRequest)).thenReturn(userRequest);
		UserRequest result;
		assertEquals(userRequest, result);
		
	}
	
}
