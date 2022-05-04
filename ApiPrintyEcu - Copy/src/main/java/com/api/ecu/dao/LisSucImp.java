package com.api.ecu.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.api.ecu.models.LisSuc;
import com.api.ecu.utils.BadRequestException;

@Repository
@Transactional
public class LisSucImp implements LisSucDao{

/*	@PersistenceContext
	EntityManager entityManager;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<LisSuc> getSucursales() {
		String query= "FROM LisSuc"; //consulta con el nombre de la clase no base
	  	@SuppressWarnings("unchecked")
		List <LisSuc>resultado= entityManager.createQuery(query).getResultList();
	  	if(!resultado.isEmpty())
			return resultado;
			else 
				 throw new BadRequestException("No existe Datos");
	  	
	}

	@Override
	public LisSuc finSuc(int cod_suc) {
		String sql = "SELECT * FROM ava_lissuc where cod_suc =" + cod_suc; //Realizo La consulta
		List<LisSuc> empresa = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(LisSuc.class));
		if(!empresa.isEmpty())
		return empresa.get(0);
		else 
			 throw new BadRequestException("No existe esa Sucursal");
	}*/

}
