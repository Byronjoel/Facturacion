package com.api.ecu.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="lispag")
public class LisPag {
	
    @Id
	private String  codPag;
	
	@Column(name="des_pag")
	private String des_pag;
	
	@Column(name="sol_detalle")
	private String sol_detalle;
	
	
	@Column(name="fec_ini")
	private Date fec_ini;
	
	@Column(name="ruc")
	private String ruc;
	
	@Column(name="cod_cuenta")
	private String cod_cuenta;
	
	@Column(name="tipo_sri")
	private String tipo_sri;
	
	

	public LisPag() {
		
	}

	public LisPag(String codPag, String des_pag, String sol_detalle, Date fec_ini, String ruc, String cod_cuenta,
			String tipo_sri) {
		super();
		this.codPag = codPag;
		this.des_pag = des_pag;
		this.sol_detalle = sol_detalle;
		this.fec_ini = fec_ini;
		this.ruc = ruc;
		this.cod_cuenta = cod_cuenta;
		this.tipo_sri = tipo_sri;
	}

	public String getCodPag() {
		return codPag;
	}

	public void setCodPag(String codPag) {
		this.codPag = codPag;
	}

	public String getDes_pag() {
		return des_pag;
	}

	public void setDes_pag(String des_pag) {
		this.des_pag = des_pag;
	}

	public String getSol_detalle() {
		return sol_detalle;
	}

	public void setSol_detalle(String sol_detalle) {
		this.sol_detalle = sol_detalle;
	}

	public Date getFec_ini() {
		return fec_ini;
	}

	public void setFec_ini(Date fec_ini) {
		this.fec_ini = fec_ini;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getCod_cuenta() {
		return cod_cuenta;
	}

	public void setCod_cuenta(String cod_cuenta) {
		this.cod_cuenta = cod_cuenta;
	}

	public String getTipo_sri() {
		return tipo_sri;
	}

	public void setTipo_sri(String tipo_sri) {
		this.tipo_sri = tipo_sri;
	}

	@Override
	public String toString() {
		return "LisPag [codPag=" + codPag + ", des_pag=" + des_pag + ", sol_detalle=" + sol_detalle + ", fec_ini="
				+ fec_ini + ", ruc=" + ruc + ", cod_cuenta=" + cod_cuenta + ", tipo_sri=" + tipo_sri + "]";
	}

	
	
	
	
	
}
