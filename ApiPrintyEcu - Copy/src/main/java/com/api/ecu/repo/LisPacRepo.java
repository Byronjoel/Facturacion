package com.api.ecu.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.ecu.models.LisPac;
import org.springframework.stereotype.Repository;

@Repository
public interface LisPacRepo extends JpaRepository<LisPac, Integer> {
	Optional<LisPac> findBydocPac(String doc_pac);
	
	
	
}
