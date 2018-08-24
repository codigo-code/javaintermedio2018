package com.utn.modelo;

public abstract class Mamifero {
	
	private String nombre;
	private double peso;
	private double altura;
	private int edad;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
	//creo constructor
	public Mamifero(String nombre, double peso, double altura, int edad) {
		this.nombre = nombre;
		this.peso = peso;
		this.altura = altura;
		this.edad = edad;
	}
	
	//Metodos Abstarctos
	/*
	 * Descripcion: un metodo abstracto no esta implementado 
	 * quiere decir que dicha implementacion se hara en la clase
	 * extendida (derivada)
	 */
	
	public abstract void comunicarse();
	
	//Metodo abstracto puede llevar los parametres que quieran
	
	public abstract String dormir(double horas);
	
}
