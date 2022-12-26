package com.care.carecrew.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.care.carecrew.model.User;

@Repository
public interface CarecrewRepo extends JpaRepository<User, Long> {
	
}
