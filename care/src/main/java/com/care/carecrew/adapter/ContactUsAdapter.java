package com.care.carecrew.adapter;

import com.care.carecrew.dto.ContactUsDto;
import com.care.carecrew.model.ContactUs;

import lombok.experimental.UtilityClass;

@UtilityClass
public class ContactUsAdapter {

	public static ContactUs getContactUs(ContactUsDto contactUsDto) {
		return ContactUs.builder().name(contactUsDto.getName()).phoneNumber(contactUsDto.getPhoneNumber())
				.address(contactUsDto.getAddress()).email(contactUsDto.getEmail())
				.workingHours(contactUsDto.getWorkingHours()).id(contactUsDto.getId())
				.message(contactUsDto.getMessage())
//				.locality(contactUsDto.getLocality())
//				.cities(contactUsDto.getCities())				
				.build();

	}

	public static ContactUsDto getContactUsDto(ContactUs contactUs) {
		return ContactUsDto.builder().name(contactUs.getName()).phoneNumber(contactUs.getPhoneNumber())
				.address(contactUs.getAddress()).email(contactUs.getEmail()).workingHours(contactUs.getWorkingHours())
				.id(contactUs.getId()).message(contactUs.getMessage())
//				.cities(contactUs.getCities())
//				.locality(contactUs.getLocality())		
				.build();
	}
}
