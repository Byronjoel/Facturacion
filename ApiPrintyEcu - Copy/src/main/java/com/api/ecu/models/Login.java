package com.api.ecu.models;


public class Login {
	String tipo;
	public S_Usuar data;
	private String token;
	
	
	
	public Login() {
		super();
	}



	public Login(String tipo, S_Usuar data, String token) {
		super();
		this.tipo = tipo;
		this.data = data;
		this.token = token;
	}



	public Login(String tipo, S_Usuar data) {
		super();
		this.tipo = tipo;
		this.data = data;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public S_Usuar getData() {
		return data;
	}



	public void setData(S_Usuar data) {
		this.data = data;
	}



	public String getToken() {
		return token;
	}



	public void setToken(String token) {
		this.token = token;
	}



	
	
	

}
