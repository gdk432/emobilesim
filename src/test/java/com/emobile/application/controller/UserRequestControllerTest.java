package com.emobile.application.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.emobile.application.UserApplication;
import com.emobile.application.dto.UserRequestDto;
import com.emobile.application.dto.UserResponseDto;
import com.emobile.application.exception.PlanIdNotFoundException;
import com.emobile.application.service.UserRequestService;
import com.emobile.application.service.UserRequestTrackService;

@ExtendWith(MockitoExtension.class)
public class UserRequestControllerTest extends UserApplication {

	@Mock
	UserRequestService userRequestService;
	
	@Mock
	UserRequestTrackService  userRequestTrackService;
	
	@InjectMocks
	UserRequestController userRequestController;
	
	static UserRequestDto userRequestDto;
	static UserResponseDto userResponseDto;
	@BeforeAll
	public static void setUp() {
		userRequestDto = new UserRequestDto();
		userRequestDto.setUserEmail("deve@gmail.com");
		userRequestDto.setUserName("Devendra");
		userRequestDto.setUserPanNo("BAWQ");
		userRequestDto.setUserPlanId(1);
		userResponseDto = new UserResponseDto();
		userResponseDto.setRequestId(11);
		userResponseDto.setMessage("requesed placed sucessuly");
	}
	
	@Test
	public void simRequestTest() throws PlanIdNotFoundException {
	
		when(userRequestService.simRegistration(userRequestDto)).thenReturn(userResponseDto);
		UserResponseDto result;
		result = userRequestController.simRequest(userRequestDto);
		assertEquals(userResponseDto, result);
		
	}
}
