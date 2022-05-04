package com.api.ecu.service;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.api.ecu.models.LisFac;
import com.api.ecu.repo.LisFacRepo;
import com.api.ecu.utils.BadRequestException;

@Repository
@Transactional
@Service
public class LisFacService {
private final LisFacRepo lisfacRepo;

@Autowired
private JdbcTemplate jdbcTemplate;

public LisFacService(LisFacRepo lisfacRepo) {	
	this.lisfacRepo = lisfacRepo;
}

public ArrayList<LisFac> listafact(Integer nro_ord)
{ 
	String query = "SELECT * FROM lisfac where nro_ord = " + nro_ord; // Consulto datos
	ArrayList<LisFac> detalle = (ArrayList<LisFac>) jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(LisFac.class));
	if(!detalle.isEmpty())
	return detalle;
	else
		 throw new BadRequestException("No existe detalles");
}


}
