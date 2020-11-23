package com.emobile.application.dto;

import java.time.LocalDateTime;

import com.emobile.application.entity.UserRequest;

public class UserRequestResponseDto {

	private Integer requestId;
	private String userName;
	private String userEmail;
	private String userPanNo;
	private Integer userPlanId;
	private String userRequestStatus;
	private LocalDateTime userRequestDateTime;
	private Integer approverUserId;
	
	public UserRequestResponseDto() {}
	public UserRequestResponseDto(UserRequest userRequest) {
		super();
		this.requestId = userRequest.getRequestId();
		this.userName = userRequest.getUserName();
		this.userEmail = userRequest.getUserEmail();
		this.userPanNo = userRequest.getUserPanNo();
		this.userPlanId = userRequest.getUserPlanId();
		this.userRequestStatus = userRequest.getUserRequestStatus();
		this.userRequestDateTime = userRequest.getUserRequestDateTime();
		this.approverUserId = userRequest.getApproverUserId();
	}
	
	
	public Integer getRequestId() {
		return requestId;
	}
	public void setRequestId(Integer requestId) {
		this.requestId = requestId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPanNo() {
		return userPanNo;
	}
	public void setUserPanNo(String userPanNo) {
		this.userPanNo = userPanNo;
	}
	public Integer getUserPlanId() {
		return userPlanId;
	}
	public void setUserPlanId(Integer userPlanId) {
		this.userPlanId = userPlanId;
	}
	public String getUserRequestStatus() {
		return userRequestStatus;
	}
	public void setUserRequestStatus(String userRequestStatus) {
		this.userRequestStatus = userRequestStatus;
	}
	public LocalDateTime getUserRequestDateTime() {
		return userRequestDateTime;
	}
	public void setUserRequestDateTime(LocalDateTime userRequestDateTime) {
		this.userRequestDateTime = userRequestDateTime;
	}
	public Integer getApproverUserId() {
		return approverUserId;
	}
	public void setApproverUserId(Integer approverUserId) {
		this.approverUserId = approverUserId;
	}

	
}
