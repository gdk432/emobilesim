package com.emobile.application.service.impl;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emobile.application.constant.UserConstant;
import com.emobile.application.dto.TariffResponse;
import com.emobile.application.dto.UserRequestDto;
import com.emobile.application.dto.UserResponseDto;
import com.emobile.application.entity.UserRequest;
import com.emobile.application.exception.PlanIdNotFoundException;
import com.emobile.application.feignclient.TarifPlanServiceProxy;
import com.emobile.application.repository.UserRequestRepository;
import com.emobile.application.service.UserRequestService;

@Service
public class UserRequestServiceImpl implements UserRequestService  {

	@Autowired
	TarifPlanServiceProxy tarifPlanServiceProxy;
	
	@Autowired
	UserRequestRepository userRequestRepository;
	
	@Override
	public UserResponseDto simRegistration(UserRequestDto userRequestDto) throws PlanIdNotFoundException {
		
		//Optional<TariffResponse> tariffResponse  = tarifPlanServiceProxy.getPlanId(userRequestDto.getPlanId());
		//if(!tariffResponse.isPresent()) {
		//	throw new PlanIdNotFoundException(UserConstant.PLANNOTFOUND);
		//}
		
		UserRequest userRequest = new  UserRequest();
		userRequest.setUserEmail(userRequestDto.getUserEmail());
		userRequest.setUserPanNo(userRequestDto.getUserPanNo());
		userRequest.setUserName(userRequestDto.getUserName());
		userRequest.setUserPlanId(userRequestDto.getUserPlanId());
		userRequest.setApproverUserId(2);
		userRequest.setUserRequestStatus(UserConstant.INSTATUS);
		userRequest.setUserRequestDateTime(LocalDateTime.now());
		
		userRequestRepository.save(userRequest);
		UserResponseDto userResponseDto = new UserResponseDto();
		userResponseDto.setRequestId(userRequest.getRequestId());
		userResponseDto.setMessage(UserConstant.REQUESTMESSAGE);
		return userResponseDto;
	}

}
