package com.care.carecrew.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.care.carecrew.model.LocalityEntity;
import com.care.carecrew.repo.LocalityRepo;
import com.care.carecrew.service.LocalityService;

@Service
public class LocalityServiceImpl implements LocalityService {

	@Autowired
	private LocalityRepo localityRepo;

	@Override
	public LocalityEntity saveLocality(LocalityEntity localityEntity) {
		Optional<LocalityEntity> locality = localityRepo.findById(localityEntity.getId());
		LocalityEntity save = localityRepo.save(localityEntity);
		return save;
	}

	@Override
	public List<LocalityEntity> getAllLocalities() {
		return localityRepo.findAll();

	}

}
