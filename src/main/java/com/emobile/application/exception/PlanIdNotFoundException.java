package com.emobile.application.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class PlanIdNotFoundException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public PlanIdNotFoundException(String message) {
		super(message);
	}

	public PlanIdNotFoundException(String message, Throwable t) {
		super(message, t);
	}
}
