package com.api.ecu.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.ecu.models.LisAna;

@Repository
public interface LisAnaRepo extends JpaRepository<LisAna, String>{

}
