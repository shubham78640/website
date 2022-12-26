package com.care.carecrew.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.server.NotAcceptableStatusException;

import com.care.carecrew.model.ContactUs;
import com.care.carecrew.repo.ContactUsRepo;
import com.care.carecrew.service.ContactUsService;

@Service
public class ContactUsServiceImpl implements ContactUsService {

	@Autowired
	private ContactUsRepo contactUsRepo;

	@Override
	public ContactUs saveContactform(ContactUs contactUs) {
		if (!contactUs.getName().matches("[a-zA-Z_]+")) {
			throw new NotAcceptableStatusException("Not a valid user");
		}

		else if (contactUs.getPhoneNumber().isBlank()) {
			throw new NotAcceptableStatusException("Please enter mobile number");
		} else if (!contactUs.getPhoneNumber().matches("[0-9]+")) {
			throw new NotAcceptableStatusException("Not a valid mobile number");
		}

		ContactUs save = contactUsRepo.save(contactUs);
		return save;

	}

	@Override
	public List<ContactUs> getAllContactform() {
		return contactUsRepo.findAll();
	}

}
