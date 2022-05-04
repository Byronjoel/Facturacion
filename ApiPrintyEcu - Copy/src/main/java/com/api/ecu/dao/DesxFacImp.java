package com.api.ecu.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.api.ecu.models.DesxFac;
import com.api.ecu.utils.BadRequestException;
@Repository
@Transactional
public class DesxFacImp implements DesxFacDao {

	@PersistenceContext
	EntityManager entityManager;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<DesxFac> getDetalle() {
		String query = "FROM DesxFac";
		@SuppressWarnings("unchecked")
		List<DesxFac> resultado = entityManager.createQuery(query).getResultList();
		  if(!resultado.isEmpty())
				return resultado;
				else 
					 throw new BadRequestException("No hay detalles");
		
	}

	@Override
	public DesxFac detallefactura(String sri_Id) {
		String query = "SELECT * FROM ava_desxfac where sri_id = " + sri_Id; // Consulto datos de la factura
		List<DesxFac> detalle = jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(DesxFac.class));
		  if(!detalle.isEmpty())
				return detalle.get(0);
				else 
					 throw new BadRequestException("No hay detalles");
		
	}

	@Override
	public ArrayList<DesxFac> listaDetalle(String nro_ord) {
		String query = "SELECT * FROM ava_desxfac where nro_ord = " + nro_ord; // Consulto datos de la factura
		ArrayList<DesxFac> detalle = (ArrayList<DesxFac>) jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(DesxFac.class));
			  if(!detalle.isEmpty())
				return detalle;
				else 
					 throw new BadRequestException("No hay detalles");

	}




}
