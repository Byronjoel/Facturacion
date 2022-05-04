package com.api.ecu.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.ecu.models.LisOri;

@Repository
public interface LisOriRepo extends JpaRepository<LisOri, String> {

	//Busco Origenes por codigo de la Sucursal
	
	List<LisOri> findAllBycodSuc(int cod_suc);
}
