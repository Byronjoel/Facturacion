package com.api.ecu.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.ecu.models.Cs_SriAut;

@Repository
public interface Cs_SriAutRepo extends JpaRepository<Cs_SriAut, Integer> {

}
