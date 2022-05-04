package com.api.ecu.models;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ava_lisfac")
public class Ava_LisFac {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer sri_id;
	
	private Integer sri_doc;
	
	@Column(name="cod_cli")
	private Integer codCli;
	
	@Column(name="cod_suc")
	private Integer cod_suc;
	
	@Column(name="fec_ini")
	private Date fec_ini;	  
	
	@Column(name="lock_fxo")
	private Integer lock_fxo;
	
	@Column(name="fec_upd")
	private Date fec_upd;
	
	@Column(name="last_user")
	private String  last_user;
	
	@Column(name="nro_ref")
	private Integer nro_ref;
	
	@Column(name="res_fac")
	private String res_fac;
	
	@Column(name="id_fac")
	private Integer id_fac;
	
	@Column(name="first_user")
	private String first_user;
	
	@Column(name="tip_doc")
	private String tip_doc;
	
	@Column(name="exp_fac")
	private Integer exp_fac;
	
	@Column(name="sri_razon")
	private String sri_razon;
	
	@Column(name="sri_estab")
	private Integer sri_estab;
	
	@Column(name="sri_ptoemi")
	private Integer sri_ptoemi;
	
	@Column(name="sri_aut")
	private String sri_aut;
	
	@Column(name="sri_ruc")
	private String sri_ruc;
	
	@Column(name="sri_sec")
	private String sri_sec;
	
	@Column(name="sri_comprador")
	private String sri_comprador;
	
	@Column(name="sri_doccompra")
	private String sriDoccompra;
	
	@Column(name="sri_caduca")
	private Date sri_caduca;
	
	@Column(name="sri_totalsin")
	private double sri_totalsin;
	
	@Column(name="sri_ice")
	private double sri_ice;
	
	@Column(name="sri_iva1")
	private double sri_iva1;	
	
	@Column(name="sri_iva2")
	private double sri_iva2;
	
	@Column(name="sri_totalcon")
	private double sri_totalcon;
	
	@Column(name="sri_dcto")
	private double sri_dcto;
	
	@Column(name="exp_anu")
	private Integer exp_anu;	
	
	@Column(name="print_ok")
	private Integer print_ok;
	
	@Column(name="dir_fac")
	private String dir_fac;
	
	@Column(name="tel_fac")
	private String tel_fac;
	
	@Column(name="det_fac")
	private String det_fac;
	
	@Column(name="sri_tipo")
	private String sri_tipo;
	
	@Column(name="tdoc_ref")
	private String tdoc_ref;
	
	@Column(name="tip_cli")
	private String tip_cli;
	
	@Column(name="sri_ivam")
	private double sri_ivam;
	
	@Column(name="sri_retiva")
	private double sri_retiva;
	
	@Column(name="sri_retren")
	private double sri_retren;
	
	@Column(name="sri_subtotal")
	private double sri_subtotal;	
	
	@Column(name="ord_ref")
	private Integer ord_ref;
	
	@Column(name="sri_idref")
	private String sri_idref; 
	
	@Column(name="tip_emi")
	private String tip_emi;
	
	@Column(name="mail_fac")
	private String mail_fac;
	
	@Column(name="tipo_pag")
	private String tipo_pag;
	
	@Column(name="fac_man")
	private Integer fac_man;
	
	@Column(name="declarado")
	private Integer declarado;
	
	@Column(name="user_anulado")
	private String user_anulado;
	
	@Column(name="fec_anu")
	private Date fec_anu;
	
	@Column(name="obs_fac")
	private String obs_fac;
	
	@Column(name="sistema")
	private String sistema;
	
	@Column(name="sri_acceso")
	private String sri_acceso;
	
	@Column(name="sri_autorizacion")
	private String sri_autorizacion;
	
	@Column(name="sri_ambiente")
	private Integer sri_ambiente;
	
	@Column(name="sri_tipoemision")
	private Integer sri_tipoemision;
	
	@Column(name="sri_fecaut")
	private Date sri_fecaut;
	
	@Column(name="intento")
	private Integer intento;
	
	@Column(name="clave")
	private String clave;
	
	@Column(name="descrip")
	private String descrip;
	
	@Column(name="tipo_doc")
	private String tipo_doc;
	
	@Column(name="exp_aun")
	private Integer exp_aun;
	
	@Column(name="facman")
	private Integer facman;
	
	
	public Ava_LisFac() {		
	}
		
	


