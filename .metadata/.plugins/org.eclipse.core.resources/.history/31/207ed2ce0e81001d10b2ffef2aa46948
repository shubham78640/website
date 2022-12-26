package com.care.carecrew.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.care.carecrew.model.CityEntity;
import com.care.carecrew.repo.CitiesRepo;
import com.care.carecrew.service.CityService;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class CityServiceImpl implements CityService {

	@Autowired
	private CitiesRepo citiesRepo;

//	@Override
//	public boolean save(CityEntity cityEntity) {
//
//		if (Objects.isNull(cityEntity)) {
//			return false;
//		} 
//
//		log.info("Going to save [" + cityEntity + "]");
//
////		cityEntity = cityService.save(cityEntity);
//
//		return true;
//
//	}

	@Override
	public List<CityEntity> getAllCities() {

		return citiesRepo.findAll();
	}

	@Override
	public CityEntity saveCities(CityEntity cityEntity) {
		Optional<CityEntity> care = citiesRepo.findById(cityEntity.getId());
		CityEntity save = citiesRepo.save(cityEntity);
		return save;
	}

}
