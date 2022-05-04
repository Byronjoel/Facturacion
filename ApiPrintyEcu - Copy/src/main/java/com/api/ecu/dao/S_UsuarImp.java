package com.api.ecu.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.api.ecu.models.S_Usuar;
import com.api.ecu.utils.BadRequestException;


@Repository
@Transactional
public class S_UsuarImp implements S_UsuarDao {

	/*
	@PersistenceContext
	EntityManager entityManager;
	
	
	@Override
	public List<S_Usuar> getListaUsuario() {	
	String query= "FROM S_Usuar"; //consulta con el nombre de la clase no base
  	@SuppressWarnings("unchecked")
	List <S_Usuar>resultado= entityManager.createQuery(query).getResultList();
	if(!resultado.isEmpty())
	return resultado;
	else
		 throw new BadRequestException("No existe datos");
	}*/
	
	
}
