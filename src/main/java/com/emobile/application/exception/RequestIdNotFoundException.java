package com.emobile.application.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RequestIdNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;

	public RequestIdNotFoundException(String message) {
		super(message);
	}

	public RequestIdNotFoundException(String message, Throwable t) {
		super(message, t);
	}
}
