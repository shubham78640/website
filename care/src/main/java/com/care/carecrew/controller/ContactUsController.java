package com.care.carecrew.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.care.carecrew.dto.ResponseDto;
import com.care.carecrew.model.ContactUs;
import com.care.carecrew.service.impl.ContactUsServiceImpl;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/contactUs")
@Log4j2
public class ContactUsController {

	@Autowired
	private ContactUsServiceImpl contactUsServiceImpl;

	@PostMapping("/save")
	public ResponseDto<ContactUs> saveContactForm(@Valid @RequestBody ContactUs contactUs) {
		try {
			log.info("contact {}", contactUs);
			ContactUs response = contactUsServiceImpl.saveContactform(contactUs);
			return ResponseDto.success("Contact details saved successfully ", response);
		} catch (Exception e) {
			log.error("Exception while saving contact detials ", e);
			return ResponseDto.failure("Exception occurred while saving the contact details " + e);
		}
	}
	
	@GetMapping("/getDetails")
	public ResponseDto<List<ContactUs>> getDetails (){
		try {
			log.info("contact {}");
			List<ContactUs> response = contactUsServiceImpl.getAllContactform();
			return ResponseDto.success("Contact details getting successfully ", response);
		} catch (Exception e) {
			log.error("Exception while getting contact detials ", e);
			return ResponseDto.failure("Exception occurred while getting the contact details " + e);
		}
		
	}
	
}
