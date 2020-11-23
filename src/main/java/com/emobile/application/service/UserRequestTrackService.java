package com.emobile.application.service;

import com.emobile.application.dto.UserRequestTrackResponseDto;
import com.emobile.application.exception.RequestIdNotFoundException;

public interface UserRequestTrackService {

	UserRequestTrackResponseDto trackRequest(Integer requestId) throws RequestIdNotFoundException;

}
