package com.api.ecu.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.ecu.models.Cs_Secxaut;

@Repository
public interface Cs_SecxautRepo extends JpaRepository<Cs_Secxaut, Integer> {

	
}
