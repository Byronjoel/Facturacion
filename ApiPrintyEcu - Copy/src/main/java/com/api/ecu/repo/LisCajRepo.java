package com.api.ecu.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.api.ecu.models.LisCaj;
@Repository
public interface LisCajRepo extends JpaRepository<LisCaj, String> {

	List<LisCaj> findOneBynroOrd(int nro_ord);
	
}
