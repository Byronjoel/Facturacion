package com.api.ecu.controllers;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.api.ecu.models.LisOri;
import com.api.ecu.service.LisOriService;
import com.api.ecu.utils.BadRequestException;
import com.api.ecu.utils.NotFoundException;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class LisOriController {
	
	

private final LisOriService lisoriService;



public LisOriController(LisOriService lisoriService) {
	
	this.lisoriService = lisoriService;
}


@RequestMapping(path = "/sucursales", method = RequestMethod.GET)
public List<LisOri> getSucur() {
	return lisoriService.getListaOrigen();
}
	

@RequestMapping(value = "/sucursalid", method = RequestMethod.POST, consumes = "application/json")
public ResponseEntity<?> sucursal(@RequestBody LisOri origen) {
	JSONArray jsonArray = new JSONArray();	
	if(origen.getCodSuc()!=null)
	{
	List<LisOri> sucursales =  lisoriService.finsucursal(origen.getCodSuc()) ;        //origenDao.finsucursal(origen.getCodSuc());
		
	if (!sucursales.isEmpty()) {
		for (int x = 0; x < sucursales.size(); x++) {
			JSONObject jsonObject = new JSONObject();			
		jsonObject.put("cod_ori", sucursales.get(x).getCod_ori());
		jsonObject.put("des_ori", sucursales.get(x).getDes_ori());
		jsonObject.put("sri_estab", sucursales.get(x).getSri_estab());
		jsonObject.put("dir_ori", sucursales.get(x).getDir_ori());
		jsonObject.put("cod_suc", sucursales.get(x).getCodSuc());		
		jsonArray.put(jsonObject);
		
	}
		return new ResponseEntity<>(jsonArray.toString(), HttpStatus.OK);
		
	}
		 throw new NotFoundException("No existe la Sucursal");
	}
	
	 throw new BadRequestException("Ingrese el codigo de la Sucursal");
}

}
