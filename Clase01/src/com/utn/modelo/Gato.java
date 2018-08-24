package com.utn.modelo;

public class Gato extends Mamifero {
	
	private String raza;

	public Gato(String nombre, 
				double peso, 
				double altura, 
				int edad,
				String raza) {
		super(nombre, peso, altura, edad);
		this.raza=raza;
		
	}

	@Override
	public void comunicarse() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String dormir(double horas) {
		// TODO Auto-generated method stub
		return null;
	}

}
