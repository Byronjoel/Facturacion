package com.api.ecu.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.api.ecu.models.Cs_Secxaut;
import com.api.ecu.utils.BadRequestException;

@Repository
@Transactional
public class Cs_SecxautImp implements Cs_SecxautDao {

	@PersistenceContext
	EntityManager entityManager;

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public Cs_Secxaut secuencia(int cod_suc, String Tip_doc, int pto_emi, int sri_estab) {
		String sql = "SELECT * FROM cs_secxaut where cod_suc =" + cod_suc+ " AND tip_doc like '"+Tip_doc+"' AND pto_emi="+pto_emi+" AND sri_estab="+sri_estab; 
		System.out.println("La consulta es:"+sql);
		List<Cs_Secxaut> secuencia =  jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Cs_Secxaut.class));
		if(!secuencia.isEmpty())	
		return secuencia.get(0);
		else
			 throw new BadRequestException("No existe datos de la Secuencia");
	}
	
	

}
