package com.care.carecrew.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.care.carecrew.model.LocalityEntity;

@Repository
public interface LocalityRepo extends JpaRepository<LocalityEntity, Long> {

}

