package com.utn.modelo;

public class Heladero {

	String nombre;
	int legajo;
	int distanciaRecorridaMensualmente;
	int cantPedidosAsignados;
	
	
	public Heladero(String nombre, int legajo, int distanciaRecorridaMensualmente, int cantPedidosAsignados) {
		super();
		this.nombre = nombre;
		this.legajo = legajo;
		this.distanciaRecorridaMensualmente = distanciaRecorridaMensualmente;
		this.cantPedidosAsignados = cantPedidosAsignados;
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


	public int getDistanciaRecorridaMensualmente() {
		return distanciaRecorridaMensualmente;
	}


	public void setDistanciaRecorridaMensualmente(int distanciaRecorridaMensualmente) {
		this.distanciaRecorridaMensualmente = distanciaRecorridaMensualmente;
	}


	public int getCantPedidosAsignados() {
		return cantPedidosAsignados;
	}


	public void setCantPedidosAsignados(int cantPedidosAsignados) {
		this.cantPedidosAsignados = cantPedidosAsignados;
	}
	
	
	
	
}
