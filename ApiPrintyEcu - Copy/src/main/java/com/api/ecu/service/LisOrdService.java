package com.api.ecu.service;

import org.springframework.stereotype.Service;

import com.api.ecu.models.LisOrd;
import com.api.ecu.repo.LisOrdRepo;
import com.api.ecu.utils.NotFoundException;

@Service
public class LisOrdService {
 public final LisOrdRepo lisordRepo;

public LisOrdService(LisOrdRepo lisordRepo) {	
	this.lisordRepo = lisordRepo;
}

public LisOrd Orden(int nro_orden)
{
	return lisordRepo.findBynroOrd(nro_orden).orElseThrow(()-> new NotFoundException("No existe la Orden"));
}
 
public LisOrd datosPaciente(int cod_pac) {
	return lisordRepo.findBycodPac(cod_pac).orElseThrow(()-> new NotFoundException("No existe datos del Paciente"));
}

}
