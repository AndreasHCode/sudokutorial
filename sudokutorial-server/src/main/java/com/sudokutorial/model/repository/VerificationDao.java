package com.sudokutorial.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sudokutorial.model.entity.VerificationToken;

@Repository
public interface VerificationDao extends JpaRepository<VerificationToken, Long> {
	public VerificationToken findByToken(String token);
}
