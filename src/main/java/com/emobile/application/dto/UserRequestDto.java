package com.emobile.application.dto;

/**
 * @author Mithun Bhadra
 *
 */
public class UserRequestDto {

	
	private String userName;
	private String userEmail;
	private String userPanNo;
	private Integer userPlanId;
	

	public UserRequestDto() {
	}

	public UserRequestDto( String userName, String userEmail, String userPanNo, Integer userPlanId,
			String requestStatus) {
		super();
		
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPanNo = userPanNo;
		this.userPlanId = userPlanId;
		
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

	

	

}
