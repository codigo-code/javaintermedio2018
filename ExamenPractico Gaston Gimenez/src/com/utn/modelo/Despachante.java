package com.utn.modelo;

public class Despachante {

	String nombre;
	int legajo;
	boolean trabajo;
	
	
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
	public boolean isTrabajo() {
		return trabajo;
	}
	public void setTrabajo(boolean trabajo) {
		this.trabajo = trabajo;
	}
	
	
	public Despachante(String nombre, int legajo, boolean trabajo) {
		super();
		this.nombre = nombre;
		this.legajo = legajo;
		this.trabajo = trabajo;
	}
	
	
	
	
}
