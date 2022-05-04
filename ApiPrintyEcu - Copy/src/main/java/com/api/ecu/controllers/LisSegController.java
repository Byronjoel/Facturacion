package com.api.ecu.controllers;


import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.ecu.models.LisCaj;
import com.api.ecu.models.LisPag;
import com.api.ecu.models.LisSeg;
import com.api.ecu.service.LisCajService;
import com.api.ecu.service.LisPagService;
import com.api.ecu.service.LisSegService;
import com.api.ecu.utils.NotFoundException;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class LisSegController {

	private LisSegService lissegService;
    private LisCajService liscajService;
    private LisPagService lispagService;
    
	
	
	


	public LisSegController(LisSegService lissegService, LisCajService liscajService, LisPagService lispagService) {
		this.lissegService = lissegService;
		this.liscajService = liscajService;
		this.lispagService = lispagService;
	}


	@RequestMapping(path = "/seguro", method = RequestMethod.GET)
	public ResponseEntity<?>getSucur() {
		LisSeg seguro=new LisSeg();
		seguro=lissegService.finByCodSeg("5191");
		if(seguro!=null)
		{
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("codsuc", seguro.getCodSeg());
		jsonObject.put("nombre", seguro.getNombre());
		return new ResponseEntity<>(jsonObject.toString(), HttpStatus.OK);
		}
		else
			 throw new NotFoundException("No existe");
	}
	
	
	@RequestMapping(path = "/pago", method = RequestMethod.GET)
	public ResponseEntity<?>getCodigoPago() {
		LisCaj seguro=new LisCaj();
		seguro=liscajService.findByCodigoPago(30851426);
		if(seguro!=null)
		{
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("codsuc", seguro.getCod_pag());
		jsonObject.put("nombre", seguro.getObs_pag());
		return new ResponseEntity<>(jsonObject.toString(), HttpStatus.OK);
		}
		else
			 throw new NotFoundException("No existe");
	}
	
	@RequestMapping(path = "/descrippago", method = RequestMethod.GET)
	public ResponseEntity<?>getDescripago() {
		LisPag seguro=new LisPag();
		seguro=lispagService.findByDescripcionPago("08");
		if(seguro!=null)
		{
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("codsuc", seguro.getCodPag());
		jsonObject.put("nombre", seguro.getDes_pag());
		return new ResponseEntity<>(jsonObject.toString(), HttpStatus.OK);
		}
		else
			 throw new NotFoundException("No existe");
	}
}
