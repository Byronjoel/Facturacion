package com.api.ecu.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="lisfac")
public class LisFac {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer nroOrd;
	
	@Column(name = "item")
	private Integer item;	
	
	@Column(name = "tipo")
	private String tipo;
	
	@Column(name = "codigo")
	private String codigo;
	
	@Column(name = "codigo_fac")
	private String codigoFac;
	
	@Column(name = "cod_seg")	
	private String codSeg;	
	
	@Column(name = "cod_pln")	
	private String codPln;
	
	@Column(name = "precio")	
	private double precio;
	
	@Column(name = "imp_pac")
	private double impPac;
	
	@Column(name = "val_ugas")	
	private double valUga;
	
	@Column(name = "val_uhon")	
	private double valUhon;
	
	@Column(name = "uni_gas")	
	private double uniGa;
	
	@Column(name = "uni_hon")	
	private double uniHon;	
	
	@Column(name = "insertado")	
	private String insertado;	
	
	@Column(name = "sts_fac")
	private String stsFac;
	
	@Column(name = "fec_sts")
	private Date fecSt;
	
	@Column(name = "usuario")
	private String usuario;
	
	@Column(name = "coseguro")
	private String coseguro;
	
	@Column(name = "cod_auto")
	private String codAuto;
	
	@Column(name = "aplica_iva")
	private String aplicaIva;
	
	@Column(name = "sistema")
	private String sistema;
	
	@Column(name = "sri_id")
	private Integer sriId;
	
	public LisFac() {
		
	}

	public LisFac(Integer nroOrd, Integer item, String tipo, String codigo, String codigoFac, String codSeg,
			String codPln, double precio, double impPac, double valUgas, double valUhon, double uniGas, double uniHon,
			String insertado, String stsFac, Date fecSts, String usuario, String coseguro, String codAuto,
			String aplicaIva, String sistema, Integer sriId) {
		super();
		this.nroOrd = nroOrd;
		this.item = item;
		this.tipo = tipo;
		this.codigo = codigo;
		this.codigoFac = codigoFac;
		this.codSeg = codSeg;
		this.codPln = codPln;
		this.precio = precio;
		this.impPac = impPac;
		this.valUga = valUgas;
		this.valUhon = valUhon;
		this.uniGa = uniGas;
		this.uniHon = uniHon;
		this.insertado = insertado;
		this.stsFac = stsFac;
		this.fecSt = fecSts;
		this.usuario = usuario;
		this.coseguro = coseguro;
		this.codAuto = codAuto;
		this.aplicaIva = aplicaIva;
		this.sistema = sistema;
		this.sriId = sriId;
	}

	public Integer getNroOrd() {
		return nroOrd;
	}

	public void setNroOrd(Integer nroOrd) {
		this.nroOrd = nroOrd;
	}

	public Integer getItem() {
		return item;
	}

	public void setItem(Integer item) {
		this.item = item;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCodigoFac() {
		return codigoFac;
	}

	public void setCodigoFac(String codigoFac) {
		this.codigoFac = codigoFac;
	}

	public String getCodSeg() {
		return codSeg;
	}

	public void setCodSeg(String codSeg) {
		this.codSeg = codSeg;
	}

	public String getCodPln() {
		return codPln;
	}

	public void setCodPln(String codPln) {
		this.codPln = codPln;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getImpPac() {
		return impPac;
	}

	public void setImpPac(double impPac) {
		this.impPac = impPac;
	}

	public double getValUhon() {
		return valUhon;
	}

	public void setValUhon(double valUhon) {
		this.valUhon = valUhon;
	}


	public double getUniHon() {
		return uniHon;
	}

	public void setUniHon(double uniHon) {
		this.uniHon = uniHon;
	}

	public String getInsertado() {
		return insertado;
	}

	public void setInsertado(String insertado) {
		this.insertado = insertado;
	}

	public String getStsFac() {
		return stsFac;
	}

	public void setStsFac(String stsFac) {
		this.stsFac = stsFac;
	}


	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getCoseguro() {
		return coseguro;
	}

	public void setCoseguro(String coseguro) {
		this.coseguro = coseguro;
	}

	public String getCodAuto() {
		return codAuto;
	}

	public void setCodAuto(String codAuto) {
		this.codAuto = codAuto;
	}

	public String getAplicaIva() {
		return aplicaIva;
	}

	public void setAplicaIva(String aplicaIva) {
		this.aplicaIva = aplicaIva;
	}

	public String getSistema() {
		return sistema;
	}

	public void setSistema(String sistema) {
		this.sistema = sistema;
	}

	public Integer getSriId() {
		return sriId;
	}

	public void setSriId(Integer sriId) {
		this.sriId = sriId;
	}

	public double getValUga() {
		return valUga;
	}

	public void setValUga(double valUga) {
		this.valUga = valUga;
	}

	public double getUniGa() {
		return uniGa;
	}

	public void setUniGa(double uniGa) {
		this.uniGa = uniGa;
	}

	public Date getFecSt() {
		return fecSt;
	}

	public void setFecSt(Date fecSt) {
		this.fecSt = fecSt;
	}
	



}