	public Ava_LisFac(Integer sri_id, Integer sri_doc, Integer codCli, Integer cod_suc, Date fec_ini, Integer lock_fxo,
			Date fec_upd, String last_user, Integer nro_ref, String res_fac, Integer id_fac, String first_user,
			String tip_doc, Integer exp_fac, String sri_razon, Integer sri_estab, Integer sri_ptoemi, String sri_aut,
			String sri_ruc, String sri_sec, String sri_comprador, String sriDoccompra, Date sri_caduca,
			double sri_totalsin, double sri_ice, double sri_iva1, double sri_iva2, double sri_totalcon, double sri_dcto,
			Integer exp_anu, Integer print_ok, String dir_fac, String tel_fac, String det_fac, String sri_tipo,
			String tdoc_ref, String tip_cli, double sri_ivam, double sri_retiva, double sri_retren, double sri_subtotal,
			Integer ord_ref, String sri_idref, String tip_emi, String mail_fac, String tipo_pag, Integer fac_man,
			Integer declarado, String user_anulado, Date fec_anu, String obs_fac, String sistema, String sri_acceso,
			String sri_autorizacion, Integer sri_ambiente, Integer sri_tipoemision, Date sri_fecaut, Integer intento,
			String clave, String descrip, String tipo_doc, Integer exp_aun, Integer facman) {
	
		this.sri_id = sri_id;
		this.sri_doc = sri_doc;
		this.codCli = codCli;
		this.cod_suc = cod_suc;
		this.fec_ini = fec_ini;
		this.lock_fxo = lock_fxo;
		this.fec_upd = fec_upd;
		this.last_user = last_user;
		this.nro_ref = nro_ref;
		this.res_fac = res_fac;
		this.id_fac = id_fac;
		this.first_user = first_user;
		this.tip_doc = tip_doc;
		this.exp_fac = exp_fac;
		this.sri_razon = sri_razon;
		this.sri_estab = sri_estab;
		this.sri_ptoemi = sri_ptoemi;
		this.sri_aut = sri_aut;
		this.sri_ruc = sri_ruc;
		this.sri_sec = sri_sec;
		this.sri_comprador = sri_comprador;
		this.sriDoccompra = sriDoccompra;
		this.sri_caduca = sri_caduca;
		this.sri_totalsin = sri_totalsin;
		this.sri_ice = sri_ice;
		this.sri_iva1 = sri_iva1;
		this.sri_iva2 = sri_iva2;
		this.sri_totalcon = sri_totalcon;
		this.sri_dcto = sri_dcto;
		this.exp_anu = exp_anu;
		this.print_ok = print_ok;
		this.dir_fac = dir_fac;
		this.tel_fac = tel_fac;
		this.det_fac = det_fac;
		this.sri_tipo = sri_tipo;
		this.tdoc_ref = tdoc_ref;
		this.tip_cli = tip_cli;
		this.sri_ivam = sri_ivam;
		this.sri_retiva = sri_retiva;
		this.sri_retren = sri_retren;
		this.sri_subtotal = sri_subtotal;
		this.ord_ref = ord_ref;
		this.sri_idref = sri_idref;
		this.tip_emi = tip_emi;
		this.mail_fac = mail_fac;
		this.tipo_pag = tipo_pag;
		this.fac_man = fac_man;
		this.declarado = declarado;
		this.user_anulado = user_anulado;
		this.fec_anu = fec_anu;
		this.obs_fac = obs_fac;
		this.sistema = sistema;
		this.sri_acceso = sri_acceso;
		this.sri_autorizacion = sri_autorizacion;
		this.sri_ambiente = sri_ambiente;
		this.sri_tipoemision = sri_tipoemision;
		this.sri_fecaut = sri_fecaut;
		this.intento = intento;
		this.clave = clave;
		this.descrip = descrip;
		this.tipo_doc = tipo_doc;
		this.exp_aun = exp_aun;
		this.facman = facman;
	}




	public Integer getSri_id() {
		return sri_id;
	}

	public void setSri_id(Integer sri_id) {
		this.sri_id = sri_id;
	}

	public String getLast_user() {
		return last_user;
	}

	public void setLast_user(String last_user) {
		this.last_user = last_user;
	}

	public Integer getNro_ref() {
		return nro_ref;
	}

	public void setNro_ref(Integer nro_ref) {
		this.nro_ref = nro_ref;
	}

	public String getFirst_user() {
		return first_user;
	}

	public void setFirst_user(String first_user) {
		this.first_user = first_user;
	}

	public Integer getExp_anu() {
		return exp_anu;
	}

	public void setExp_anu(Integer exp_anu) {
		this.exp_anu = exp_anu;
	}

