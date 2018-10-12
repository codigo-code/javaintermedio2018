package com.utn.modelo;

public class Vehiculo {

	private String marca;
	private String modelo;
	private String patente;
	private String motor;
	private String chasis;

	//tenemos el constructor por defecto de la clase object
	public Vehiculo() {
	}
	public Vehiculo(String marca, String modelo, String patente, String motor, String chasis) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.patente = patente;
		this.motor = motor;
		this.chasis = chasis;
	}




	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public String getChasis() {
		return chasis;
	}
	public void setChasis(String chasis) {
		this.chasis = chasis;
	}
	
	
}
