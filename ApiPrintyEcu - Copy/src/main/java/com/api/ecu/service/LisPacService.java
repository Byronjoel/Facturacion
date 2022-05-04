package com.api.ecu.service;

import org.springframework.stereotype.Service;

import com.api.ecu.models.LisPac;
import com.api.ecu.repo.LisPacRepo;
import com.api.ecu.utils.NotFoundException;

@Service
public class LisPacService {
	public final LisPacRepo lispacRepo;

	public LisPacService(LisPacRepo lispacRepo) {		
		this.lispacRepo = lispacRepo;
	}


	public LisPac getPaciente(String doc_pac)
	{
		return lispacRepo.findBydocPac(doc_pac).orElseThrow(()-> new NotFoundException("No existe Datos del Paciente"));
	}
	
	

}
