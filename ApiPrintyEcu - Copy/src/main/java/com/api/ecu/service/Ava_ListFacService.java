package com.api.ecu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.api.ecu.controllers.AvaLisFacController;
import com.api.ecu.models.Ava_LisFac;
import com.api.ecu.models.Cs_Secxaut;
import com.api.ecu.models.LisPac;
import com.api.ecu.repo.Ava_LisFacRepo;
import com.api.ecu.utils.BadRequestException;

@Repository
@Transactional
@Service
public class Ava_ListFacService {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public final Ava_LisFacRepo ava_lisfacRepo;
	
	public final Cs_SecxautService cs_secxautService;

	

	public Ava_ListFacService(Ava_LisFacRepo ava_lisfacRepo, Cs_SecxautService cs_secxautService) {
		super();
		this.ava_lisfacRepo = ava_lisfacRepo;
		this.cs_secxautService = cs_secxautService;
	}

	public Ava_LisFac factura(int cod_pac) {
		Ava_LisFac objFactura = new Ava_LisFac();
		String query = "SELECT * FROM ava_lisfac where cod_cli = " + cod_pac + " ORDER BY fec_ini DESC"; // Consulto

		List<Ava_LisFac> factura = jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(Ava_LisFac.class));
		if (!factura.isEmpty()) {
			return factura.get(0);
		} else {
			String query1 = "SELECT * FROM lispac where cod_pac = " + cod_pac; // Consulto datos de la factura
			List<LisPac> paciente = jdbcTemplate.query(query1, BeanPropertyRowMapper.newInstance(LisPac.class));
			if (!paciente.isEmpty()) {
				objFactura.setCodCli(paciente.get(0).getCod_pac());
				objFactura.setSri_comprador(paciente.get(0).getNom_pac() + " " + paciente.get(0).getNom_pac2() + " "
						+ paciente.get(0).getApe_pac() + " " + paciente.get(0).getApm_pac());
				objFactura.setSriDoccompra(paciente.get(0).getDocPac());  ///Aqui cambie
				objFactura.setMail_fac(paciente.get(0).getEmail_pac());
				objFactura.setTel_fac(paciente.get(0).getTel_pac());
				objFactura.setSri_tipo(paciente.get(0).getTipo_doc());
			
				return objFactura;
			}
		}
		throw new BadRequestException("No existe datos del Paciente");

	}
	
	//Metodo para buscar los datos de una persona
	public Ava_LisFac datosPersona(String cedula) {
		Ava_LisFac objFactura = new Ava_LisFac();
		String query = "SELECT * FROM ava_lisfac where sri_doccompra like '" + cedula + "' ORDER BY fec_ini DESC"; // Consulto
																													
		List<Ava_LisFac> factura = jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(Ava_LisFac.class));
		if (!factura.isEmpty()) {
			return factura.get(0);
		} else {
			String query1 = "SELECT * FROM lispac where doc_pac like '" + cedula + "'"; // Consulto datos de la factura
			List<LisPac> paciente = jdbcTemplate.query(query1, BeanPropertyRowMapper.newInstance(LisPac.class));
			if (!paciente.isEmpty()) {
				objFactura.setCodCli(paciente.get(0).getCod_pac());
				objFactura.setSri_comprador(paciente.get(0).getNom_pac() + " " + paciente.get(0).getNom_pac2() + " "
						+ paciente.get(0).getApe_pac() + " " + paciente.get(0).getApm_pac());
				objFactura.setSriDoccompra(paciente.get(0).getDocPac());  
				objFactura.setMail_fac(paciente.get(0).getEmail_pac());
				objFactura.setTel_fac(paciente.get(0).getTel_pac());
				return objFactura;
			}
		}
		throw new BadRequestException("No existe datos de la Persona");

	}
	
	
	
	//Metodo Para Ingresar los datos de la Factura
	public void ingresarFactura(Ava_LisFac factura)
	{
		
		Cs_Secxaut secuencial= cs_secxautService.secuencial(factura);
		factura.setSri_sec(String.valueOf(secuencial.getNumCur()));
		ava_lisfacRepo.save(factura);
		
	}
	
	
	
	
	
	
	
	
	
	//Ver si una Orden ya fue Facturada
		public int verificarFacturado(int ord_ref) {
			Ava_LisFac objFactura = new Ava_LisFac();
			String query = "SELECT COUNT (*) FROM ava_lisfac where ord_ref=" + ord_ref ; 
		    int cantidad= jdbcTemplate.queryForObject(query, Integer.class);
			return cantidad;
			

		}
	
	

}
