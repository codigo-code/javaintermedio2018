package com.utn.modelo;

public abstract class Transporte {

	private double tarifa;
	private int cantPasajeos;
	private String recorrido;

	public Transporte(double tarifa, int cantPasajeos, String recorrido) {
		super();
		this.tarifa = tarifa;
		this.cantPasajeos = cantPasajeos;
		this.recorrido = recorrido;
	}

	public double getTarifa() {
		return tarifa;
	}

	public int getCantPasajeos() {
		return cantPasajeos;
	}

	public String getRecorrido() {
		return recorrido;
	}
	
	//metodo abstracto
	public abstract double cobrarYDarVuelto(double dineroRecibido);
	

}
