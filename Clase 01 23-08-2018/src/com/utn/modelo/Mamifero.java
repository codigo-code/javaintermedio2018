package com.utn.modelo;

public class Mamifero extends Animal {

	private int cantidadDeMamiferos;
	
	public Mamifero(String nombre, double peso, double altura, int edad,int cantidadDeMamiferos) {
		super(nombre, peso, altura, edad);
		this.cantidadDeMamiferos = cantidadDeMamiferos;
		
		 
		
	}

	public int getCantidadDeMamiferos() {
		return cantidadDeMamiferos;
	}

	public void setCantidadDeMamiferos(int cantidadDeMamiferos) {
		this.cantidadDeMamiferos = cantidadDeMamiferos;
	}
	
	
	@Override
	public String toString() {
		return "Mamifero [getNombre()=" + getNombre() + ", getPeso()=" + getPeso() + ", getAltura()=" + getAltura()
				+ ", getEdad()=" + getEdad() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public void comunicarse() {
	System.out.println("Hola soy un mamifero");
		
	}

	public String dormir (double horas) {
		if (horas>=10)
		{
			return "Domio una guasada";
		}
		else if (horas>=5 && horas <10)
		{
			return "Aunque sea durmio";
		}
		else
		{
			return "Giroso";
		}
	}

}
