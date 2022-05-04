package com.api.ecu.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lisseg")
public class LisSeg {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)	 
	private String codSeg;
	
	@Column(name="nombre")
	private String nombre;

	
	
	public LisSeg() {
			}

	public LisSeg(String codSeg, String nombre) {
		
		this.codSeg = codSeg;
		this.nombre = nombre;
	}

	public String getCodSeg() {
		return codSeg;
	}

	public void setCodSeg(String codSeg) {
		this.codSeg = codSeg;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	
}
