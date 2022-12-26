package com.care.carecrew.enumscontroller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.care.carecrew.adapter.DropDownAdapter;
import com.care.carecrew.dto.ResponseDto;
import com.care.carecrew.enums.Service;
import com.care.carecrew.generic.dto.EnumListing;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/enums")
public class EnumsController {

//	@GetMapping(value = "/get/cities")
//	@ApiOperation(value = "Get cities")
//	public ResponseDto<List<EnumListing<Cities>>> getCities() {
//
//		return ResponseDto.success(DropDownAdapter.getCities());
//	}

//	@GetMapping(value = "/get/service")
//	@ApiOperation(value = "Get all services")
//	public ResponseDto<List<EnumListing<Service>>> getService() {
//
//		return ResponseDto.success(DropDownAdapter.getService());
//	}

}