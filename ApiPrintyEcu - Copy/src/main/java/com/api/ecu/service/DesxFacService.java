package com.api.ecu.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.api.ecu.models.DesxFac;
import com.api.ecu.repo.DesxFacRepo;
import com.api.ecu.utils.BadRequestException;
@Repository
@Transactional
@Service
public class DesxFacService {

	public final DesxFacRepo desxfacRepo;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public DesxFacService(DesxFacRepo desxfacRepo) {

		this.desxfacRepo = desxfacRepo;
	}


	public ArrayList<DesxFac> listaDetalle(int nro_ord) {
		String query = "SELECT * FROM ava_desxfac where nro_ord = " + nro_ord; // Consulto datos de la factura
		ArrayList<DesxFac> detalle = (ArrayList<DesxFac>) jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(DesxFac.class));
			  if(!detalle.isEmpty())
				return detalle;
				else 
					 throw new BadRequestException("No hay detalles");
}
}
