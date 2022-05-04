package com.api.ecu.service;

import org.springframework.stereotype.Service;

import com.api.ecu.repo.LisAnaRepo;
import com.api.ecu.utils.BadRequestException;

@Service
public class LisAnaService {

	private final LisAnaRepo lisanaRepo;

	public LisAnaService(LisAnaRepo lisanaRepo) {
			this.lisanaRepo = lisanaRepo;
	}
	
	public String getAnalisis(String cod_ana) {
		
		if( !lisanaRepo.findById(cod_ana).get().getDes_ana().isEmpty())
			return lisanaRepo.findById(cod_ana).get().getDes_ana();
		else
			throw new BadRequestException("No hay datos");
	}
}
