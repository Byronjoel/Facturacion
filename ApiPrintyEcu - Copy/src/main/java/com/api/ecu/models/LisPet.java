package com.api.ecu.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lispet")
public class LisPet {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)	 
	private Integer nro_ord;
	
	@Column(name="cod_ana")
	private String cod_ana;
	
	@Column(name="sts_pet")
	private String sts_pet;
	
	@Column(name="pre_pac")
	private double pre_pac;
	
	@Column(name="pre_seg")
	private double pre_seg;
	
	@Column(name="cod_seg")
	private String cod_seg;
	
	@Column(name="cod_pln")
	private String cod_pln;
	
	@Column(name="fec_sign")
	private Date fec_sign;
	


	
	
	public LisPet(Integer nro_ord, String cod_ana, String sts_pet, double pre_pac, double pre_seg, String cod_seg,
			String cod_pln, Date fec_sign) {
		
		this.nro_ord = nro_ord;
		this.cod_ana = cod_ana;
		this.sts_pet = sts_pet;
		this.pre_pac = pre_pac;
		this.pre_seg = pre_seg;
		this.cod_seg = cod_seg;
		this.cod_pln = cod_pln;
		this.fec_sign = fec_sign;
	}

	
	
	public double getPre_pac() {
		return pre_pac;
	}



	public void setPre_pac(double pre_pac) {
		this.pre_pac = pre_pac;
	}



	public double getPre_seg() {
		return pre_seg;
	}



	public void setPre_seg(double pre_seg) {
		this.pre_seg = pre_seg;
	}



	public LisPet() {
	
	}

	public Integer getNro_ord() {
		return nro_ord;
	}

	public void setNro_ord(Integer nro_ord) {
		this.nro_ord = nro_ord;
	}

	public String getCod_ana() {
		return cod_ana;
	}

	public void setCod_ana(String cod_ana) {
		this.cod_ana = cod_ana;
	}

	public String getSts_pet() {
		return sts_pet;
	}

	public void setSts_pet(String sts_pet) {
		this.sts_pet = sts_pet;
	}

	

	public String getCod_seg() {
		return cod_seg;
	}

	public void setCod_seg(String cod_seg) {
		this.cod_seg = cod_seg;
	}

	public String getCod_pln() {
		return cod_pln;
	}

	public void setCod_pln(String cod_pln) {
		this.cod_pln = cod_pln;
	}

	public Date getFec_sign() {
		return fec_sign;
	}

	public void setFec_sign(Date fec_sign) {
		this.fec_sign = fec_sign;
	}


	
	
	
}
