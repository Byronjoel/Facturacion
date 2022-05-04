package com.api.ecu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.ecu.models.S_Usuar;
import com.api.ecu.repo.S_UsuarRepo;
import com.api.ecu.utils.BadRequestException;

@Service
public class S_UsuarService {

	private final S_UsuarRepo s_usuarRepo;

	@Autowired
	public S_UsuarService(S_UsuarRepo s_usuarRepo) {		
		this.s_usuarRepo = s_usuarRepo;
	}
	
	public List<S_Usuar>getListaUsuario()
	{
	  if(	!s_usuarRepo.findAll().isEmpty())
		  return s_usuarRepo.findAll();
	  else
		  throw new BadRequestException("No existe Datos");
				  
	}
}
