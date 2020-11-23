package com.emobile.application.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emobile.application.dto.UserRequestResponseDto;
import com.emobile.application.entity.UserRequest;
import com.emobile.application.repository.UserRequestRepository;
import com.emobile.application.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRequestRepository userRequestRepository;

	@Override
	public List<UserRequestResponseDto> getUserRequests(String message) {
		List<UserRequestResponseDto> userRequestResponseDtoList = new ArrayList<UserRequestResponseDto>();
		UserRequestResponseDto userRequestResponseDto = new UserRequestResponseDto();
		List<UserRequest> userRequest = userRequestRepository.findByuserRequestStatus(message);

		userRequest.stream().map(UserRequestResponseDto::new).collect(Collectors.toCollection(ArrayList::new));

		return userRequestResponseDtoList;
	}

}
