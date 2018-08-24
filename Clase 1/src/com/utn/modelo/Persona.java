package com.utn.modelo;

public class Persona extends Mamifero {
	private String nacionalidad;
	

	public Persona(String nombre, double peso, double altura, int edad, String nacionalidad) {
		super(nombre, peso, altura, edad);
		
		this.setNacionalidad(nacionalidad);
		
	}


	public String getNacionalidad() {
		return nacionalidad;
	}


	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}


	@Override
	public void comunicarse() {
		// TODO Auto-generated method stub
		System.out.println("Hola soy una persona");
	}


	@Override
	public String dormir(double horas) {
		// TODO Auto-generated method stub
		if (horas> 10)
			
		return "durmio aceptablemente";
		else if (horas>= 5 && horas <= 9) {
			return "durmio mas o menos";
	} else { System.out.println("Durmio como el orto");
		}
	
	return null;
	
	}
	public String toString () {
		return "Mamifero=" super.toString() + "Persona [nacionalidad" + nacionalidad;
		
	}

}
