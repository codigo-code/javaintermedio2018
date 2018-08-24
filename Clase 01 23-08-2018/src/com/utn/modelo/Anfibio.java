package com.utn.modelo;

public class Anfibio extends Animal
{

	public Anfibio(String nombre, double peso, double altura, int edad) {
		super(nombre, peso, altura, edad);
		// TODO Auto-generated constructor stub
	}

	public void comunicarse() {
		System.out.println("Hola soy un anfibio");
			
		}


	@Override
	public String dormir(double horas) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "Anfibio [getNombre()=" + getNombre() + ", getPeso()=" + getPeso() + ", getAltura()=" + getAltura()
				+ ", getEdad()=" + getEdad() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	


}
