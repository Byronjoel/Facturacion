package com.api.ecu.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.api.ecu.models.Login;
import com.api.ecu.models.S_Usuar;
import com.api.ecu.service.S_UsuarService;
import com.api.ecu.utils.BadRequestException;
import com.api.ecu.utils.NotFoundException;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class S_UsuarController {


	
	private final S_UsuarService s_usuarService;
	
	

	public S_UsuarController(S_UsuarService s_usuarService) {		
		this.s_usuarService = s_usuarService;
	}

	@RequestMapping(path = "/usuarios", method = RequestMethod.GET)
	public List<S_Usuar> getPacientes() {
		return s_usuarService.getListaUsuario();
	}

	@RequestMapping(value = "/registro", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<?> Login4(@RequestBody Login login) {

		Map<String, Object> response = new HashMap<>();
		Map<String, Object> response1 = new HashMap<>();
			
        int cont=0;
		if (login.getData().getUsuario() != null && login.getData().getClave() != null && login.getTipo() != null)
		{
			List<S_Usuar> listCustomers = s_usuarService.getListaUsuario();
			if (!listCustomers.isEmpty()) {
				for (S_Usuar elem : listCustomers) {
					if ((login.getData().getUsuario().equals((elem.getUsuario()))
							&& (login.getData().getClave().equals((elem.getClave()))))) {
						response1.put("descripcion", elem);
						response1.put("code", "1");
						response.put("response", response1);
						cont=cont++;
						return new ResponseEntity<Map<String, Object>>(response, HttpStatus.ACCEPTED);
					}
				}
				if(cont==0)
					throw new BadRequestException("Usuario o Contraseña Incorrecta");
			}
			throw new NotFoundException("No existe datos");
		}
		throw new BadRequestException("Ingrese todos los datos");
	}
}
