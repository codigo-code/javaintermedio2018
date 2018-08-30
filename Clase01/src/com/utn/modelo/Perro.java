package com.utn.modelo;

public class Perro extends Mamifero {
	
	private String raza;

//	public Perro(String nombre, double peso, double altura, int edad) {
//		super(nombre, peso, altura, edad);
//		this.raza=raza;
//	}

	public Perro(String nombre, double peso, double altura, int edad, String raza) {
		super(nombre, peso, altura, edad);
		this.raza = raza;
	}

	
	@Override
	public void comunicarse() {
		System.out.println("Wooof");

	}

	@Override
	public String dormir(double horas) {
		return "Durmio todo el dia";
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	@Override
	public String toString() {
		return "Perro: nombre= " + getNombre() + " peso= " + getPeso() + " altura= " + getAltura() + " edad= " + getEdad() + " raza=" + raza + "";
	}


}
