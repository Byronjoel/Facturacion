package com.api.ecu.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cs_sridoa")
public class Cs_SriDoa {
	
	@Id
	private String codDoc;
	
	@Column(name="id_sri")
	private Integer id_sri;
	
	@Column(name="des_doc")
	private String des_doc;
	
	@Column(name="fec_ini")
	private Date fec_ini;
	
	
	@Column(name="lock_doc")
	private Integer lock_doc;
	
	@Column(name="fec_upd")
	private Date fec_upd;
	
	@Column(name="first_user")
	private String first_user;
	
	@Column(name="last_user")
	private String last_user;

	
	
	public Cs_SriDoa() {
	
	}



	public Cs_SriDoa(String codDoc, Integer id_sri, String des_doc, Date fec_ini, Integer lock_doc, Date fec_upd,
			String first_user, String last_user) {
	
		this.codDoc = codDoc;
		this.id_sri = id_sri;
		this.des_doc = des_doc;
		this.fec_ini = fec_ini;
		this.lock_doc = lock_doc;
		this.fec_upd = fec_upd;
		this.first_user = first_user;
		this.last_user = last_user;
	}



	public String getCodDoc() {
		return codDoc;
	}



	public void setCodDoc(String codDoc) {
		this.codDoc = codDoc;
	}



	public Integer getId_sri() {
		return id_sri;
	}



	public void setId_sri(Integer id_sri) {
		this.id_sri = id_sri;
	}



	public String getDes_doc() {
		return des_doc;
	}



	public void setDes_doc(String des_doc) {
		this.des_doc = des_doc;
	}



	public Date getFec_ini() {
		return fec_ini;
	}



	public void setFec_ini(Date fec_ini) {
		this.fec_ini = fec_ini;
	}



	public Integer getLock_doc() {
		return lock_doc;
	}



	public void setLock_doc(Integer lock_doc) {
		this.lock_doc = lock_doc;
	}



	public Date getFec_upd() {
		return fec_upd;
	}



	public void setFec_upd(Date fec_upd) {
		this.fec_upd = fec_upd;
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



	@Override
	public String toString() {
		return "Cs_SriDoa [codDoc=" + codDoc + ", id_sri=" + id_sri + ", des_doc=" + des_doc + ", fec_ini=" + fec_ini
				+ ", lock_doc=" + lock_doc + ", fec_upd=" + fec_upd + ", first_user=" + first_user + ", last_user="
				+ last_user + "]";
	}




	
	
	
}
