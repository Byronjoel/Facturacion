package com.api.ecu.service;

import org.springframework.stereotype.Service;

import com.api.ecu.models.LisPag;
import com.api.ecu.repo.LisPagRepo;
import com.api.ecu.utils.NotFoundException;

@Service
public class LisPagService {

	public final LisPagRepo lispagRepo;

	public LisPagService(LisPagRepo lispagRepo) {
			this.lispagRepo = lispagRepo;
	}
	
	public  LisPag findByDescripcionPago(String cod_pag)
	{
		return lispagRepo.findById(cod_pag).orElseThrow(()-> new NotFoundException(""));
		
	}
	
}
