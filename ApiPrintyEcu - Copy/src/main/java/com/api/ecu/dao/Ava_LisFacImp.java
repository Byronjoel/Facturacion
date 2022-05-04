package com.api.ecu.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class Ava_LisFacImp implements Ava_LisFacDao {

	@PersistenceContext
	EntityManager entityManager;

	@Autowired
	private JdbcTemplate jdbcTemplate;

/*	@Override
	public List<Ava_LisFac> getListaFactura() {
		String query = "FROM LisFac";
		@SuppressWarnings("unchecked")
		List<Ava_LisFac> resultado = entityManager.createQuery(query).getResultList();

		if (!resultado.isEmpty())
			return resultado;
		else
			throw new BadRequestException("No existe Datos");

	}

	@Override
	public Ava_LisFac factura(int cod_pac) {
		Ava_LisFac objFactura = new Ava_LisFac();
		String query = "SELECT * FROM ava_lisfac where cod_cli = " + cod_pac + " ORDER BY fec_ini DESC"; // Consulto

		List<Ava_LisFac> factura = jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(Ava_LisFac.class));
		if (!factura.isEmpty()) {
			return factura.get(0);
		} else {
			String query1 = "SELECT * FROM lispac where cod_pac = " + cod_pac; // Consulto datos de la factura
			List<LisPac> paciente = jdbcTemplate.query(query1, BeanPropertyRowMapper.newInstance(LisPac.class));
			if (!paciente.isEmpty()) {
				objFactura.setCod_cli(paciente.get(0).getCod_pac());
				objFactura.setSri_comprador(paciente.get(0).getNom_pac() + " " + paciente.get(0).getNom_pac2() + " "
						+ paciente.get(0).getApe_pac() + " " + paciente.get(0).getApm_pac());
				objFactura.setSri_doccompra(paciente.get(0).getDocPac());  ///Aqui cambie
				objFactura.setMail_fac(paciente.get(0).getEmail_pac());
				objFactura.setTel_fac(paciente.get(0).getTel_pac());
				return objFactura;
			}
		}
		throw new BadRequestException("No existe datos del Paciente");

	}

	@Override
	public Ava_LisFac datosPersona(String cedula) {
		Ava_LisFac objFactura = new Ava_LisFac();
		String query = "SELECT * FROM ava_lisfac where sri_doccompra like '" + cedula + "' ORDER BY fec_ini DESC"; // Consulto
																													
		List<Ava_LisFac> factura = jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(Ava_LisFac.class));
		if (!factura.isEmpty()) {
			return factura.get(0);
		} else {
			String query1 = "SELECT * FROM lispac where doc_pac like '" + cedula + "'"; // Consulto datos de la factura
			List<LisPac> paciente = jdbcTemplate.query(query1, BeanPropertyRowMapper.newInstance(LisPac.class));
			if (!paciente.isEmpty()) {
				objFactura.setCod_cli(paciente.get(0).getCod_pac());
				objFactura.setSri_comprador(paciente.get(0).getNom_pac() + " " + paciente.get(0).getNom_pac2() + " "
						+ paciente.get(0).getApe_pac() + " " + paciente.get(0).getApm_pac());
				objFactura.setSri_doccompra(paciente.get(0).getDocPac());  //*************Aqui cambie doc
				objFactura.setMail_fac(paciente.get(0).getEmail_pac());
				objFactura.setTel_fac(paciente.get(0).getTel_pac());
				return objFactura;
			}
		}
		throw new BadRequestException("No existe datos de la Persona");

	}*/

}
