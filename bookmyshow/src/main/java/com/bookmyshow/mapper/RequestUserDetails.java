package com.bookmyshow.mapper;

import org.springframework.stereotype.Component;

import com.bookmyshow.dto.UserDetailsDto;
import com.bookmyshow.dto.UserDetialsResponseDto;
import com.bookmyshow.model.TheaterOwner;
import com.bookmyshow.model.User;
import com.bookmyshow.model.UserDetails;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class RequestUserDetails {

	public User createUser(UserDetailsDto userDetailsdto) {
		User user = new User();
		user.setFirstName(userDetailsdto.firstName());
		user.setLastName(userDetailsdto.lastName());
		user.setEmail(userDetailsdto.email());
		user.setPhoneNumber(userDetailsdto.phoneNumber());
		user.setDateOfBirth(userDetailsdto.dateOfBirth());
		user.setUserRole(userDetailsdto.userRole());
		user.setCreatedAt(System.currentTimeMillis());
		user.setUpdateAt(System.currentTimeMillis());

		return user;

	}

	public TheaterOwner createTheaterOwner(UserDetailsDto userDetailsdto) {
		TheaterOwner theaterOwner = new TheaterOwner();
		theaterOwner.setFirstName(userDetailsdto.firstName());
		theaterOwner.setLastName(userDetailsdto.lastName());
		theaterOwner.setEmail(userDetailsdto.email());
		theaterOwner.setPhoneNumber(userDetailsdto.phoneNumber());
		theaterOwner.setDateOfBirth(userDetailsdto.dateOfBirth());
		theaterOwner.setUserRole(userDetailsdto.userRole());
		theaterOwner.setCreatedAt(System.currentTimeMillis());
		theaterOwner.setUpdateAt(System.currentTimeMillis());

		return theaterOwner;
	}

	public UserDetialsResponseDto userDetailsResponse(UserDetails userDetials) {
		return new UserDetialsResponseDto(userDetials.getUserId(), userDetials.getFirstName(),
				userDetials.getLastName(), userDetials.getEmail(), userDetials.getUserRole(),
				userDetials.getPhoneNumber(), userDetials.getDateOfBirth(), userDetials.getCreatedAt(),
				userDetials.getUpdateAt());
	}

}