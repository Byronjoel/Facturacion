package com.api.ecu.service;

import org.springframework.stereotype.Service;

import com.api.ecu.models.Cs_SriAut;
import com.api.ecu.repo.Cs_SriAutRepo;
import com.api.ecu.utils.NotFoundException;

@Service
public class Cs_SriAutService {

	public final Cs_SriAutRepo cs_sriautRepo;

	public Cs_SriAutService(Cs_SriAutRepo cs_sriautRepo) {
		super();
		this.cs_sriautRepo = cs_sriautRepo;
	}
	
	
	public Cs_SriAut findByTipoEmision(int id)
	{
		return cs_sriautRepo.findById(id).orElseThrow(()-> new NotFoundException("Revisar Conexion"));	
		
	}
	
}
