package com.api.ecu.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.ecu.models.Cs_SriDoa;

@Repository
public interface Cs_SriDoaRepo extends JpaRepository<Cs_SriDoa, String> {

	
}
