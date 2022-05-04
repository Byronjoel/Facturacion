package com.api.ecu.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.api.ecu.models.LisOri;
import com.api.ecu.utils.BadRequestException;

@Repository
@Transactional
public class LisOriImp implements LisOriDao {
	/*@PersistenceContext
	EntityManager entityManager;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<LisOri> getListaOrigen() {
		String query="FROM LisOri";
		@SuppressWarnings("unchecked")
		List<LisOri>resultado=entityManager.createQuery(query).getResultList();
		if(!resultado.isEmpty())
		return resultado;
		else
			 throw new BadRequestException("No existe datos");
	}
	
	@Override
	public LisOri finsucursal(int cod_suc) {
		String sql = "SELECT * FROM ava_lisori where cod_suc =" + cod_suc; //Realizo La consulta
		List<LisOri> sucursal =  jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(LisOri.class));
		if(!sucursal.isEmpty())	
		return (LisOri) sucursal.get(0);
		else
			 throw new BadRequestException("No existe datos de la Sucursal");
	}*/

	
}
