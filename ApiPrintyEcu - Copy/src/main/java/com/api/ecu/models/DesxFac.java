package com.api.ecu.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="ava_desxfac")
public class DesxFac {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer sriId;
	
	@Column(name = "cod_ana")
	private String codAna;
	
	
	@Column(name = "fec_ini")
	private Date fecIni;
	
	@Column(name = "precio")
	private double precio;
	
	@Column(name = "imp_pac")
	private double impPac;
	
	@Column(name = "nro_ord")
	private Integer nroOrd;
	
	public DesxFac() {
	
	}

	public DesxFac(Integer sriId, String codAna, Date fecIni, double precio, double impPac, Integer nroOrd) {
		
		this.sriId = sriId;
		this.codAna = codAna;
		this.fecIni = fecIni;
		this.precio = precio;
		this.impPac = impPac;
		this.nroOrd = nroOrd;
	}

	public Integer getSriId() {
		return sriId;
	}

	public void setSriId(Integer sriId) {
		this.sriId = sriId;
	}

	public String getCodAna() {
		return codAna;
	}

	public void setCodAna(String codAna) {
		this.codAna = codAna;
	}

	public Date getFecIni() {
		return fecIni;
	}

	public void setFecIni(Date fecIni) {
		this.fecIni = fecIni;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getImpPac() {
		return impPac;
	}

	public void setImpPac(double impPac) {
		this.impPac = impPac;
	}

	public Integer getNroOrd() {
		return nroOrd;
	}

	public void setNroOrd(Integer nroOrd) {
		this.nroOrd = nroOrd;
	}
	
	

	
	
}
