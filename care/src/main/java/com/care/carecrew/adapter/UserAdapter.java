package com.care.carecrew.adapter;

import com.care.carecrew.dto.UserDto;
import com.care.carecrew.model.User;

import lombok.experimental.UtilityClass;

@UtilityClass
public class UserAdapter {

	public static User getUser(UserDto userDto) {
		return User.builder().name(userDto.getName()).phoneNumber(userDto.getPhoneNumber()).email(userDto.getEmail())
				.address(userDto.getAddress()).message(userDto.getMessage())
				.workingHours(userDto.getWorkingHours()).locality(userDto.getLocality())
				.createdAt(userDto.getCreatedAt()).cities(userDto.getCities())
//				.cities(userDto.getCities())
//				.locality(userDto.getLocality())
//				.service(userDto.getService())
				.build();

	}

	public static UserDto getUserDto(User user) {
		return UserDto.builder().name(user.getName()).phoneNumber(user.getPhoneNumber()).email(user.getEmail())
				.address(user.getAddress()).cities(user.getCities()).locality(user.getLocality())
				.message(user.getMessage())
				.workingHours(user.getWorkingHours())
				.createdAt(user.getCreatedAt())
//				.service(user.getService())
//				.cities(user.getCities())
//				.locality(user.getLocality())
				.build();
	}
}
