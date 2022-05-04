package com.api.ecu.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.api.ecu.models.LisOrd;
import com.api.ecu.utils.BadRequestException;
@Repository
@Transactional
public class LisOrdImp implements LisOrdDao {
	
	/*@PersistenceContext
	EntityManager entityManager;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public List<LisOrd> getListaOrden() {
		String query="FROM LisOrd";
		@SuppressWarnings("unchecked")
		List<LisOrd>resultado=entityManager.createQuery(query).getResultList();
		if(!resultado.isEmpty())
		return resultado;
		else
			 throw new BadRequestException("No existe datos");
	}

	@Override
	public LisOrd Orden(int nro_orden) {
		String sql = "SELECT * FROM lisord where nro_ord =" + nro_orden; //Realizo La consulta de la Orden
		List<LisOrd> orden = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(LisOrd.class));
		if(!orden.isEmpty())
			return orden.get(0);
		else
			 throw new BadRequestException("No existe esa Orden");
	}
	
	@Override
	public LisOrd datosPaciente(int cod_pac) {
		String sql = "SELECT * FROM lisord where cod_pac = " + cod_pac; //Realizo La consulta de datos en las Ordenes
		List<LisOrd> orden = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(LisOrd.class));
		if(!orden.isEmpty())
			return orden.get(0);
		else
			 throw new BadRequestException("No existe datos del Paciente");
	}*/

}
