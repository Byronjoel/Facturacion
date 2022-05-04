package com.api.ecu.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.ecu.models.LisSuc;
import com.api.ecu.repo.LisSucRepo;
import com.api.ecu.utils.BadRequestException;
import com.api.ecu.utils.NotFoundException;

@Service
public class LisSucService {

	private final LisSucRepo lissucRepo;

	@Autowired
	public LisSucService(LisSucRepo lissucRepo) {	
		this.lissucRepo = lissucRepo;
	}
	
	public LisSuc finSuc(int cod_suc)
	{
		return lissucRepo.findById(cod_suc).orElseThrow(()-> new NotFoundException("No existe Datos de la Empresa"));	
	
		}
	
   public List<LisSuc> getSucursales()
   {	   
	    if (!lissucRepo.findAll().isEmpty())
	    	return lissucRepo.findAll();
	    else
	    	 throw new BadRequestException("No existe Datos");
   }
	
}
