package com.emobile.application.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emobile.application.constant.UserConstant;
import com.emobile.application.entity.User;
import com.emobile.application.entity.UserRequest;
import com.emobile.application.exception.RequestIdNotFoundException;
import com.emobile.application.exception.UserNotFoundException;
import com.emobile.application.repository.UserRepository;
import com.emobile.application.repository.UserRequestRepository;
import com.emobile.application.service.UserApproveService;

@Service
public class UserApproveServiceImpl implements UserApproveService {
	@Autowired
    UserRequestRepository userRequestRepository;
   
    @Autowired
    UserRepository userRepository;
   
    @Override
    public String approveRequest(Integer userId, Integer requestId, String message) throws RequestIdNotFoundException, UserNotFoundException {
       
        Optional<User> user = userRepository.findById(userId);
        if(!user.isPresent()) {
            throw new UserNotFoundException(UserConstant.REQUSRIDNOTFOUND);
        }
       
        Optional<UserRequest> request = userRequestRepository.findById(requestId);
       
        if(!request.isPresent()) {
            throw new RequestIdNotFoundException(UserConstant.REQUSRIDNOTFOUND);
        }
        UserRequest userRequest = request.get();
       
        if(message.equalsIgnoreCase(UserConstant.APPROVEDMESSAGE)) {
            userRequest.setUserRequestStatus(UserConstant.UAPPROVEDMESSAGE);
            userRequest.setApproverUserId(userId);
            userRequestRepository.save(userRequest);
            return UserConstant.REQUESTUPDATE;
        }
       
        else if (message.equalsIgnoreCase(UserConstant.REJECTEDMESSAGE)) {
            userRequest.setUserRequestStatus(UserConstant.UREJECTEDMESSAGE);   
            userRequest.setApproverUserId(userId);
            userRequestRepository.save(userRequest);
            return UserConstant.REQUESTUPDATE;
        }
       
        return UserConstant.REQUESTUPDATEFAILED;
    }
	


}
