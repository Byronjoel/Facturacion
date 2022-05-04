package com.api.ecu.controllers;

import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.ecu.models.Cs_SriAut;
import com.api.ecu.service.Cs_SriAutService;
import com.api.ecu.utils.NotFoundException;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class Cs_SriAutController {

	public final Cs_SriAutService cs_sriautService;

	public Cs_SriAutController(Cs_SriAutService cs_sriautService) {
		this.cs_sriautService = cs_sriautService;
	}
	
	@RequestMapping(value = "/tipoemision", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<?> tipoemision(@RequestBody Cs_SriAut tipemision) {
 		Cs_SriAut emision=new Cs_SriAut();
		if(tipemision.getCodSuc()!=null)
		{
		emision=cs_sriautService.findByTipoEmision(tipemision.getCodSuc());
		if(emision!=null)
		{
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("codsuc", emision.getCodSuc());
		jsonObject.put("tipo_emision", emision.getTip_emi());
		return new ResponseEntity<>(jsonObject.toString(), HttpStatus.OK);
		}
		else
			 throw new NotFoundException("Verifique la Sucursal");
	}
		else
			 throw new NotFoundException("Ingrese el dato");
	}
	
}
