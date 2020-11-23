package com.emobile.application.service;

import com.emobile.application.dto.UserRequestDto;
import com.emobile.application.dto.UserResponseDto;
import com.emobile.application.exception.PlanIdNotFoundException;

public interface UserRequestService {

	UserResponseDto simRegistration(UserRequestDto userRequestDto) throws PlanIdNotFoundException;

}
