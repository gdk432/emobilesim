package com.emobile.application.controller;


import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emobile.application.dto.UserRequestDto;
import com.emobile.application.dto.UserRequestTrackResponseDto;
import com.emobile.application.dto.UserResponseDto;
import com.emobile.application.exception.PlanIdNotFoundException;
import com.emobile.application.exception.RequestIdNotFoundException;
import com.emobile.application.service.UserRequestService;
import com.emobile.application.service.UserRequestTrackService;

@RestController
@RequestMapping("/sim")
public class UserRequestController {

	
	@Autowired
	UserRequestService userRequestService;
	
	@Autowired
	UserRequestTrackService  userRequestTrackService;
	
	@PostMapping("/simregestration")
	public UserResponseDto simRequest(@RequestBody UserRequestDto  userRequestDto) throws PlanIdNotFoundException {
		return userRequestService.simRegistration(userRequestDto);
	}
	
	@GetMapping("/track/{requestId}")
	public UserRequestTrackResponseDto trackRequest(@PathVariable Integer requestId) throws RequestIdNotFoundException {
		return userRequestTrackService.trackRequest(requestId);
	}
}
