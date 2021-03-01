package com.techtraining.employeemanager.exception;

public class UserNotFoundException  extends RuntimeException{

	public UserNotFoundException(String message) {
		super(message);
	}
}
