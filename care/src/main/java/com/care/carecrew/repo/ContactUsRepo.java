package com.care.carecrew.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.care.carecrew.model.ContactUs;

@Repository
public interface ContactUsRepo extends JpaRepository<ContactUs, Long>{

}
