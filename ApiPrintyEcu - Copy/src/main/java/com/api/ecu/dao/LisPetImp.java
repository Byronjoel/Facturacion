package com.api.ecu.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.api.ecu.models.LisPet;
import com.api.ecu.utils.BadRequestException;

@Repository
@Transactional
public class LisPetImp implements LisPetDao {

	/*@PersistenceContext
	EntityManager entityManager;

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public ArrayList<LisPet> listaPet(String nro_ord) {
		String query = "SELECT * FROM lispet where nro_ord = " + nro_ord; // Consulto datos
		ArrayList<LisPet> detalle = (ArrayList<LisPet>) jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(LisPet.class));
		if(detalle!=null)
				return detalle;
				else 
					 throw new BadRequestException("No existe Datos");

	}*/

}
