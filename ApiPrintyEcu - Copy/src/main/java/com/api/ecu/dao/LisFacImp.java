package com.api.ecu.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.api.ecu.models.LisFac;
import com.api.ecu.utils.BadRequestException;

@Repository
@Transactional
public class LisFacImp implements LisFacDao{

	/*@PersistenceContext
	EntityManager entityManager;

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public ArrayList<LisFac> listafact(String nro_ord) {
		String query = "SELECT * FROM lisfac where nro_ord = " + nro_ord; // Consulto datos
		ArrayList<LisFac> detalle = (ArrayList<LisFac>) jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(LisFac.class));
		if(!detalle.isEmpty())
		return detalle;
		else
			 throw new BadRequestException("No existe detalles");
	}*/

}
