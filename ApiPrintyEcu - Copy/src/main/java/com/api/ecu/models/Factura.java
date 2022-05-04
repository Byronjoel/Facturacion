package com.api.ecu.models;

public class Factura {
private String responsable;
	
	private String nombre_persona;
	
	private Integer cel_persona;
	
	private Integer cod_persona;
	
	private String nro_cedula_persona;
	
	private String fecha_factura;
	
	private boolean desglose;
	
	private double total;
	
	private double abono;
	
	private double saldo;

	public Factura() {
		
	}

	public Factura(String responsable, String nombre_persona, Integer cel_persona, Integer cod_persona,
			String nro_cedula_persona, String fecha_factura, boolean desglose, double total, double abono,
			double saldo) {
		
		this.responsable = responsable;
		this.nombre_persona = nombre_persona;
		this.cel_persona = cel_persona;
		this.cod_persona = cod_persona;
		this.nro_cedula_persona = nro_cedula_persona;
		this.fecha_factura = fecha_factura;
		this.desglose = desglose;
		this.total = total;
		this.abono = abono;
		this.saldo = saldo;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	public String getNombre_persona() {
		return nombre_persona;
	}

	public void setNombre_persona(String nombre_persona) {
		this.nombre_persona = nombre_persona;
	}

	public Integer getCel_persona() {
		return cel_persona;
	}

	public void setCel_persona(Integer cel_persona) {
		this.cel_persona = cel_persona;
	}

	public Integer getCod_persona() {
		return cod_persona;
	}

	public void setCod_persona(Integer cod_persona) {
		this.cod_persona = cod_persona;
	}

	public String getNro_cedula_persona() {
		return nro_cedula_persona;
	}

	public void setNro_cedula_persona(String nro_cedula_persona) {
		this.nro_cedula_persona = nro_cedula_persona;
	}

	public String getFecha_factura() {
		return fecha_factura;
	}

	public void setFecha_factura(String fecha_factura) {
		this.fecha_factura = fecha_factura;
	}

	public boolean isDesglose() {
		return desglose;
	}

	public void setDesglose(boolean desglose) {
		this.desglose = desglose;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getAbono() {
		return abono;
	}

	public void setAbono(double abono) {
		this.abono = abono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
