package com.api.ecu.service;

import org.springframework.stereotype.Service;

import com.api.ecu.models.LisSeg;
import com.api.ecu.repo.LisSegRepo;
import com.api.ecu.utils.NotFoundException;

@Service
public class LisSegService {

	public final LisSegRepo lissegRepo;

	public LisSegService(LisSegRepo lissegRepo) {
				this.lissegRepo = lissegRepo;
	}
	
	public LisSeg finByCodSeg(String cod_seg)
	{
		return lissegRepo.findById(cod_seg).orElseThrow(()-> new NotFoundException(""));
	}
	
}
