package com.api.ecu.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.ecu.models.Ava_LisFac;

@Repository
public interface Ava_LisFacRepo extends JpaRepository<Ava_LisFac, Integer> {
	
	
}
