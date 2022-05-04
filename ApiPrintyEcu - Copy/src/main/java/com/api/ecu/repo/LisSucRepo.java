package com.api.ecu.repo;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.ecu.models.LisSuc;

@Repository
public interface LisSucRepo extends JpaRepository<LisSuc, Integer> {

 Optional<LisSuc> findById(int cod_suc);
 
 
	
}
