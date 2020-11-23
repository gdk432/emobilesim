package com.emobile.application.exception;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class GlobalResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value = UserNotFoundException.class)
	protected ResponseEntity<ErrorResponse> handleUserNotFoundException(UserNotFoundException userNotFoundException) {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setStatusCode("123");
		errorResponse.setStatusMessage(userNotFoundException.getMessage());

		return new ResponseEntity<ErrorResponse>(errorResponse, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value = PlanIdNotFoundException.class)
	protected ResponseEntity<ErrorResponse> handlePlanIdNotFoundException(PlanIdNotFoundException userNotFoundException) {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setStatusCode("124");
		errorResponse.setStatusMessage(userNotFoundException.getMessage());

		return new ResponseEntity<ErrorResponse>(errorResponse, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(value = RequestIdNotFoundException.class)
	protected ResponseEntity<ErrorResponse> handleRequestIdNotFoundException(RequestIdNotFoundException userNotFoundException) {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setStatusCode("125");
		errorResponse.setStatusMessage(userNotFoundException.getMessage());

		return new ResponseEntity<ErrorResponse>(errorResponse, HttpStatus.BAD_REQUEST);
	}
	
	

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setStatusCode("1234567");

		String errors = ex.getBindingResult().getFieldErrors().stream().map(e -> e.getDefaultMessage())
				.collect(Collectors.joining(","));
		errorResponse.setStatusMessage(errors);
		return new ResponseEntity<Object>(errorResponse, HttpStatus.BAD_REQUEST);
	}



}
