package com.bookmyshow.utility;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class ResponseStructural<T> {
	private final int statusCode;
	private final String message;
	private final T data;
	}
