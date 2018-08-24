package com.utn.modelo;

public class Persona extends Mamifero {

	private String nacionalidad;
	
	public Persona(String nombre, double peso, double altura, int edad, String nacionalidad) {
		super(nombre, peso, altura, edad);
		this.nacionalidad=nacionalidad;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	@Override
	public void comunicarse() {
		System.out.println("Hola soy una persona");
		
	}

	@Override
	public String dormir(double horas) {
		if (horas>= 10) { 
			return "durmio aceptablemente";
		}	else if (horas <= 5 && horas >= 9) {
			return "durmió mal";	
			} else {
				System.out.println("durmió como el ojete");
			}
		
		return null;
	}

	@Override
	public String toString() {
		return "Persona [nacionalidad=" + nacionalidad + "]";
	}

}