	public Integer getFac_man() {
		return fac_man;
	}

	public void setFac_man(Integer fac_man) {
		this.fac_man = fac_man;
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

	public Date getSri_caduca() {
		return sri_caduca;
	}

	public void setSri_caduca(Date sri_caduca) {
		this.sri_caduca = sri_caduca;
	}

	public Date getFec_anu() {
		return fec_anu;
	}

	public void setFec_anu(Date fec_anu) {
		this.fec_anu = fec_anu;
	}

	public Date getSri_fecaut() {
		return sri_fecaut;
	}

	public void setSri_fecaut(Date sri_fecaut) {
		this.sri_fecaut = sri_fecaut;
	}

	public String getRes_fac() {
		return res_fac;
	}
	
	public void setRes_fac(String res_fac) {
		this.res_fac = res_fac;
	}

	public Integer getCodCli() {
		return codCli;
	}

	public void setCodCli(Integer codCli) {
		this.codCli = codCli;
	}

	public Integer getCod_suc() {
		return cod_suc;
	}


	public void setCod_suc(Integer cod_suc) {
		this.cod_suc = cod_suc;
	}


	public Integer getLock_fxo() {
		return lock_fxo;
	}

	public void setLock_fxo(Integer lock_fxo) {
		this.lock_fxo = lock_fxo;
	}


	public Integer getId_fac() {
		return id_fac;
	}


	public void setId_fac(Integer id_fac) {
		this.id_fac = id_fac;
	}


	public String getTip_doc() {
		return tip_doc;
	}


	public void setTip_doc(String tip_doc) {
		this.tip_doc = tip_doc;
	}


	public Integer getExp_fac() {
		return exp_fac;
	}


	public void setExp_fac(Integer exp_fac) {
		this.exp_fac = exp_fac;
	}


	public String getSri_razon() {
		return sri_razon;
	}


	public void setSri_razon(String sri_razon) {
		this.sri_razon = sri_razon;
	}


	public Integer getSri_estab() {
		return sri_estab;
	}


	public void setSri_estab(Integer sri_estab) {
		this.sri_estab = sri_estab;
	}


	public Integer getSri_ptoemi() {
		return sri_ptoemi;
	}


	public void setSri_ptoemi(Integer sri_ptoemi) {
		this.sri_ptoemi = sri_ptoemi;
	}


	public String getSri_aut() {
		return sri_aut;
	}


	public void setSri_aut(String sri_aut) {
		this.sri_aut = sri_aut;
	}


	public String getSri_ruc() {
		return sri_ruc;
	}


	public void setSri_ruc(String sri_ruc) {
		this.sri_ruc = sri_ruc;
	}


	public String getSri_sec() {
		return sri_sec;
	}


	public void setSri_sec(String sri_sec) {
		this.sri_sec = sri_sec;
	}


	public String getSri_comprador() {
		return sri_comprador;
	}


	public void setSri_comprador(String sri_comprador) {
		this.sri_comprador = sri_comprador;
	}


	public String getSriDoccompra() {
		return sriDoccompra;
	}


	public void setSriDoccompra(String sriDoccompra) {
		this.sriDoccompra = sriDoccompra;
	}


	public double getSri_totalsin() {
		return sri_totalsin;
	}


	public void setSri_totalsin(double sri_totalsin) {
		this.sri_totalsin = sri_totalsin;
	}


	public double getSri_ice() {
		return sri_ice;
	}


	public void setSri_ice(double sri_ice) {
		this.sri_ice = sri_ice;
	}


	public double getSri_iva1() {
		return sri_iva1;
	}


	public void setSri_iva1(double sri_iva1) {
		this.sri_iva1 = sri_iva1;
	}


	public double getSri_iva2() {
		return sri_iva2;
	}


	public void setSri_iva2(double sri_iva2) {
		this.sri_iva2 = sri_iva2;
	}


	public double getSri_totalcon() {
		return sri_totalcon;
	}


	public void setSri_totalcon(double sri_totalcon) {
		this.sri_totalcon = sri_totalcon;
	}


	public double getSri_dcto() {
		return sri_dcto;
	}


	public void setSri_dcto(double sri_dcto) {
		this.sri_dcto = sri_dcto;
	}


	public Integer getSri_doc() {
		return sri_doc;
	}


	public void setSri_doc(Integer sri_doc) {
		this.sri_doc = sri_doc;
	}


	public Integer getExp_aun() {
		return exp_aun;
	}


	public void setExp_aun(Integer exp_aun) {
		this.exp_aun = exp_aun;
	}


	public Integer getPrint_ok() {
		return print_ok;
	}


	public void setPrint_ok(Integer print_ok) {
		this.print_ok = print_ok;
	}


	public String getDir_fac() {
		return dir_fac;
	}


	public void setDir_fac(String dir_fac) {
		this.dir_fac = dir_fac;
	}


	public String getTel_fac() {
		return tel_fac;
	}


	public void setTel_fac(String tel_fac) {
		this.tel_fac = tel_fac;
	}


	public String getDet_fac() {
		return det_fac;
	}


	public void setDet_fac(String det_fac) {
		this.det_fac = det_fac;
	}


	public String getSri_tipo() {
		return sri_tipo;
	}

	public void setSri_tipo(String sri_tipo) {
		this.sri_tipo = sri_tipo;
	}

	public String getTdoc_ref() {
		return tdoc_ref;
	}

	public void setTdoc_ref(String tdoc_ref) {
		this.tdoc_ref = tdoc_ref;
	}

	public String getTip_cli() {
		return tip_cli;
	}

	public void setTip_cli(String tip_cli) {
		this.tip_cli = tip_cli;
	}

	public double getSri_ivam() {
		return sri_ivam;
	}


	public void setSri_ivam(double sri_ivam) {
		this.sri_ivam = sri_ivam;
	}


	public double getSri_retiva() {
		return sri_retiva;
	}


	public void setSri_retiva(double sri_retiva) {
		this.sri_retiva = sri_retiva;
	}


	public double getSri_retren() {
		return sri_retren;
	}


	public void setSri_retren(double sri_retren) {
		this.sri_retren = sri_retren;
	}


	public double getSri_subtotal() {
		return sri_subtotal;
	}


	public void setSri_subtotal(double sri_subtotal) {
		this.sri_subtotal = sri_subtotal;
	}


	public Integer getOrd_ref() {
		return ord_ref;
	}


	public void setOrd_ref(Integer ord_ref) {
		this.ord_ref = ord_ref;
	}


	public String getSri_idref() {
		return sri_idref;
	}


	public void setSri_idref(String sri_idref) {
		this.sri_idref = sri_idref;
	}


	public String getTip_emi() {
		return tip_emi;
	}


	public void setTip_emi(String tip_emi) {
		this.tip_emi = tip_emi;
	}


	public String getMail_fac() {
		return mail_fac;
	}


	public void setMail_fac(String mail_fac) {
		this.mail_fac = mail_fac;
	}


	public String getTipo_pag() {
		return tipo_pag;
	}


	public void setTipo_pag(String tipo_pag) {
		this.tipo_pag = tipo_pag;
	}


	public Integer getFacman() {
		return facman;
	}


	public void setFacman(Integer facman) {
		this.facman = facman;
	}


	public Integer getDeclarado() {
		return declarado;
	}


	public void setDeclarado(Integer declarado) {
		this.declarado = declarado;
	}


	public String getUser_anulado() {
		return user_anulado;
	}


	public void setUser_anulado(String user_anulado) {
		this.user_anulado = user_anulado;
	}



	public String getObs_fac() {
		return obs_fac;
	}


	public void setObs_fac(String obs_fac) {
		this.obs_fac = obs_fac;
	}


	public String getSistema() {
		return sistema;
	}


	public void setSistema(String sistema) {
		this.sistema = sistema;
	}


	public String getSri_acceso() {
		return sri_acceso;
	}


	public void setSri_acceso(String sri_acceso) {
		this.sri_acceso = sri_acceso;
	}


	public String getSri_autorizacion() {
		return sri_autorizacion;
	}


	public void setSri_autorizacion(String sri_autorizacion) {
		this.sri_autorizacion = sri_autorizacion;
	}


	public Integer getSri_ambiente() {
		return sri_ambiente;
	}


	public void setSri_ambiente(Integer sri_ambiente) {
		this.sri_ambiente = sri_ambiente;
	}


	public Integer getSri_tipoemision() {
		return sri_tipoemision;
	}


	public void setSri_tipoemision(Integer sri_tipoemision) {
		this.sri_tipoemision = sri_tipoemision;
	}



	public Integer getIntento() {
		return intento;
	}


	public void setIntento(Integer intento) {
		this.intento = intento;
	}


	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getDescrip() {
		return descrip;
	}

	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}


	public String getTipo_doc() {
		return tipo_doc;
	}

	public void setTipo_doc(String tipo_doc) {
		this.tipo_doc = tipo_doc;
	}



}
