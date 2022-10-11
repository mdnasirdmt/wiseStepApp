package com.wiseStep.exceptions;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
public class ApiNotFoundException extends RuntimeException {

	public ApiNotFoundException(String message) {
		super(message);

	}

}
