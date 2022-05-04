package com.api.ecu.repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.ecu.models.LisFac;

@Repository
public interface LisFacRepo extends JpaRepository<LisFac, Integer> {


	
}
