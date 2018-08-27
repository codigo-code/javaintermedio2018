package com.utn.modelo;

public class Caballo extends Mamifero {

	public Caballo(String nombre, double peso, double altura, int edad) {
		super(nombre, peso, altura, edad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void comunicarse() {
		System.out.println("???????");
		
	}

	@Override
	public String dormir(double horas) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
