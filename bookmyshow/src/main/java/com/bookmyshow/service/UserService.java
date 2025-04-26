package com.bookmyshow.service;

import org.springframework.stereotype.Service;

import com.bookmyshow.dto.UserDetailsDto;
import com.bookmyshow.dto.UserDetialsResponseDto;
import com.bookmyshow.mapper.RequestUserDetails;
import com.bookmyshow.model.TheaterOwner;
import com.bookmyshow.model.User;
import com.bookmyshow.repository.UserDetailsRepository;
import com.bookmyshow.role.UserRole;

import lombok.AllArgsConstructor;



@Service
@AllArgsConstructor
public class UserService implements IUserService {

	private final UserDetailsRepository userDetailsRepository;
	private final RequestUserDetails requestUserDetails;
	
	

	@Override
	public UserDetialsResponseDto userDetials(UserDetailsDto userDetailsdto) {
		if (userDetailsdto.userRole() == UserRole.USER) {
			User user = requestUserDetails.createUser(userDetailsdto);
				userDetailsRepository.save(user);
			return requestUserDetails.userDetailsResponse(user);
		} else if (userDetailsdto.userRole() == UserRole.THEATER_OWNER) {

			TheaterOwner theaterOwner = requestUserDetails.createTheaterOwner(userDetailsdto);
				userDetailsRepository.save(theaterOwner);
			return requestUserDetails.userDetailsResponse(theaterOwner);
		}
		return null;

	}

}
