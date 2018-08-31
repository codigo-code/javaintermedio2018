package com.utn.modelo;

public abstract class Transporte {
	private double tarifa;
	private int cantPasajeros;
	private String recorrido;
	public double getTarifa() {
		return tarifa;
	}
	public int getCantPasajeros() {
		return cantPasajeros;
	}
	public String getRecorrido() {
		return recorrido;
	}
	public Transporte(double tarifa, int cantPasajeros, String recorrido) {
		super();
		this.tarifa = tarifa;
		this.cantPasajeros = cantPasajeros;
		this.recorrido = recorrido;
	}
	
	//metodo abstracto
	public abstract double cobrarYDarVuelto(double dineroRecibido);

}
