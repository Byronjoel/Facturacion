package com.api.ecu.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="liscaj")
public class LisCaj {
	
	@Id
	private String cod_pag;
	
	@Column(name="nro_ord")
	private Integer nroOrd;
	
	@Column(name="valor")
	private Double valor;	
		
	@Column(name="obs_pag")
	private String obs_pag;
	
	@Column(name="fec_mov")
	private Date fec_mov;
	
	@Column(name="concepto")
	private String concepto;
	
	@Column(name="usuario")
	private String usuario;
	
	@Column(name="numero")
	private String numero;
	
	@Column(name="fecha_emision")
	private Date fecha_emision;
	
	@Column(name="fecha_vencimiento")
	private Date fecha_vencimiento;
	
	@Column(name="emisor")
	private String emisor;
	
	
	@Column(name="firmante")
	private  String firmante;
	
	
	@Column(name="fecha_exportacion")
	private Date fecha_exportacion;
	
	@Column(name="cod_suc")
	private String cod_suc;
	
	@Column(name="timbres")
	private String timbres;
	
	@Column(name="num_comp")
	private String num_comp;
	
	@Column(name="id_caja")
	private Integer id_caja;
	
	

	public LisCaj() {
		
	}

	public LisCaj(String cod_pag, Integer nroOrd, Double valor, String obs_pag, Date fec_mov, String concepto,
			String usuario, String numero, Date fecha_emision, Date fecha_vencimiento, String emisor, String firmante,
			Date fecha_exportacion, String cod_suc, String timbres, String num_comp, Integer id_caja) {

		this.cod_pag = cod_pag;
		this.nroOrd = nroOrd;
		this.valor = valor;
		this.obs_pag = obs_pag;
		this.fec_mov = fec_mov;
		this.concepto = concepto;
		this.usuario = usuario;
		this.numero = numero;
		this.fecha_emision = fecha_emision;
		this.fecha_vencimiento = fecha_vencimiento;
		this.emisor = emisor;
		this.firmante = firmante;
		this.fecha_exportacion = fecha_exportacion;
		this.cod_suc = cod_suc;
		this.timbres = timbres;
		this.num_comp = num_comp;
		this.id_caja = id_caja;
	}

	public String getCod_pag() {
		return cod_pag;
	}

	public void setCod_pag(String cod_pag) {
		this.cod_pag = cod_pag;
	}

	

	public Integer getNroOrd() {
		return nroOrd;
	}

	public void setNroOrd(Integer nroOrd) {
		this.nroOrd = nroOrd;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getObs_pag() {
		return obs_pag;
	}

	public void setObs_pag(String obs_pag) {
		this.obs_pag = obs_pag;
	}

	public Date getFec_mov() {
		return fec_mov;
	}

	public void setFec_mov(Date fec_mov) {
		this.fec_mov = fec_mov;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Date getFecha_emision() {
		return fecha_emision;
	}

	public void setFecha_emision(Date fecha_emision) {
		this.fecha_emision = fecha_emision;
	}

	public Date getFecha_vencimiento() {
		return fecha_vencimiento;
	}

	public void setFecha_vencimiento(Date fecha_vencimiento) {
		this.fecha_vencimiento = fecha_vencimiento;
	}

	public String getEmisor() {
		return emisor;
	}

	public void setEmisor(String emisor) {
		this.emisor = emisor;
	}

	public String getFirmante() {
		return firmante;
	}

	public void setFirmante(String firmante) {
		this.firmante = firmante;
	}

	public Date getFecha_exportacion() {
		return fecha_exportacion;
	}

	public void setFecha_exportacion(Date fecha_exportacion) {
		this.fecha_exportacion = fecha_exportacion;
	}

	public String getCod_suc() {
		return cod_suc;
	}

	public void setCod_suc(String cod_suc) {
		this.cod_suc = cod_suc;
	}

	public String getTimbres() {
		return timbres;
	}

	public void setTimbres(String timbres) {
		this.timbres = timbres;
	}

	public String getNum_comp() {
		return num_comp;
	}

	public void setNum_comp(String num_comp) {
		this.num_comp = num_comp;
	}

	public Integer getId_caja() {
		return id_caja;
	}

	public void setId_caja(Integer id_caja) {
		this.id_caja = id_caja;
	}

	@Override
	public String toString() {
		return "LisCaj [cod_pag=" + cod_pag + ", nroOrd=" + nroOrd + ", valor=" + valor + ", obs_pag=" + obs_pag
				+ ", fec_mov=" + fec_mov + ", concepto=" + concepto + ", usuario=" + usuario + ", numero=" + numero
				+ ", fecha_emision=" + fecha_emision + ", fecha_vencimiento=" + fecha_vencimiento + ", emisor=" + emisor
				+ ", firmante=" + firmante + ", fecha_exportacion=" + fecha_exportacion + ", cod_suc=" + cod_suc
				+ ", timbres=" + timbres + ", num_comp=" + num_comp + ", id_caja=" + id_caja + "]";
	}

	
	
	
	
	

}
