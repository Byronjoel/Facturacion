package com.api.ecu.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.api.ecu.models.LisAna;
import com.api.ecu.utils.BadRequestException;

@Repository
@Transactional
public class LisAnaImp implements LisAnaDao {
	/*EntityManager entityMaganger;

	@PersistenceContext
	EntityManager entityManager;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<LisAna> getListaMed() {
		String query = "FROM LisAna";
		@SuppressWarnings("unchecked")
		List<LisAna> resultado = entityMaganger.createQuery(query).getResultList();
		if(!resultado.isEmpty())
		return resultado;
		else
			throw new BadRequestException("No hay datos");
	}

	@Override
	public String getAnalisis(String cod_ana) {
		String sql = "SELECT * FROM lisana where cod_ana like '" + cod_ana + "'";
		List<LisAna> lisana = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(LisAna.class));
		if (!lisana.isEmpty())
			return lisana.get(0).getDes_ana();
		else
			throw new BadRequestException("No hay datos");

	}*/

}
