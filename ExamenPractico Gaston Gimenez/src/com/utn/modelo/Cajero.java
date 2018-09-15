package com.utn.modelo;

public class Cajero {

	String nombre;
	int legajo;
	int cantidadDePedidos;
	
	
	
	public Cajero(String nombre, int legajo, int cantidadDePedidos) {
		super();
		this.nombre = nombre;
		this.legajo = legajo;
		this.cantidadDePedidos = cantidadDePedidos;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getLegajo() {
		return legajo;
	}



	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}



	public int getCantidadDePedidos() {
		return cantidadDePedidos;
	}



	public void setCantidadDePedidos(int cantidadDePedidos) {
		this.cantidadDePedidos = cantidadDePedidos;
	}
	
	
	
	
}
