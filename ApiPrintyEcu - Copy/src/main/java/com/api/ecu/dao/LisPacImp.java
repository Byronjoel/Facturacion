package com.api.ecu.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.api.ecu.models.LisPac;
import com.api.ecu.utils.BadRequestException;

@Repository
@Transactional
public class LisPacImp implements LisPacDao {
  /* 
	@PersistenceContext
	EntityManager entityManager;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<LisPac> getLisPacientes() {	
	String query= "FROM LisPac"; //consulta con el nombre de la clase no base
  	@SuppressWarnings("unchecked")
	List <LisPac>resultado= entityManager.createQuery(query).getResultList();
  	if(!resultado.isEmpty())
	return resultado;
  	else
		 throw new BadRequestException("No existe datos");
	}


	@Override
	public LisPac finPac(String doc_pac) {
		String sql = "SELECT * FROM lispac where doc_pac like '" + doc_pac + "'"; //Realizo La consulta
		List<LisPac> paciente = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(LisPac.class));
		if(!paciente.isEmpty())	
		return paciente.get(0);
		else
			 throw new BadRequestException("No existe datos del Paciente");
	}



*/

	
	

}
