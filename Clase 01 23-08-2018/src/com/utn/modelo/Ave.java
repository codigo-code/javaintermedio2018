package com.utn.modelo;

public class Ave extends Animal {

	public Ave(String nombre, double peso, double altura, int edad) {
		super(nombre, peso, altura, edad);
		// TODO Auto-generated constructor stub
	}

	public void comunicarse() {
		System.out.println("Hola soy un ave");
			
		}


	@Override
	public String toString() {
		return "Ave [getNombre()=" + getNombre() + ", getPeso()=" + getPeso() + ", getAltura()=" + getAltura()
				+ ", getEdad()=" + getEdad() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	@Override
	public String dormir(double horas) {
		// TODO Auto-generated method stub
		return null;
	}

}
