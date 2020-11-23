package com.emobile.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.emobile.application.dto.UserRequestResponseDto;
import com.emobile.application.exception.RequestIdNotFoundException;
import com.emobile.application.exception.UserNotFoundException;
import com.emobile.application.service.UserApproveService;
import com.emobile.application.service.UserService;

@RestController
@RequestMapping("/admin")
public class UserController {

	@Autowired
	UserService userService;

	@Autowired
	UserApproveService usserApproveService;

	@GetMapping("/fetchrequests")
	public List<UserRequestResponseDto> fetchRequests(@RequestParam String message) {
		return userService.getUserRequests(message);
	}


	@PostMapping("/updatestatus")
	    public String honorRequest(@RequestParam Integer userId, @RequestParam Integer requestId, @RequestParam String message) throws RequestIdNotFoundException, UserNotFoundException {
	        return usserApproveService.approveRequest(userId, requestId, message);
	    }
}
