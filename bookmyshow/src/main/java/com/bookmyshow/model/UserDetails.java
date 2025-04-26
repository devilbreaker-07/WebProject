package com.bookmyshow.model;

import java.time.LocalDate;

import com.bookmyshow.role.UserRole;
import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;


@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Getter
@Setter
public class UserDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "user_id")
	private String userId;
	@Column(nullable = false, length = 20, name = "first_name")
	private String firstName;
	@Column(nullable = false, length = 20, name = "last_name")
	private String lastName;
	@Column(nullable = true, unique = true, length = 20)
	private String email;
	@Column(nullable = true, length = 15)
	@Enumerated(EnumType.STRING)
	private UserRole userRole;
	@Column(name = "phone_number", unique = true, nullable = false)
	private String phoneNumber;
	@Column(name = "date_of_birth", nullable = false)
	@JsonFormat(pattern = "dd-mm-yyyy")
	private LocalDate dateOfBirth;
	@Column(name = "created_at", nullable = false)
	private Long createdAt;
	@Column(name = "updated_at", nullable = false)
	private Long updateAt;

}
