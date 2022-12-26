package com.care.carecrew.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.care.carecrew.model.CityEntity;

@Repository
public interface CitiesRepo extends JpaRepository<CityEntity, Long>  {

}
