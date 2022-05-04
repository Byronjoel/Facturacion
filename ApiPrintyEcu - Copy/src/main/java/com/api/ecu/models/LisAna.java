package com.api.ecu.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="lisana")
public class LisAna {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private String codAna;
	
	@Column(name="des_ana")
	private String des_ana;
	
	@Column(name="txt_prev")
	private String txt_prev;
	
	@Column(name="txt_post")
	private String txt_post;	
	
	@Column(name="ord_prn")
	private String ord_prn;	
	
	@Column(name="msg_ana")
	private String msg_ana;	
	
	@Column(name="tipo")
	private String tipo;	
	
	@Column(name="cod_gra")
	private String cod_gra;
	
	@Column(name="imprime_des")
	private String imprime_des;
	
	@Column(name="cod_sec")
	private String cod_sec;
	
	@Column(name="microbiologia")
	private String microbiologia;
	
	@Column(name="activo")
	private String activo;
	
	@Column(name="cod_recep")
	private String cod_recep;
	
	@Column(name="cod_ind")
	private String cod_ind;
	
	@Column(name="des_ana_inf")
	private String des_ana_inf;
	
	@Column(name="dia_ana")
	private String dia_ana;
	
	@Column(name="metodo")
	private String metodo;
	
	@Column(name="orden")
	private Integer orden;
	
	
	
	public LisAna() {
	
	}
	
	
	
	

	public LisAna(String codAna, String des_ana, String txt_prev, String txt_post, String ord_prn, String msg_ana,
			String tipo, String cod_gra, String imprime_des, String cod_sec, String microbiologia, String activo,
			String cod_recep, String cod_ind, String des_ana_inf, String dia_ana, String metodo, Integer orden) {
		
		this.codAna = codAna;
		this.des_ana = des_ana;
		this.txt_prev = txt_prev;
		this.txt_post = txt_post;
		this.ord_prn = ord_prn;
		this.msg_ana = msg_ana;
		this.tipo = tipo;
		this.cod_gra = cod_gra;
		this.imprime_des = imprime_des;
		this.cod_sec = cod_sec;
		this.microbiologia = microbiologia;
		this.activo = activo;
		this.cod_recep = cod_recep;
		this.cod_ind = cod_ind;
		this.des_ana_inf = des_ana_inf;
		this.dia_ana = dia_ana;
		this.metodo = metodo;
		this.orden = orden;
	}





	public String getCodAna() {
		return codAna;
	}

	public void setCodAna(String codAna) {
		this.codAna = codAna;
	}

	public String getDes_ana() {
		return des_ana;
	}



	public void setDes_ana(String des_ana) {
		this.des_ana = des_ana;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public String getCod_gra() {
		return cod_gra;
	}



	public void setCod_gra(String cod_gra) {
		this.cod_gra = cod_gra;
	}



	public String getCod_sec() {
		return cod_sec;
	}



	public void setCod_sec(String cod_sec) {
		this.cod_sec = cod_sec;
	}



	public String getActivo() {
		return activo;
	}



	public void setActivo(String activo) {
		this.activo = activo;
	}



	public String getCod_recep() {
		return cod_recep;
	}



	public void setCod_recep(String cod_recep) {
		this.cod_recep = cod_recep;
	}



	public Integer getOrden() {
		return orden;
	}



	public void setOrden(Integer orden) {
		this.orden = orden;
	}





	@Override
	public String toString() {
		return "LisAna [codAna=" + codAna + ", des_ana=" + des_ana + ", txt_prev=" + txt_prev + ", txt_post=" + txt_post
				+ ", ord_prn=" + ord_prn + ", msg_ana=" + msg_ana + ", tipo=" + tipo + ", cod_gra=" + cod_gra
				+ ", imprime_des=" + imprime_des + ", cod_sec=" + cod_sec + ", microbiologia=" + microbiologia
				+ ", activo=" + activo + ", cod_recep=" + cod_recep + ", cod_ind=" + cod_ind + ", des_ana_inf="
				+ des_ana_inf + ", dia_ana=" + dia_ana + ", metodo=" + metodo + ", orden=" + orden + "]";
	}


	
	
	

}
