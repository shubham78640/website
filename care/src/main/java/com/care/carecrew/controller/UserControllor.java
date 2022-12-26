package com.care.carecrew.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.care.carecrew.dto.ResponseDto;
import com.care.carecrew.model.User;
import com.care.carecrew.service.impl.UserServiceImpl;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/carecrew")
@Log4j2
public class UserControllor {

	@Autowired
	private UserServiceImpl carecrewServiceImpl;

	@PostMapping("/save")
	public ResponseDto<User> saveDetails(@Valid @RequestBody User user) {
		try {
			log.info("user {}", user);
			User response = carecrewServiceImpl.saveData(user);
			return ResponseDto.success("user details saved successfully", response);
		} catch (Exception errorMessage) {
			log.error("Exception occurred while saving the data is {}", errorMessage);
			return ResponseDto.failure("Exception occurred while saving the data " + errorMessage);
		}
	}

//	@PostMapping("/save")
//	public ResponseDto<User> saveDetails(@Valid @RequestBody UserDto userDto) {
//		try {
//			log.info("user {}",userDto);
//			User response = carecrewServiceImpl.saveData(userDto);
//			return ResponseDto.success("user details saved successfully", response);
//		} 
//		catch (Exception errorMessage) {
//			log.error("Exception occurred while saving the data is {}", errorMessage);
//			return ResponseDto.failure("Exception occurred while saving the data " + errorMessage);
//		}
//	}

	@GetMapping("/get/data/{id}")
	public ResponseDto<User> getDetails(@PathVariable("id") Long id) {
		try {
			log.info("user {}", id);
			User response = carecrewServiceImpl.getSavedDataById(id);
			return ResponseDto.success("user details get successfully", response);
		} catch (Exception errorMessage) {
			log.error("Exception occurred while getting the data is {}", errorMessage);
			return ResponseDto.failure("Exception occurred while getting the data " + errorMessage);
		}
	}

	@GetMapping("/get/data/")
	public ResponseDto<List<User>> getAllDetails() {
		try {
			log.info("user {}");
			List<User> response = carecrewServiceImpl.getAllUserDetails();
			return ResponseDto.success("All User details get successfully", response);
		} catch (Exception errorMessage) {
			log.error("Exception occurred while getting the data is {}", errorMessage);
			return ResponseDto.failure("Exception occurred while getting the data " + errorMessage);
		}

	}

//	@PutMapping("/update/{id}")
//	@ApiOperation("Update Customer Details")
//	public ResponseDto<User> update(@PathVariable("id")@RequestBody User user) {
//		try {
//			User response = carecrewServiceImpl.update(id, user);
//			return ResponseDto.success("Bank account Details saved successfully", response);
//		} catch (Exception errorMessage) {
//			log.error("Exception occurred while saving the data is {}", errorMessage);
//			return ResponseDto.failure("Exception occurred while saving the data " + errorMessage);
//		}
//
//	}
}
