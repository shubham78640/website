package com.care.carecrew.service;

import java.util.List;

import com.care.carecrew.model.User;

public interface UserService {

	User saveData(User user);

	List<User> getAllUserDetails();

	User getSavedDataById(Long id);

//	User saveData(UserDto userDto);

//	User getSavedDataByName(String name);

//	public User update(Long id, User user);
}
