package com.api.ecu.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="s_usuar")
public class S_Usuar {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private String usuario;
	
	@Column(name="descrip")
	private String descrip;
	
	@Column(name="clave")
	private String clave;
	
	
	
	public S_Usuar(String usuario, String descrip) {
		super();
		this.usuario = usuario;
		this.descrip = descrip;
	}


	public S_Usuar(String usuario, String descrip, String clave) {
		
		this.usuario = usuario;
		this.descrip = descrip;
		this.clave = clave;
	}
	
	
	public S_Usuar() {
	
	}

	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getDescrip() {
		return descrip;
	}
	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	@Override
	public String toString() {
		return "S_Usuar [usuario=" + usuario + ", descrip=" + descrip + "]";
	}
	
	
}
