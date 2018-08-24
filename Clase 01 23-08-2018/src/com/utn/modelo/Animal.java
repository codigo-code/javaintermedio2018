package com.utn.modelo;

public abstract class Animal {
	
	//Atributos
	private String nombre;
	private double peso, altura;
	private int edad;
	
	//Metodos 
	
	public abstract void comunicarse ();
	public abstract String dormir (double horas);
	
	
	
	
	//Constructor
	public Animal(String nombre, double peso, double altura, int edad) {
		super();
		this.nombre = nombre;
		this.peso = peso;
		this.altura = altura;
		this.edad = edad;
	}
	
	
	//Getters y Setters
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
	
	

}
