package com.utn.modelo;
/*
 * Persona extiende de la clase Mamifero
 */

public class Persona extends Mamifero {
	
	private String nacionalidad;
	
	//constructor de la clase Persona
	public Persona(String nombre, 
					double peso, 
					double altura, 
					int edad,
					String nacionalidad) {
		//invoca al constructor de la clase mamifero
		super(nombre, peso, altura, edad);//hace referencia a los atributos del constructor de la super clase =>scope global
		this.nacionalidad=nacionalidad;//hace referencia al atributo de la clase =>scope local
		
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	

}
