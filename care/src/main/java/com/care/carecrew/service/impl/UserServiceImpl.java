package com.care.carecrew.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.server.NotAcceptableStatusException;

import com.care.carecrew.exception.ResourceNotFoundException;
import com.care.carecrew.model.User;
import com.care.carecrew.repo.CarecrewRepo;
import com.care.carecrew.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private CarecrewRepo carecrewRepo;

	@Override
	public User saveData(User user) {
		 if (user.getName().isBlank() || !user.getName().matches("[a-zA-Z_]+")) {
			throw new NotAcceptableStatusException("Not a valid user");
		}

		else if (user.getPhoneNumber().isBlank()) {
			throw new NotAcceptableStatusException("Please enter mobile number");
		} else if (!user.getPhoneNumber().matches("[0-9]+")) {
			throw new NotAcceptableStatusException("Not a valid mobile number");
		}

		User save = carecrewRepo.save(user);
		return save;
	}

//	@Override
//	public User saveData(UserDto userDto) {
//		User user = carecrewRepo.findByUserId(userDto.getUserId());
//		User save = carecrewRepo.save(user);
//		 return save;
//		
//	}

	@Override
	public User getSavedDataById(Long id) {

		return carecrewRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("user", "id", id));
	}

	@Override
	public List<User> getAllUserDetails() {
		if(carecrewRepo.findAll() == null) {
			return  null;
		}
		return carecrewRepo.findAll();
	}

}
