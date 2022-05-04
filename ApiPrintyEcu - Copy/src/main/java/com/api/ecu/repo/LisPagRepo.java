package com.api.ecu.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.ecu.models.LisPag;

@Repository
public interface LisPagRepo extends JpaRepository<LisPag, String> {
	

	

}
