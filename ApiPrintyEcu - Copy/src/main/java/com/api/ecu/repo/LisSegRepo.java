package com.api.ecu.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.ecu.models.LisSeg;

@Repository
public interface LisSegRepo extends JpaRepository<LisSeg, String> {

	
}
