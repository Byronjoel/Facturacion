package com.api.ecu.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.api.ecu.models.LisOrd;

@Repository
public interface LisOrdRepo extends JpaRepository<LisOrd, Integer> {
     //Buscar deatos de la Orden por nro
	Optional<LisOrd> findBynroOrd(int nro_orden);
 
	//Buscar datos en las ordenes
 Optional <LisOrd> findBycodPac(int cod_pac);
 
}
