package com.api.ecu.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.api.ecu.models.Cs_SriDoa;
import com.api.ecu.repo.Cs_SriDoaRepo;
import com.api.ecu.utils.BadRequestException;

@Service
public class Cs_SriDoaService {

	public final Cs_SriDoaRepo cs_sridocRepo;
	
	
	
	
	public Cs_SriDoaService(Cs_SriDoaRepo cs_sridocRepo) {
		this.cs_sridocRepo = cs_sridocRepo;
	}




	public List <Cs_SriDoa> findByTipoDocumentos()
	{
		
		   if (!cs_sridocRepo.findAll().isEmpty())
		    	return cs_sridocRepo.findAll();
		    else
		    	 throw new BadRequestException("Revise la conexion");
	   }
	
	
}
