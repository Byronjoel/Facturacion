package com.api.ecu.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "ava_lisori")
public class LisOri {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)	   
	private String cod_ori;
	
	@Column(name="des_ori")
    private String des_ori; 
    
	@Column(name="fec_ini")
    private Date fec_ini;   
    
	@Column(name="lock_ori")
    private Integer lock_ori;  
    
	@Column(name="fec_upd")
    private Date fec_upd;
    
	@Column(name="dia_ori")
    private String dia_ori;
    
	@Column(name="fer_ori")
    private Integer fer_ori;
    
	@Column(name="hab_ori")
    private Integer hab_ori;
    
	@Column(name="first_user")
    private String first_user;
    
	@Column(name="last_user")
    private String last_user;
    
	@Column(name="col_ori")
    private String col_ori;
    
    
	@Column(name="sri_estab")
    private Integer sri_estab;
    
	@Column(name="dir_ori")
    private String dir_ori;
    
	@Column(name="tel_ori")
    private String tel_ori;
    
    
	@Column(name="ciu_ori")
    private String ciu_ori;
    
	@Column(name="cod_suc")
    private Integer codSuc;
    
	@Column(name="sri_mat")
    private Integer sri_mat;
    
	@Column(name="sri_ptos")
    private Integer sri_ptos;
    
	@Column(name="ini_sec")
    private Integer ini_sec;
    
	@Column(name="hora_ori")
    private Date hora_ori;
    
	@Column(name="nom_comercial")
    private String nom_comercial;
    

	public LisOri()
	{		
	}

	public LisOri(String cod_ori, String des_ori, Date fec_ini, Integer lock_ori, Date fec_upd, String dia_ori,
			Integer fer_ori, Integer hab_ori, String first_user, String last_user, String col_ori, Integer sri_estab,
			String dir_ori, String tel_ori, String ciu_ori, Integer codSuc, Integer sri_mat, Integer sri_ptos,
			Integer ini_sec, Date hora_ori, String nom_comercial) {
	
		this.cod_ori = cod_ori;
		this.des_ori = des_ori;
		this.fec_ini = fec_ini;
		this.lock_ori = lock_ori;
		this.fec_upd = fec_upd;
		this.dia_ori = dia_ori;
		this.fer_ori = fer_ori;
		this.hab_ori = hab_ori;
		this.first_user = first_user;
		this.last_user = last_user;
		this.col_ori = col_ori;
		this.sri_estab = sri_estab;
		this.dir_ori = dir_ori;
		this.tel_ori = tel_ori;
		this.ciu_ori = ciu_ori;
		this.codSuc = codSuc;
		this.sri_mat = sri_mat;
		this.sri_ptos = sri_ptos;
		this.ini_sec = ini_sec;
		this.hora_ori = hora_ori;
		this.nom_comercial = nom_comercial;
	}


	public String getDia_ori() {
		return dia_ori;
	}


	public void setDia_ori(String dia_ori) {
		this.dia_ori = dia_ori;
	}


	public Integer getFer_ori() {
		return fer_ori;
	}


	public void setFer_ori(Integer fer_ori) {
		this.fer_ori = fer_ori;
	}


	public Integer getHab_ori() {
		return hab_ori;
	}


	public void setHab_ori(Integer hab_ori) {
		this.hab_ori = hab_ori;
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


	public String getCol_ori() {
		return col_ori;
	}


	public void setCol_ori(String col_ori) {
		this.col_ori = col_ori;
	}


	public String getTel_ori() {
		return tel_ori;
	}


	public void setTel_ori(String tel_ori) {
		this.tel_ori = tel_ori;
	}


	public Integer getSri_mat() {
		return sri_mat;
	}


	public void setSri_mat(Integer sri_mat) {
		this.sri_mat = sri_mat;
	}


	public Integer getSri_ptos() {
		return sri_ptos;
	}


	public void setSri_ptos(Integer sri_ptos) {
		this.sri_ptos = sri_ptos;
	}


	public Integer getIni_sec() {
		return ini_sec;
	}


	public void setIni_sec(Integer ini_sec) {
		this.ini_sec = ini_sec;
	}


	public Date getHora_ori() {
		return hora_ori;
	}


	public void setHora_ori(Date hora_ori) {
		this.hora_ori = hora_ori;
	}


	public String getCod_ori() {
		return cod_ori;
	}

	public void setCod_ori(String cod_ori) {
		this.cod_ori = cod_ori;
	}

	public String getDes_ori() {
		return des_ori;
	}

	public void setDes_ori(String des_ori) {
		this.des_ori = des_ori;
	}

	public Date getFec_ini() {
		return fec_ini;
	}

	public void setFec_ini(Date fec_ini) {
		this.fec_ini = fec_ini;
	}

	public Integer getLock_ori() {
		return lock_ori;
	}

	public void setLock_ori(Integer lock_ori) {
		this.lock_ori = lock_ori;
	}

	public Date getFec_upd() {
		return fec_upd;
	}

	public void setFec_upd(Date fec_upd) {
		this.fec_upd = fec_upd;
	}

	public Integer getSri_estab() {
		return sri_estab;
	}

	public void setSri_estab(Integer sri_estab) {
		this.sri_estab = sri_estab;
	}

	public String getDir_ori() {
		return dir_ori;
	}

	public void setDir_ori(String dir_ori) {
		this.dir_ori = dir_ori;
	}

	public String getCiu_ori() {
		return ciu_ori;
	}

	public void setCiu_ori(String ciu_ori) {
		this.ciu_ori = ciu_ori;
	}

	public Integer getCodSuc() {
		return codSuc;
	}

	public void setCodSuc(Integer codSuc) {
		this.codSuc = codSuc;
	}

	public String getNom_comercial() {
		return nom_comercial;
	}

	public void setNom_comercial(String nom_comercial) {
		this.nom_comercial = nom_comercial;
	}

	@Override
	public String toString() {
		return "LisOri [cod_ori=" + cod_ori + ", des_ori=" + des_ori + ", fec_ini=" + fec_ini + ", lock_ori=" + lock_ori
				+ ", fec_upd=" + fec_upd + ", dia_ori=" + dia_ori + ", fer_ori=" + fer_ori + ", hab_ori=" + hab_ori
				+ ", first_user=" + first_user + ", last_user=" + last_user + ", col_ori=" + col_ori + ", sri_estab="
				+ sri_estab + ", dir_ori=" + dir_ori + ", tel_ori=" + tel_ori + ", ciu_ori=" + ciu_ori + ", codSuc="
				+ codSuc + ", sri_mat=" + sri_mat + ", sri_ptos=" + sri_ptos + ", ini_sec=" + ini_sec + ", hora_ori="
				+ hora_ori + ", nom_comercial=" + nom_comercial + "]";
	}




	
    
}
