package com.emobile.application.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emobile.application.constant.UserConstant;
import com.emobile.application.dto.UserRequestTrackResponseDto;
import com.emobile.application.entity.UserRequest;
import com.emobile.application.exception.RequestIdNotFoundException;
import com.emobile.application.repository.UserRequestRepository;
import com.emobile.application.service.UserRequestTrackService;

@Service
public class UserRequestTrackServiceImpl implements UserRequestTrackService{

	@Autowired
	UserRequestRepository  userRequestRepository;
	@Override
	public UserRequestTrackResponseDto trackRequest(Integer requestId) throws RequestIdNotFoundException {
		UserRequestTrackResponseDto userRequestTrackResponseDto = new UserRequestTrackResponseDto();
		Optional<UserRequest> userRequest = userRequestRepository.findById(requestId);
		
		if(!userRequest.isPresent()) {
			throw new RequestIdNotFoundException(UserConstant.REQUSRIDNOTFOUND);
		}
		UserRequest request = userRequest.get();
		userRequestTrackResponseDto.setRequestId(request.getRequestId());
		userRequestTrackResponseDto.setStatus(request.getUserRequestStatus());
		userRequestTrackResponseDto.setRequestedTIme(request.getUserRequestDateTime());
		
		return userRequestTrackResponseDto;
	}

}
