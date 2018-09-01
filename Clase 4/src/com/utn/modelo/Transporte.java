package com.utn.modelo;

public abstract class Transporte {
	
	private double tarifa;
	private int cantPasajero;
	private String recorrido;
	
	public double getTarifa() {
		return tarifa;
	}
	public int getCantPasajero() {
		return cantPasajero;
	}
	public String getRecorrido() {
		return recorrido;
	}
	public Transporte(double tarifa, int cantPasajero, String recorrido) {
		super();
		this.tarifa = tarifa;
		this.cantPasajero = cantPasajero;
		this.recorrido = recorrido;
	}
	
	//metodo abstracto
	
	public abstract double cobrarYDarVuelto(double dineroRecibido);
	
	
}
