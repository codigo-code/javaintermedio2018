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
	
	public String getRaza() {
		return raza;
	}



	public void setRaza(String raza) {
		this.raza = raza;
	}



	@Override
	public void comunicarse() {
		System.out.println("Meooouuuu");
		
	}

	@Override
	public String dormir(double horas) {
		return "Hizo vida de gato";
	}

	@Override
	public String toString() {
		return "Gato: nombre= " + getNombre() + " peso= " + getPeso() + " altura= " + getAltura() + " edad= " + getEdad() + " raza= " + raza + "";
//		return "Gato [raza=" + raza + "]";
	}
	
	

}
