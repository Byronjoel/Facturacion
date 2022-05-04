package com.api.ecu.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lispac")
public class LisPac {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cod_pac;

	@Column(name = "doc_pac")
	private String docPac;

	@Column(name = "nom_pac")
	private String nom_pac;

	@Column(name = "nom_pac2")
	private String nom_pac2;

	@Column(name = "ape_pac")
	private String ape_pac;

	@Column(name = "apm_pac")
	private String apm_pac;

	@Column(name = "fna_pac")
	private Date fna_pac;	

	@Column(name = "sex_pac")
	private String sex_pac;
	
	@Column(name = "benef_pac")
	private String benef_pac;
		
	@Column(name = "cod_raz")
	private String cod_raz;
	
	@Column(name = "patologia")
	private String patologia;
	
	@Column(name = "email_pac")
	private String email_pac;

	@Column(name = "tel_pac")
	private String tel_pac;
	
	@Column(name = "tit_pac")
	private String tit_pac;
	
	@Column(name = "exportacion")
	private Date exportacion;

	@Column(name = "tipo_doc")
	private String tipo_doc;
	
	@Column(name = "fax")
	private String fax;
	
	@Column(name = "cod_prof")
	private String cod_prof;

	@Column(name = "clave")
	private String clave;
	
	@Column(name = "cod_aux")
	private String cod_aux;
	
	@Column(name = "usuario_web")
	private String usuario_web;
	
	@Column(name = "password_web")
	private String password_web;
	
	@Column(name = "fec_ini")
	private Date fec_ini;
	
	@Column(name = "fec_upd")
	private Date fec_upd;
	
	@Column(name = "lock_check")
	private Integer lock_check;

	public LisPac() {
		

	}

	public LisPac(Integer cod_pac, String docPac, String nom_pac, String nom_pac2, String ape_pac, String apm_pac,
			Date fna_pac, String sex_pac, String benef_pac, String cod_raz, String patologia, String email_pac,
			String tel_pac, String tit_pac, Date exportacion, String tipo_doc, String fax, String cod_prof,
			String clave, String cod_aux, String usuario_web, String password_web, Date fec_ini, Date fec_upd,
			Integer lock_check) {
		super();
		this.cod_pac = cod_pac;
		this.docPac = docPac;
		this.nom_pac = nom_pac;
		this.nom_pac2 = nom_pac2;
		this.ape_pac = ape_pac;
		this.apm_pac = apm_pac;
		this.fna_pac = fna_pac;
		this.sex_pac = sex_pac;
		this.benef_pac = benef_pac;
		this.cod_raz = cod_raz;
		this.patologia = patologia;
		this.email_pac = email_pac;
		this.tel_pac = tel_pac;
		this.tit_pac = tit_pac;
		this.exportacion = exportacion;
		this.tipo_doc = tipo_doc;
		this.fax = fax;
		this.cod_prof = cod_prof;
		this.clave = clave;
		this.cod_aux = cod_aux;
		this.usuario_web = usuario_web;
		this.password_web = password_web;
		this.fec_ini = fec_ini;
		this.fec_upd = fec_upd;
		this.lock_check = lock_check;
	}
	

	public String getBenef_pac() {
		return benef_pac;
	}

	public void setBenef_pac(String benef_pac) {
		this.benef_pac = benef_pac;
	}

	public String getCod_raz() {
		return cod_raz;
	}

	public void setCod_raz(String cod_raz) {
		this.cod_raz = cod_raz;
	}

	public String getPatologia() {
		return patologia;
	}

	public void setPatologia(String patologia) {
		this.patologia = patologia;
	}

	public String getTit_pac() {
		return tit_pac;
	}

	public void setTit_pac(String tit_pac) {
		this.tit_pac = tit_pac;
	}

	public Date getExportacion() {
		return exportacion;
	}

