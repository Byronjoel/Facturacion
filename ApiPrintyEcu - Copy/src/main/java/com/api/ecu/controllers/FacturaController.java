package com.api.ecu.controllers;


import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.ecu.models.Ava_LisFac;
import com.api.ecu.models.Factura;
import com.api.ecu.service.Ava_ListFacService;
import com.api.ecu.utils.BadRequestException;
import com.fasterxml.jackson.annotation.JsonFormat;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class FacturaController {
	
	public final Ava_ListFacService ava_lisfacService;
	

	public FacturaController(Ava_ListFacService ava_lisfacService) {
	
		this.ava_lisfacService = ava_lisfacService;
	}

	@RequestMapping(value = "/facturar", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<?> facturar(@RequestBody Factura factura) {
        
		if(factura!=null)
		{
		System.out.println(factura.getSaldo());
		JSONObject jsonObject1 = new JSONObject();
		JSONObject jsonObject2 = new JSONObject();		
		jsonObject1.put("descripcion", "Factura Ingresada con Éxito");
		jsonObject1.put("code", "1");
		jsonObject2.put("response", jsonObject1);

		return new ResponseEntity<>(jsonObject2.toString(), HttpStatus.ACCEPTED);
		}
		 throw new BadRequestException("Ingrese todos los datos");
	}


	@RequestMapping(value = "/consumofacturacion", method = RequestMethod.POST, consumes = "application/json"    )
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")	
	public ResponseEntity<?> factur(@RequestBody Ava_LisFac factura ) {
        Ava_LisFac nfactura= new Ava_LisFac();
		nfactura=factura;
        if(factura!=null)
		{
	    ava_lisfacService.ingresarFactura(nfactura);
		JSONObject jsonObject1 = new JSONObject();
		JSONObject jsonObject2 = new JSONObject();		
		jsonObject1.put("descripcion", "Factura Ingresada con Éxito");
		jsonObject1.put("code", "1");
		jsonObject2.put("response", jsonObject1);
		return new ResponseEntity<>(jsonObject2.toString(), HttpStatus.ACCEPTED);
		}
		 throw new BadRequestException("Ingrese todos los datos");
	}
	
}
