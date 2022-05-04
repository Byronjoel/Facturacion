package com.api.ecu.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.ecu.models.Cs_SriDoa;
import com.api.ecu.service.Cs_SriDoaService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class Cs_SriDocController {
	
	public final Cs_SriDoaService cs_sridocService;
	
	
	public Cs_SriDocController(Cs_SriDoaService cs_sridocService) {
		super();
		this.cs_sridocService = cs_sridocService;
	}


	@RequestMapping(path = "/tipodocumento", method = RequestMethod.GET)
	public List<Cs_SriDoa> getdocumentos() {
			return cs_sridocService.findByTipoDocumentos();
	}


}
