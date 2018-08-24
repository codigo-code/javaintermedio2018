package com.utn.modelo;

public class Pez extends Animal {

	public Pez(String nombre, double peso, double altura, int edad) {
		super(nombre, peso, altura, edad);
		// TODO Auto-generated constructor stub
	}

	public void comunicarse() {
		System.out.println("Hola soy un pez");
			
		}

	@Override
	public String dormir(double horas) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "Pez [getNombre()=" + getNombre() + ", getPeso()=" + getPeso() + ", getAltura()=" + getAltura()
				+ ", getEdad()=" + getEdad() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
