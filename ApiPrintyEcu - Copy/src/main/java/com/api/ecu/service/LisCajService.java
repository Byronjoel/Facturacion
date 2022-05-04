package com.api.ecu.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.api.ecu.models.LisCaj;
import com.api.ecu.repo.LisCajRepo;
import com.api.ecu.utils.BadRequestException;

@Service
public class LisCajService {

	public final LisCajRepo liscajRepo;

	public LisCajService(LisCajRepo liscajRepo) {
		this.liscajRepo = liscajRepo;
	}

	public LisCaj findByCodigoPago(int nro_ord) {
		List<LisCaj> lista = liscajRepo.findOneBynroOrd(nro_ord);
		if (!lista.isEmpty()) {
			LisCaj liscajObj = lista.get(0);
			return liscajObj;
		} else
			throw new BadRequestException("No existe Pago");
	}

}
