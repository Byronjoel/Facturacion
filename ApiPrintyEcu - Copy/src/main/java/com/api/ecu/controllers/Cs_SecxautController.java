package com.api.ecu.controllers;

import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.api.ecu.models.Cs_Secxaut;
import com.api.ecu.service.Cs_SecxautService;
import com.api.ecu.utils.BadRequestException;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class Cs_SecxautController {

	
public final Cs_SecxautService cs__secxautService;

	
	public Cs_SecxautController(Cs_SecxautService cs__secxautService) {

	this.cs__secxautService = cs__secxautService;
}


	@RequestMapping(path = "/secuencia", method = RequestMethod.GET)
	public ResponseEntity<?> getSecuencia() {
		int cod_suc = 1, pto_emi = 101, sri_estab = 32;
		String Tip_doc = "FV";
		JSONObject jsonObject1 = new JSONObject();
		Cs_Secxaut objsec = cs__secxautService.secuencia(cod_suc, Tip_doc, pto_emi, sri_estab);

		if (objsec != null) {
			int tam = String.valueOf(objsec.getSriEstab()).length();
			String val = String.valueOf(objsec.getSriEstab());
			System.out.print("el valor de tam" + tam);
			while (tam < 3) {
				val = '0' + val;
				tam++;
			}
			jsonObject1.put("num_aut", objsec.getNumAut());
			jsonObject1.put("sri_estab", val);
			jsonObject1.put("num_cur", objsec.getNumCur());
			jsonObject1.put("cod_suc", objsec.getCodSuc());
			jsonObject1.put("tip_doc", objsec.getTipDoc());
			jsonObject1.put("pto_emi", objsec.getPtoEmi());
			return new ResponseEntity<>(jsonObject1.toString(), HttpStatus.OK);
		}

		else
			throw new BadRequestException("Revise los Datos");

	}
}
