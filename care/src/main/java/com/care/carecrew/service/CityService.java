package com.care.carecrew.service;

import java.util.List;

import com.care.carecrew.model.CityEntity;

public interface CityService {

//	public boolean save(CityEntity cityEntity);
	
	public CityEntity saveCities(CityEntity cityEntity);

	List<CityEntity> getAllCities();

}
