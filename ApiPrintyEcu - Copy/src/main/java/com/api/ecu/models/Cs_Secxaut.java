package com.api.ecu.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cs_secxaut")
public class Cs_Secxaut {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int numAut;
	
	@Column(name = "sri_estab")
	private int sriEstab;
	
	@Column(name = "num_ini")
	private int numIni;
	
	@Column(name = "num_cur")
	private int numCur;
	
	@Column(name = "fec_ini")
	private Date fecIni;
	
	@Column(name = "lock_sxa")
	private int lockSxa;
	
	@Column(name = "cod_suc")
	private int codSuc;
	
	@Column(name = "tip_doc")
	private String tipDoc;
	
	@Column(name = "pto_emi")
	private int ptoEmi;

	
	
	
	public Cs_Secxaut() {
		
	}




	public Cs_Secxaut(int numAut, int sriEstab, int numIni, int numCur, Date fecIni, int lockSxa, int codSuc,
			String tipDoc, int ptoEmi) {
		
		this.numAut = numAut;
		this.sriEstab = sriEstab;
		this.numIni = numIni;
		this.numCur = numCur;
		this.fecIni = fecIni;
		this.lockSxa = lockSxa;
		this.codSuc = codSuc;
		this.tipDoc = tipDoc;
		this.ptoEmi = ptoEmi;
	}



	public int getNumAut() {
		return numAut;
	}



	public void setNumAut(int numAut) {
		this.numAut = numAut;
	}



	public int getSriEstab() {
		return sriEstab;
	}



	public void setSriEstab(int sriEstab) {
		this.sriEstab = sriEstab;
	}



	public int getNumIni() {
		return numIni;
	}



	public void setNumIni(int numIni) {
		this.numIni = numIni;
	}



	public int getNumCur() {
		return numCur;
	}



	public void setNumCur(int numCur) {
		this.numCur = numCur;
	}



	public Date getFecIni() {
		return fecIni;
	}



	public void setFecIni(Date fecIni) {
		this.fecIni = fecIni;
	}



	public int getLockSxa() {
		return lockSxa;
	}



	public void setLockSxa(int lockSxa) {
		this.lockSxa = lockSxa;
	}



	public int getCodSuc() {
		return codSuc;
	}



	public void setCodSuc(int codSuc) {
		this.codSuc = codSuc;
	}



	public String getTipDoc() {
		return tipDoc;
	}



	public void setTipDoc(String tipDoc) {
		this.tipDoc = tipDoc;
	}



	public int getPtoEmi() {
		return ptoEmi;
	}



	public void setPtoEmi(int ptoEmi) {
		this.ptoEmi = ptoEmi;
	}



	@Override
	public String toString() {
		return "Cs_Secxaut [numAut=" + numAut + ", sriEstab=" + sriEstab + ", numIni=" + numIni + ", numCur=" + numCur
				+ ", fecIni=" + fecIni + ", lockSxa=" + lockSxa + ", codSuc=" + codSuc + ", tipDoc=" + tipDoc
				+ ", ptoEmi=" + ptoEmi + "]";
	}


	



	
}
