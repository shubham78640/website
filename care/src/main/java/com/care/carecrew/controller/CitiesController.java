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
import com.care.carecrew.model.CityEntity;
import com.care.carecrew.service.CityService;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequestMapping("/city")
public class CitiesController {

	@Autowired
	private CityService cityService;

//	@PostMapping(value = "/create")
//	public ResponseDto<Boolean> create(@RequestBody CityEntity cityEntity) {
//
//		Thread.currentThread().setName(UUID.randomUUID().toString());
//
//		log.info("Create City [" + cityEntity + "]");
//
//		boolean response = cityService.save(cityEntity);
//
//		return response ? ResponseDto.success("City Created Successfully!!")
//				: ResponseDto.failure("Unable to Create City");
//
//	}

	@PostMapping(value = "/create")
	public ResponseDto<CityEntity> create(@RequestBody CityEntity cityEntity) {

		Thread.currentThread().setName(UUID.randomUUID().toString());

		log.info("Create City [" + cityEntity + "]");

		CityEntity response = cityService.saveCities(cityEntity);

		return ResponseDto.success("City Created Successfully", response);

	}

	@GetMapping("/get/cities/")
	public ResponseDto<List<CityEntity>> getCities() {
		try {
			log.info("user {}");
			List<CityEntity> response = cityService.getAllCities();
			return ResponseDto.success("All Cities get successfully", response);
		} catch (Exception errorMessage) {
			log.error("Exception occurred while getting the data is {}", errorMessage);
			return ResponseDto.failure("Exception occurred while getting the data " + errorMessage);
		}

	}

}
