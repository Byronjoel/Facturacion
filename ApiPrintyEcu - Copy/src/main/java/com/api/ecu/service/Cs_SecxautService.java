package com.api.ecu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.api.ecu.models.Ava_LisFac;
import com.api.ecu.models.Cs_Secxaut;
import com.api.ecu.repo.Cs_SecxautRepo;
import com.api.ecu.utils.BadRequestException;

@Repository
@Transactional
@Service
public class Cs_SecxautService {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private final Cs_SecxautRepo cs_secxautRepo;

	public Cs_SecxautService(Cs_SecxautRepo cs_secxautRepo) {
		
		this.cs_secxautRepo = cs_secxautRepo;
	}
	
	public Cs_Secxaut secuencia(int cod_suc, String Tip_doc, int pto_emi, int sri_estab) {
		String sql = "SELECT * FROM cs_secxaut where cod_suc =" + cod_suc+ " AND tip_doc like '"+Tip_doc+"' AND pto_emi="+pto_emi+" AND sri_estab="+sri_estab; 
		System.out.println("La consulta es:"+sql);
		List<Cs_Secxaut> secuencia =  jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Cs_Secxaut.class));
		if(!secuencia.isEmpty())	
		return secuencia.get(0);
		else
			 throw new BadRequestException("No existe datos de la Secuencia");
	}
	
	
	public Cs_Secxaut secuencial(Ava_LisFac factura) {  // falta ptoemi
		String pto="101";
		String sql = "SELECT * FROM cs_secxaut where cod_suc =" + factura.getCod_suc()+ " AND tip_doc like '"+factura.getTip_doc()+"' AND pto_emi="+pto+" AND sri_estab="+factura.getSri_estab(); 
		System.out.println("La consulta es:"+sql);
		List<Cs_Secxaut> secuencia =  jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Cs_Secxaut.class));
		if(!secuencia.isEmpty())	
			{
			int valor=secuencia.get(0).getNumCur();
			  valor=valor+1;
			String actualizarSec="UPDATE cs_secxaut	SET num_cur = ? where cod_suc = ? AND tip_doc like ? AND pto_emi= ? AND sri_estab= ?";
			int status = jdbcTemplate.update(actualizarSec,valor, factura.getCod_suc(), factura.getTip_doc(),pto, factura.getSri_estab()); 
			
			return secuencia.get(0);
			}
		else
			 throw new BadRequestException("No existe datos de la Secuencia");
	}
	
	
}
