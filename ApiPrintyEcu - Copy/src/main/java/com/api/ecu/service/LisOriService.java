package com.api.ecu.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.api.ecu.models.LisOri;
import com.api.ecu.repo.LisOriRepo;
import com.api.ecu.utils.BadRequestException;

@Service
public class LisOriService {
	public final LisOriRepo lisoriRepo;

	public LisOriService(LisOriRepo lisoriRepo) {
		this.lisoriRepo = lisoriRepo;
	}
	
	public List<LisOri> getListaOrigen() {
	  if(!lisoriRepo.findAll().isEmpty())
		  return lisoriRepo.findAll();
	  else
		  throw new BadRequestException("No existe Datos");
	}
	
	
	public List<LisOri> finsucursal(int cod_suc)
	{
		if(! lisoriRepo.findAllBycodSuc(cod_suc).isEmpty())
			return lisoriRepo.findAllBycodSuc(cod_suc);
		else			
			throw new BadRequestException("No existe Datos");
	}
	
}
