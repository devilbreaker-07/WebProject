package com.bookmyshow.service;

import com.bookmyshow.dto.UserDetailsDto;
import com.bookmyshow.dto.UserDetialsResponseDto;

public interface IUserService {
	UserDetialsResponseDto userDetials(UserDetailsDto userdetails);
}
