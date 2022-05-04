package com.api.ecu.controllers;

import java.util.List;

import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.api.ecu.models.LisPac;
import com.api.ecu.service.Ava_ListFacService;
import com.api.ecu.service.LisPacService;
import com.api.ecu.utils.BadRequestException;
import com.api.ecu.utils.NotFoundException;
import com.api.ecu.models.Ava_LisFac;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class LisPacController {

	
	
	public final Ava_ListFacService ava_lisfacService;

    private final LisPacService lispacService;
    

	public LisPacController(Ava_ListFacService ava_lisfacService, LisPacService lispacService) {
	
		this.ava_lisfacService = ava_lisfacService;
		this.lispacService = lispacService;
	}





	@RequestMapping(path = "/paciente", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<?> getPaciente(@RequestBody LisPac persona) // Objeto donde recibo los valores del json
	{
		JSONObject jsonObject1 = new JSONObject();
		
		if(persona.getDocPac()!=null)
		{			
			Ava_LisFac facturas = ava_lisfacService.datosPersona(persona.getDocPac()); // Busco datos de fac ant o datos paciente
	     
		if (facturas!=null) { // Creo el Json
			jsonObject1.put("direccion", facturas.getDir_fac());
			jsonObject1.put("cedula", facturas.getSriDoccompra());
			jsonObject1.put("nombre", facturas.getSri_comprador());
			jsonObject1.put("correo persona", facturas.getMail_fac());
			jsonObject1.put("telefono persona", facturas.getTel_fac());
			return new ResponseEntity<>(jsonObject1.toString(), HttpStatus.ACCEPTED);
		}
		else
			 throw new NotFoundException("No existe datos de la Persona");
		}
		 throw new BadRequestException("Ingrese el número de cedula o pasaporte");
	
	}

	
	
}
