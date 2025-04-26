package com.bookmyshow.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookmyshow.dto.UserDetailsDto;
import com.bookmyshow.dto.UserDetialsResponseDto;
import com.bookmyshow.repository.UserDetailsRepository;
import com.bookmyshow.service.IUserService;
import com.bookmyshow.utility.BuilderResponseStructural;
import com.bookmyshow.utility.ResponseStructural;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/bookingshow")
@AllArgsConstructor
public class UserDetailsController {

 
	private IUserService userDetailsService;

    
	
	@PostMapping("/register")
	public ResponseEntity<ResponseStructural<UserDetialsResponseDto>> registerDetails(@RequestBody UserDetailsDto userDetailsDto){
		return BuilderResponseStructural
				.success(HttpStatus.CREATED, "A data Added Sucessfully", userDetailsService.userDetials(userDetailsDto));
		
	}

}
