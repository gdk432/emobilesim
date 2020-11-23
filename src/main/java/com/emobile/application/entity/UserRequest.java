package com.emobile.application.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

/**
 * @author Mithun Bhadra
 */
@Entity
@Table(name = "userrequest")
public class UserRequest implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name = "request_id")
	private Integer requestId;
	
	@NotEmpty(message = "userName not be empty")
	@Column(name = "user_name")
	private String userName;
	
	@Email
	@Column(name = "user_email" ,unique = true )
	private String userEmail;
	
	@NotEmpty(message = "userPanNo not be empty")
	@Column(name = "user_pan_no",unique = true )
	private String userPanNo;
	
	@Column(name = "user_plan_id")
	private Integer userPlanId;
	
	@NotEmpty(message = "userRequestStatus not be empty")
	@Column(name = "user_request_status")
	private String userRequestStatus;
	
	@Column(name = "user_request_DateTime")
	private LocalDateTime userRequestDateTime;
	
	@Column(name = "approver_user_id")
	private Integer approverUserId;
	
	public UserRequest() {}
	
	
	
	public UserRequest(Integer requestId, String userName, String userEmail, String userPanNo, Integer userPlanId,
			String userRequestStatus, LocalDateTime userRequestDateTime, Integer approverUserId) {
		super();
		this.requestId = requestId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPanNo = userPanNo;
		this.userPlanId = userPlanId;
		this.userRequestStatus = userRequestStatus;
		this.userRequestDateTime = userRequestDateTime;
		this.approverUserId = approverUserId;
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
