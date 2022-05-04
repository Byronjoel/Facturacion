package com.api.ecu.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="ava_lissuc")
public class LisSuc {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cod_suc;
	
	@Column(name = "des_suc")
	private String des_suc;
	
	@Column(name="fec_ini")
	private Date fec_ini;
	
	@Column(name="first_user")
	private String first_user;
	
	@Column(name="last_user")
	private String last_user;
	
	@Column(name="lock_suc")
	private Integer lock_suc;
	
	@Column(name="sri_razon")
	private String sri_razon;
	
	@Column(name="sri_ruc")
	private String sri_ruc;
	
	@Column(name="sri_esp")
	private Integer sri_esp;
	
	@Column(name="nro_esp")
	private String nro_esp;
	
	@Column(name="cert")
	private String cert;
	
	@Column(name="pwd_cert")
	private String pwd_cert;
	
	@Column(name="logo")
	private String logo;
	
	@Column(name="mail_avisos")
	private String mail_avisos;
	
	@Column(name="nombre_comercial")
	private String nombre_comercial;
	
	@Column(name="template_email")
	private String template_email;
	
	@Column(name="obliga_conta")
	private Integer obliga_conta;
	
	@Column(name="r_micro")
	private Integer r_micro;
	
	@Column(name="a_retencion")
	private String a_retencion;
	
	public LisSuc() {
		
	}




	public LisSuc(Integer cod_suc, String des_suc, Date fec_ini, String first_user, String last_user, Integer lock_suc,
			String sri_razon, String sri_ruc, Integer sri_esp, String nro_esp, String cert, String pwd_cert,
			String logo, String mail_avisos, String nombre_comercial, String template_email, Integer obliga_conta,
			Integer r_micro, String a_retencion) {
		super();
		this.cod_suc = cod_suc;
		this.des_suc = des_suc;
		this.fec_ini = fec_ini;
		this.first_user = first_user;
		this.last_user = last_user;
		this.lock_suc = lock_suc;
		this.sri_razon = sri_razon;
		this.sri_ruc = sri_ruc;
		this.sri_esp = sri_esp;
		this.nro_esp = nro_esp;
		this.cert = cert;
		this.pwd_cert = pwd_cert;
		this.logo = logo;
		this.mail_avisos = mail_avisos;
		this.nombre_comercial = nombre_comercial;
		this.template_email = template_email;
		this.obliga_conta = obliga_conta;
		this.r_micro = r_micro;
		this.a_retencion = a_retencion;
	}




	public Integer getCod_suc() {
		return cod_suc;
	}



	public void setCod_suc(Integer cod_suc) {
		this.cod_suc = cod_suc;
	}



	public String getDes_suc() {
		return des_suc;
	}



	public void setDes_suc(String des_suc) {
		this.des_suc = des_suc;
	}



	public Date getFec_ini() {
		return fec_ini;
	}



	public void setFec_ini(Date fec_ini) {
		this.fec_ini = fec_ini;
	}



	public Integer getLock_suc() {
		return lock_suc;
	}



	public void setLock_suc(Integer lock_suc) {
		this.lock_suc = lock_suc;
	}



	public String getSri_razon() {
		return sri_razon;
	}



	public void setSri_razon(String sri_razon) {
		this.sri_razon = sri_razon;
	}



	public String getSri_ruc() {
		return sri_ruc;
	}



	public void setSri_ruc(String sri_ruc) {
		this.sri_ruc = sri_ruc;
	}



	public String getCert() {
		return cert;
	}



	public void setCert(String cert) {
		this.cert = cert;
	}



	public String getPwd_cert() {
		return pwd_cert;
	}



	public void setPwd_cert(String pwd_cert) {
		this.pwd_cert = pwd_cert;
	}



	public String getNombre_comercial() {
		return nombre_comercial;
	}



	public void setNombre_comercial(String nombre_comercial) {
		this.nombre_comercial = nombre_comercial;
	}



	public Integer getObliga_conta() {
		return obliga_conta;
	}



	public void setObliga_conta(Integer obliga_conta) {
		this.obliga_conta = obliga_conta;
	}




	public String getFirst_user() {
		return first_user;
	}




	public void setFirst_user(String first_user) {
		this.first_user = first_user;
	}




	public String getLast_user() {
		return last_user;
	}




	public void setLast_user(String last_user) {
		this.last_user = last_user;
	}




	public Integer getSri_esp() {
		return sri_esp;
	}




	public void setSri_esp(Integer sri_esp) {
		this.sri_esp = sri_esp;
	}




	public String getNro_esp() {
		return nro_esp;
	}




	public void setNro_esp(String nro_esp) {
		this.nro_esp = nro_esp;
	}




	public String getLogo() {
		return logo;
	}




	public void setLogo(String logo) {
		this.logo = logo;
	}




	public String getMail_avisos() {
		return mail_avisos;
	}




	public void setMail_avisos(String mail_avisos) {
		this.mail_avisos = mail_avisos;
	}




	public String getTemplate_email() {
		return template_email;
	}




	public void setTemplate_email(String template_email) {
		this.template_email = template_email;
	}




	public Integer getR_micro() {
		return r_micro;
	}




	public void setR_micro(Integer r_micro) {
		this.r_micro = r_micro;
	}




	public String getA_retencion() {
		return a_retencion;
	}




	public void setA_retencion(String a_retencion) {
		this.a_retencion = a_retencion;
	}




	@Override
	public String toString() {
		return "LisSuc [cod_suc=" + cod_suc + ", des_suc=" + des_suc + ", fec_ini=" + fec_ini + ", first_user="
				+ first_user + ", last_user=" + last_user + ", lock_suc=" + lock_suc + ", sri_razon=" + sri_razon
				+ ", sri_ruc=" + sri_ruc + ", sri_esp=" + sri_esp + ", nro_esp=" + nro_esp + ", cert=" + cert
				+ ", pwd_cert=" + pwd_cert + ", logo=" + logo + ", mail_avisos=" + mail_avisos + ", nombre_comercial="
				+ nombre_comercial + ", template_email=" + template_email + ", obliga_conta=" + obliga_conta
				+ ", r_micro=" + r_micro + ", a_retencion=" + a_retencion + "]";
	}


	
	
}
