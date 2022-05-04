package com.api.ecu.repo;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.ecu.models.DesxFac;

@Repository
public interface DesxFacRepo extends JpaRepository< DesxFac, Integer> {

	ArrayList<DesxFac> findAllBynroOrd(int nro_ord);
	
}
