package com.utn.modelo;

public abstract class Informe {

	private Vehiculo vehiculo;
	private String tipo;
	private Cliente cliente;
	private String observaciones;
	
	public Informe() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Informe(Vehiculo vehiculo, String tipo, Cliente cliente, String observaciones) {
		super();
		this.vehiculo = vehiculo;
		this.tipo = tipo;
		this.cliente = cliente;
		this.observaciones = observaciones;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	
	
	
	
	
}