	public void setExportacion(Date exportacion) {
		this.exportacion = exportacion;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getCod_prof() {
		return cod_prof;
	}

	public void setCod_prof(String cod_prof) {
		this.cod_prof = cod_prof;
	}

	public String getCod_aux() {
		return cod_aux;
	}

	public void setCod_aux(String cod_aux) {
		this.cod_aux = cod_aux;
	}

	public String getUsuario_web() {
		return usuario_web;
	}

	public void setUsuario_web(String usuario_web) {
		this.usuario_web = usuario_web;
	}

	public String getPassword_web() {
		return password_web;
	}

	public void setPassword_web(String password_web) {
		this.password_web = password_web;
	}

	public Date getFec_ini() {
		return fec_ini;
	}

	public void setFec_ini(Date fec_ini) {
		this.fec_ini = fec_ini;
	}

	public Date getFec_upd() {
		return fec_upd;
	}

	public void setFec_upd(Date fec_upd) {
		this.fec_upd = fec_upd;
	}

	public Integer getLock_check() {
		return lock_check;
	}

	public void setLock_check(Integer lock_check) {
		this.lock_check = lock_check;
	}

	public Integer getCod_pac() {
		return cod_pac;
	}

	public void setCod_pac(Integer cod_pac) {
		this.cod_pac = cod_pac;
	}

	

	public String getDocPac() {
		return docPac;
	}

	public void setDocPac(String docPac) {
		this.docPac = docPac;
	}

	public String getNom_pac() {
		return nom_pac;
	}

	public void setNom_pac(String nom_pac) {
		this.nom_pac = nom_pac;
	}

	public String getNom_pac2() {
		return nom_pac2;
	}

	public void setNom_pac2(String nom_pac2) {
		this.nom_pac2 = nom_pac2;
	}

	public String getApe_pac() {
		return ape_pac;
	}

	public void setApe_pac(String ape_pac) {
		this.ape_pac = ape_pac;
	}

	public String getApm_pac() {
		return apm_pac;
	}

	public void setApm_pac(String apm_pac) {
		this.apm_pac = apm_pac;
	}

	public Date getFna_pac() {
		return fna_pac;
	}

	public void setFna_pac(Date fna_pac) {
		this.fna_pac = fna_pac;
	}

	public String getSex_pac() {
		return sex_pac;
	}

	public void setSex_pac(String sex_pac) {
		this.sex_pac = sex_pac;
	}

	public String getEmail_pac() {
		return email_pac;
	}

	public void setEmail_pac(String email_pac) {
		this.email_pac = email_pac;
	}

	public String getTel_pac() {
		return tel_pac;
	}

	public void setTel_pac(String tel_pac) {
		this.tel_pac = tel_pac;
	}

	public String getTipo_doc() {
		return tipo_doc;
	}

	public void setTipo_doc(String tipo_doc) {
		this.tipo_doc = tipo_doc;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	@Override
	public String toString() {
		return "LisPac [cod_pac=" + cod_pac + ", docPac=" + docPac + ", nom_pac=" + nom_pac + ", nom_pac2=" + nom_pac2
				+ ", ape_pac=" + ape_pac + ", apm_pac=" + apm_pac + ", fna_pac=" + fna_pac + ", sex_pac=" + sex_pac
				+ ", benef_pac=" + benef_pac + ", cod_raz=" + cod_raz + ", patologia=" + patologia + ", email_pac="
				+ email_pac + ", tel_pac=" + tel_pac + ", tit_pac=" + tit_pac + ", exportacion=" + exportacion
				+ ", tipo_doc=" + tipo_doc + ", fax=" + fax + ", cod_prof=" + cod_prof + ", clave=" + clave
				+ ", cod_aux=" + cod_aux + ", usuario_web=" + usuario_web + ", password_web=" + password_web
				+ ", fec_ini=" + fec_ini + ", fec_upd=" + fec_upd + ", lock_check=" + lock_check + "]";
	}

	
}
