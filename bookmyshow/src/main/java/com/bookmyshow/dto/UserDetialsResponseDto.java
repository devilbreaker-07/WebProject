package com.bookmyshow.dto;

import java.time.LocalDate;

import com.bookmyshow.role.UserRole;

public record UserDetialsResponseDto(String userId,String firstName, String lastName, String email, UserRole userRole, String phoneNumber,
		LocalDate dateOfBirth, long createdAt, long updatedAt) {

}
