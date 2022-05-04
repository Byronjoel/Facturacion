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

import com.api.ecu.models.LisSuc;
import com.api.ecu.service.LisSucService;
import com.api.ecu.utils.BadRequestException;
import com.api.ecu.utils.NotFoundException;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class LisSucController {

	//@Autowired
	//private LisSucDao sucursalDao;
	
	private final LisSucService lissucservice;
	

	public LisSucController(LisSucService lissucservice) {
		
		this.lissucservice = lissucservice;
	}

	@RequestMapping(path = "/empresas", method = RequestMethod.GET)
	public List<LisSuc> getSucur() {
			return lissucservice.getSucursales();
	}

	@RequestMapping(value = "/empresa", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<?> empresas(@RequestBody LisSuc empresa) {
		JSONObject jsonObject = new JSONObject();
		JSONObject jsonObject1 = new JSONObject();
		JSONObject jsonObject2 = new JSONObject();
		
		if(empresa.getCod_suc()!=null)
		{
			LisSuc empresabus = lissucservice.finSuc(empresa.getCod_suc());
				if (empresabus != null) {
			jsonObject.put("sucursal", empresabus.getDes_suc());
			jsonObject.put("nombre_comercial", empresabus.getNombre_comercial());
			jsonObject.put("ruc", empresabus.getSri_ruc());
			jsonObject.put("SRI razon", empresabus.getSri_razon());
			jsonObject1.put("descripcion", jsonObject);
			jsonObject1.put("code", "1");
			jsonObject2.put("response", jsonObject1);
			return new ResponseEntity<>(jsonObject2.toString(), HttpStatus.OK);
		}
			 throw new NotFoundException("No existe esa Empresa");
		}
		
		 throw new BadRequestException("Ingrese el dato");
	}
	
	
	
	

}
