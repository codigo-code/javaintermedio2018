package com.utn.modelo;

public abstract class Transporte {
	private int cantPasajeros;
	private String recorrido;
	private double saldoFinal;
	
	public int getCantPasajeros() {
		return cantPasajeros;
	}
	public String getRecorrido() {
		return recorrido;
	}
	public double getSaldoFinal() {
		return saldoFinal;
	}
	public Transporte(int cantPasajeros, String recorrido,double saldoFinal) {
		super();
		this.cantPasajeros = cantPasajeros;
		this.recorrido = recorrido;
		this.saldoFinal = saldoFinal;
	}
	
	//metodo abstracto
	public abstract double cobrarYDarVuelto(double dineroRecibido);
	
	public abstract double calcularSube(double saldoSube);//no pude hacer funcionar este metodo dentro de la clase colectivo aunque es propio de esa clase

}
