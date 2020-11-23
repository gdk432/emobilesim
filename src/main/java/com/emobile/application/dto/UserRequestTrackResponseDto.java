package com.emobile.application.dto;

import java.time.LocalDateTime;

public class UserRequestTrackResponseDto {

	private Integer requestId;
	private String status;
	private LocalDateTime requestedTIme;
	
	public Integer getRequestId() {
		return requestId;
	}
	public void setRequestId(Integer requestId) {
		this.requestId = requestId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDateTime getRequestedTIme() {
		return requestedTIme;
	}
	public void setRequestedTIme(LocalDateTime requestedTIme) {
		this.requestedTIme = requestedTIme;
	}
	
}
