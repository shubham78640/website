package com.care.carecrew.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.care.carecrew.dto.ResponseDto;
import com.care.carecrew.model.LocalityEntity;
import com.care.carecrew.service.LocalityService;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/Society")
@Log4j2
public class LocalityController {

	@Autowired 
	private LocalityService localityService;
	
	@PostMapping(value = "/create")
	public ResponseDto<LocalityEntity> create(@RequestBody LocalityEntity localityEntity) {

		Thread.currentThread().setName(UUID.randomUUID().toString());

		log.info("Create society [" + localityEntity + "]");

		LocalityEntity response = localityService.saveLocality(localityEntity);

		return ResponseDto.success("society Created Successfully", response);

	}

	@GetMapping("/get/societies/")
	public ResponseDto<List<LocalityEntity>> getCities() {
		try {
			log.info("user {}");
			List<LocalityEntity> response = localityService.getAllLocalities();
			return ResponseDto.success("All User details get successfully", response);
		} catch (Exception errorMessage) {
			log.error("Exception occurred while getting the data is {}", errorMessage);
			return ResponseDto.failure("Exception occurred while getting the data " + errorMessage);
		}

	}
}
