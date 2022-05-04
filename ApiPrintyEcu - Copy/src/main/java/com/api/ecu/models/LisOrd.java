package com.api.ecu.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lisord")
public class LisOrd {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)	 
	private Integer nroOrd;
	
	@Column(name="fec_ord")
	private Date fec_ord;
	
	@Column(name="fec_ent")
	private Date fec_ent;
	
	@Column(name="codPac")
	private Integer codPac;
	
	@Column(name="cama")
	private String cama;
	
	@Column(name="piso")
	private String piso;
	
	@Column(name="sala")
	private String sala;
	
	@Column(name="cod_med")
	private String cod_med;
	
	@Column(name="cod_ciu")
	private String cod_ciu;
	
	@Column(name="cod_prv")
	private String cod_prv;
	
	@Column(name="cod_dis")
	private String cod_dis;
	
	@Column(name="cod_bar")
	private String cod_bar;
	
	@Column(name="cod_ser")
	private String cod_ser;
	
	@Column(name="cod_ori")
	private String cod_ori;
	
	@Column(name="cod_uni")
	private String cod_uni;
	
	@Column(name="dir_pac")
	private String dir_pac;
	
	@Column(name="cpo_pac")
	private String cpo_pac;
	
	@Column(name="sin_pac")
	private String sin_pac;
	
	@Column(name="sts_ord")
	private String sts_ord;
	
	@Column(name="cod_seg")
	private String cod_seg;
	
	@Column(name="cod_pln")
	private String cod_pln;
	
	@Column(name="sts_adm")
	private String sts_adm;
	
	@Column(name="preingresado")
	private String preingresado;
	
	@Column(name="urgente")
	private String urgente;
	
	@Column(name="factura")
	private String factura;
	
	@Column(name="hora")
	private Date hora;
	
	@Column(name="exportacion")
	private Date exportacion;
	
	@Column(name="fecha_factura")
	private Date fecha_factura;
	
	@Column(name="export_seguro")
	private Date export_seguro;
	
	@Column(name="COD_AUT")
	private String COD_AUT;
	
	@Column(name="receta")
	private String receta;
	
	@Column(name="fec_receta")
	private Date fec_receta;
	
	@Column(name="num_carnet")
	private String num_carnet;
	
	@Column(name="bonos")
	private String bonos;
	
	@Column(name="COD_RAZ")
	private String COD_RAZ;
	
	@Column(name="COD_EVE")
	private String COD_EVE;
	
	@Column(name="COD_EPI")
	private String COD_EPI;
	
	@Column(name="cod_seg2")
	private String cod_seg2;
	
	@Column(name="cod_pln2")
	private String cod_pln2;
	
	@Column(name="fec_fac")
	private Date fec_fac;
	
	@Column(name="COD_DIAG")
	private String COD_DIAG;
	
	@Column(name="ref_externa")
	private String ref_externa;
	
	@Column(name="nro_env")
	private String nro_env;
	
	@Column(name="cod_suc")
	private String cod_suc;
	
	@Column(name="fecha_modif")
	private Date fecha_modif;
	
	@Column(name="forma_envio")
	private String forma_envio;
	
	@Column(name="nro_ref")
	private String nro_ref;
	
	@Column(name="usuario_aux")
	private String usuario_aux;
	
	@Column(name="usuario")
	private String usuario;
	
	@Column(name="tipo_turno")
	private String tipo_turno;
	
	@Column(name="fec_turno")
	private Date fec_turno;
	
	@Column(name="fec_ent_par")
	private Date fec_ent_par;
	
	@Column(name="exp_ord")
	private Integer exp_ord;
	
	@Column(name="lock_ord")
	private Integer lock_ord;
	
	@Column(name="validado")
	private Integer validado;
	
	@Column(name="liberado")
	private Integer liberado;
	
	@Column(name="web")
	private Integer web;
	
	@Column(name="sts_ord2")
	private String sts_ord2;
	
	
	
	
	
	
	
	public LisOrd() {
		// TODO Auto-generated constructor stub
	}







	public LisOrd(Integer nroOrd, Date fec_ord, Date fec_ent, Integer codPac, String cama, String piso, String sala,
			String cod_med, String cod_ciu, String cod_prv, String cod_dis, String cod_bar, String cod_ser,
			String cod_ori, String cod_uni, String dir_pac, String cpo_pac, String sin_pac, String sts_ord,
			String cod_seg, String cod_pln, String sts_adm, String preingresado, String urgente, String factura,
			Date hora, Date exportacion, Date fecha_factura, Date export_seguro, String cOD_AUT, String receta,
			Date fec_receta, String num_carnet, String bonos, String cOD_RAZ, String cOD_EVE, String cOD_EPI,
			String cod_seg2, String cod_pln2, Date fec_fac, String cOD_DIAG, String ref_externa, String nro_env,
			String cod_suc, Date fecha_modif, String forma_envio, String nro_ref, String usuario_aux, String usuario,
			String tipo_turno, Date fec_turno, Date fec_ent_par, Integer exp_ord, Integer lock_ord, Integer validado,
			Integer liberado, Integer web, String sts_ord2) {
		super();
		this.nroOrd = nroOrd;
		this.fec_ord = fec_ord;
		this.fec_ent = fec_ent;
		this.codPac = codPac;
		this.cama = cama;
		this.piso = piso;
		this.sala = sala;
		this.cod_med = cod_med;
		this.cod_ciu = cod_ciu;
		this.cod_prv = cod_prv;
		this.cod_dis = cod_dis;
		this.cod_bar = cod_bar;
		this.cod_ser = cod_ser;
		this.cod_ori = cod_ori;
		this.cod_uni = cod_uni;
		this.dir_pac = dir_pac;
		this.cpo_pac = cpo_pac;
		this.sin_pac = sin_pac;
		this.sts_ord = sts_ord;
		this.cod_seg = cod_seg;
		this.cod_pln = cod_pln;
		this.sts_adm = sts_adm;
		this.preingresado = preingresado;
		this.urgente = urgente;
		this.factura = factura;
		this.hora = hora;
		this.exportacion = exportacion;
		this.fecha_factura = fecha_factura;
		this.export_seguro = export_seguro;
		COD_AUT = cOD_AUT;
		this.receta = receta;
		this.fec_receta = fec_receta;
		this.num_carnet = num_carnet;
		this.bonos = bonos;
		COD_RAZ = cOD_RAZ;
		COD_EVE = cOD_EVE;
		COD_EPI = cOD_EPI;
		this.cod_seg2 = cod_seg2;
		this.cod_pln2 = cod_pln2;
		this.fec_fac = fec_fac;
		COD_DIAG = cOD_DIAG;
		this.ref_externa = ref_externa;
		this.nro_env = nro_env;
		this.cod_suc = cod_suc;
		this.fecha_modif = fecha_modif;
		this.forma_envio = forma_envio;
		this.nro_ref = nro_ref;
		this.usuario_aux = usuario_aux;
		this.usuario = usuario;
		this.tipo_turno = tipo_turno;
		this.fec_turno = fec_turno;
		this.fec_ent_par = fec_ent_par;
		this.exp_ord = exp_ord;
		this.lock_ord = lock_ord;
		this.validado = validado;
		this.liberado = liberado;
		this.web = web;
		this.sts_ord2 = sts_ord2;
	}

	public Integer getNroOrd() {
		return nroOrd;
	}

	public void setNroOrd(Integer nroOrd) {
		this.nroOrd = nroOrd;
	}

	public Date getFec_ord() {
		return fec_ord;
	}

	public void setFec_ord(Date fec_ord) {
		this.fec_ord = fec_ord;
	}

	public Date getFec_ent() {
		return fec_ent;
	}

	public void setFec_ent(Date fec_ent) {
		this.fec_ent = fec_ent;
	}

	public Integer getCodPac() {
		return codPac;
	}

	public void setCodPac(Integer codPac) {
		this.codPac = codPac;
	}

	public String getCama() {
		return cama;
	}

	public void setCama(String cama) {
		this.cama = cama;
	}

	public String getPiso() {
		return piso;
	}

	public void setPiso(String piso) {
		this.piso = piso;
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	public String getCod_med() {
		return cod_med;
	}

	public void setCod_med(String cod_med) {
		this.cod_med = cod_med;
	}

	public String getCod_ciu() {
		return cod_ciu;
	}


	public void setCod_ciu(String cod_ciu) {
		this.cod_ciu = cod_ciu;
	}

	public String getCod_prv() {
		return cod_prv;
	}


	public void setCod_prv(String cod_prv) {
		this.cod_prv = cod_prv;
	}


	public String getCod_dis() {
		return cod_dis;
	}

	public void setCod_dis(String cod_dis) {
		this.cod_dis = cod_dis;
	}

	public String getCod_bar() {
		return cod_bar;
	}

	public void setCod_bar(String cod_bar) {
		this.cod_bar = cod_bar;
	}

	public String getCod_ser() {
		return cod_ser;
	}


	public void setCod_ser(String cod_ser) {
		this.cod_ser = cod_ser;
	}


	public String getCod_ori() {
		return cod_ori;
	}


	public void setCod_ori(String cod_ori) {
		this.cod_ori = cod_ori;
	}


	public String getCod_uni() {
		return cod_uni;
	}


	public void setCod_uni(String cod_uni) {
		this.cod_uni = cod_uni;
	}

	public String getDir_pac() {
		return dir_pac;
	}

	public void setDir_pac(String dir_pac) {
		this.dir_pac = dir_pac;
	}

	public String getCpo_pac() {
		return cpo_pac;
	}

	public void setCpo_pac(String cpo_pac) {
		this.cpo_pac = cpo_pac;
	}

	public String getSin_pac() {
		return sin_pac;
	}

	public void setSin_pac(String sin_pac) {
		this.sin_pac = sin_pac;
	}

	public String getSts_ord() {
		return sts_ord;
	}

	public void setSts_ord(String sts_ord) {
		this.sts_ord = sts_ord;
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

	public String getSts_adm() {
		return sts_adm;
	}


	public void setSts_adm(String sts_adm) {
		this.sts_adm = sts_adm;
	}

	public String getPreingresado() {
		return preingresado;
	}

	public void setPreingresado(String preingresado) {
		this.preingresado = preingresado;
	}

	public String getUrgente() {
		return urgente;
	}


	public void setUrgente(String urgente) {
		this.urgente = urgente;
	}


	public String getFactura() {
		return factura;
	}

	public void setFactura(String factura) {
		this.factura = factura;
	}


	public Date getHora() {
		return hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}

	public Date getExportacion() {
		return exportacion;
	}

	public void setExportacion(Date exportacion) {
		this.exportacion = exportacion;
	}

	public Date getFecha_factura() {
		return fecha_factura;
	}

	public void setFecha_factura(Date fecha_factura) {
		this.fecha_factura = fecha_factura;
	}


	public Date getExport_seguro() {
		return export_seguro;
	}

	public void setExport_seguro(Date export_seguro) {
		this.export_seguro = export_seguro;
	}


	public String getCOD_AUT() {
		return COD_AUT;
	}


	public void setCOD_AUT(String cOD_AUT) {
		COD_AUT = cOD_AUT;
	}


	public String getReceta() {
		return receta;
	}


	public void setReceta(String receta) {
		this.receta = receta;
	}


	public Date getFec_receta() {
		return fec_receta;
	}


	public void setFec_receta(Date fec_receta) {
		this.fec_receta = fec_receta;
	}


	public String getNum_carnet() {
		return num_carnet;
	}


	public void setNum_carnet(String num_carnet) {
		this.num_carnet = num_carnet;
	}


	public String getBonos() {
		return bonos;
	}
	

	public void setBonos(String bonos) {
		this.bonos = bonos;
	}


	public String getCOD_RAZ() {
		return COD_RAZ;
	}


	public void setCOD_RAZ(String cOD_RAZ) {
		COD_RAZ = cOD_RAZ;
	}


	public String getCOD_EVE() {
		return COD_EVE;
	}


	public void setCOD_EVE(String cOD_EVE) {
		COD_EVE = cOD_EVE;
	}


	public String getCOD_EPI() {
		return COD_EPI;
	}


	public void setCOD_EPI(String cOD_EPI) {
		COD_EPI = cOD_EPI;
	}


	public String getCod_seg2() {
		return cod_seg2;
	}


	public void setCod_seg2(String cod_seg2) {
		this.cod_seg2 = cod_seg2;
	}


	public String getCod_pln2() {
		return cod_pln2;
	}

	public void setCod_pln2(String cod_pln2) {
		this.cod_pln2 = cod_pln2;
	}

	public Date getFec_fac() {
		return fec_fac;
	}

	public void setFec_fac(Date fec_fac) {
		this.fec_fac = fec_fac;
	}

	public String getCOD_DIAG() {
		return COD_DIAG;
	}

	public void setCOD_DIAG(String cOD_DIAG) {
		COD_DIAG = cOD_DIAG;
	}

	public String getRef_externa() {
		return ref_externa;
	}

	public void setRef_externa(String ref_externa) {
		this.ref_externa = ref_externa;
	}

	public String getNro_env() {
		return nro_env;
	}

	public void setNro_env(String nro_env) {
		this.nro_env = nro_env;
	}


	public String getCod_suc() {
		return cod_suc;
	}

	public void setCod_suc(String cod_suc) {
		this.cod_suc = cod_suc;
	}

	public Date getFecha_modif() {
		return fecha_modif;
	}

	public void setFecha_modif(Date fecha_modif) {
		this.fecha_modif = fecha_modif;
	}

	public String getForma_envio() {
		return forma_envio;
	}

	public void setForma_envio(String forma_envio) {
		this.forma_envio = forma_envio;
	}


	public String getNro_ref() {
		return nro_ref;
	}


	public void setNro_ref(String nro_ref) {
		this.nro_ref = nro_ref;
	}


	public String getUsuario_aux() {
		return usuario_aux;
	}

	public void setUsuario_aux(String usuario_aux) {
		this.usuario_aux = usuario_aux;
	}


	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getTipo_turno() {
		return tipo_turno;
	}

	public void setTipo_turno(String tipo_turno) {
		this.tipo_turno = tipo_turno;
	}


	public Date getFec_turno() {
		return fec_turno;
	}

	public void setFec_turno(Date fec_turno) {
		this.fec_turno = fec_turno;
	}


	public Date getFec_ent_par() {
		return fec_ent_par;
	}


	public void setFec_ent_par(Date fec_ent_par) {
		this.fec_ent_par = fec_ent_par;
	}


	public Integer getExp_ord() {
		return exp_ord;
	}


	public void setExp_ord(Integer exp_ord) {
		this.exp_ord = exp_ord;
	}


	public Integer getLock_ord() {
		return lock_ord;
	}

	public void setLock_ord(Integer lock_ord) {
		this.lock_ord = lock_ord;
	}

	public Integer getValidado() {
		return validado;
	}

	public void setValidado(Integer validado) {
		this.validado = validado;
	}

	public Integer getLiberado() {
		return liberado;
	}

	public void setLiberado(Integer liberado) {
		this.liberado = liberado;
	}


	public Integer getWeb() {
		return web;
	}


	public void setWeb(Integer web) {
		this.web = web;
	}


	public String getSts_ord2() {
		return sts_ord2;
	}


	public void setSts_ord2(String sts_ord2) {
		this.sts_ord2 = sts_ord2;
	}
	
	
	


	
}
