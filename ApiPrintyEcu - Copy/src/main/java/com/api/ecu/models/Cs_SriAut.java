package com.api.ecu.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cs_sriaut")
public class Cs_SriAut {
    
	@Id
	private Integer codSuc; 
	
	@Column(name="num_aut")
	private Integer num_aut;
	
	@Column(name="fec_ven")
	private Date fec_ven;
	
	@Column(name="fec_ini")
	private Date fec_ini;
	
	@Column(name="lock_aut")
	private Integer lock_aut;
	
	@Column(name="fec_upd")
	private Date fec_upd;
	
	@Column(name="first_user")
	private String first_user;
	
	@Column(name="last_user")
	private String last_user;
	
	@Column(name="fec_aut")
	private Date fec_aut;
	
	
	
	
	private String tip_emi;

	
	public Cs_SriAut() {
	
	}


	public Cs_SriAut(Integer num_aut, Date fec_ven, Date fec_ini, Integer lock_aut, Date fec_upd, String first_user,
			String last_user, Date fec_aut, Integer codSuc, String tip_emi) {
		this.num_aut = num_aut;
		this.fec_ven = fec_ven;
		this.fec_ini = fec_ini;
		this.lock_aut = lock_aut;
		this.fec_upd = fec_upd;
		this.first_user = first_user;
		this.last_user = last_user;
		this.fec_aut = fec_aut;
		this.codSuc = codSuc;
		this.tip_emi = tip_emi;
	}


	public Integer getNum_aut() {
		return num_aut;
	}


	public void setNum_aut(Integer num_aut) {
		this.num_aut = num_aut;
	}


	public Date getFec_ven() {
		return fec_ven;
	}


	public void setFec_ven(Date fec_ven) {
		this.fec_ven = fec_ven;
	}


	public Date getFec_ini() {
		return fec_ini;
	}


	public void setFec_ini(Date fec_ini) {
		this.fec_ini = fec_ini;
	}


	public Integer getLock_aut() {
		return lock_aut;
	}


	public void setLock_aut(Integer lock_aut) {
		this.lock_aut = lock_aut;
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


	public Date getFec_aut() {
		return fec_aut;
	}


	public void setFec_aut(Date fec_aut) {
		this.fec_aut = fec_aut;
	}


	public Integer getCodSuc() {
		return codSuc;
	}


	public void setCodSuc(Integer codSuc) {
		this.codSuc = codSuc;
	}


	public String getTip_emi() {
		return tip_emi;
	}


	public void setTip_emi(String tip_emi) {
		this.tip_emi = tip_emi;
	}


	@Override
	public String toString() {
		return "Cs_SriAut [num_aut=" + num_aut + ", fec_ven=" + fec_ven + ", fec_ini=" + fec_ini + ", lock_aut="
				+ lock_aut + ", fec_upd=" + fec_upd + ", first_user=" + first_user + ", last_user=" + last_user
				+ ", fec_aut=" + fec_aut + ", codSuc=" + codSuc + ", tip_emi=" + tip_emi + "]";
	}
	
	
	
}
