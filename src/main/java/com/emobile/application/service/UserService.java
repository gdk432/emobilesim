package com.emobile.application.service;

import java.util.List;

import com.emobile.application.dto.UserRequestResponseDto;

public interface UserService {

	List<UserRequestResponseDto> getUserRequests(String message);
}
