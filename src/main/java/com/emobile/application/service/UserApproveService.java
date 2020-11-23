package com.emobile.application.service;

import com.emobile.application.exception.RequestIdNotFoundException;
import com.emobile.application.exception.UserNotFoundException;

public interface UserApproveService {

	public String approveRequest(Integer userId, Integer requestId, String message) throws RequestIdNotFoundException, UserNotFoundException;


}
