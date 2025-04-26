package com.bookmyshow.utility;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
@Component
public abstract class BuilderResponseStructural {
	public static <T> ResponseEntity<ResponseStructural<T>> success(HttpStatus status, String successMessage, T data) {
		return ResponseEntity.status(status).body(
				ResponseStructural.<T>builder().data(data).message(successMessage).statusCode(status.value()).build());
	}

	public static <T> ResponseEntity<ResponseStructural<T>> error(HttpStatus status, String successMessage, T data) {
		return new ResponseEntity<ResponseStructural<T>>(
				ResponseStructural.<T>builder().data(data).message(successMessage).statusCode(status.value()).build(),
				status);
	}
}
