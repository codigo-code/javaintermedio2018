package com.utn.modelo;

//Ejercicio N 1 aplicando Generalizacion
public abstract class Producto {

	private String marca;
	private Object talle;
	private double precio;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Object getTalle() {
		return talle;
	}
	public void setTalle(Object talle) {
		this.talle = talle;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Producto(String marca, Object talle, double precio) {
		super();
		this.marca = marca;
		this.talle = talle;
		this.precio = precio;
	}
	
	
}
