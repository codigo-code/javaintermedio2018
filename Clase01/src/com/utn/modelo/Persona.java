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

	@Override
	public void comunicarse() {
		System.out.println("Hola soy una persona!");
		
	}

	@Override
	public String dormir(double horas) {
		if (horas > 10)
		return "durmio como un bebé";
		else if (horas < 5 && horas >9) {
			return "durmio meehhhhh";
		}else {
			System.out.println("Durmio como el ogt");
		}
		return null;
	
	}

	@Override
	public String toString() {
		return "Persona [nacionalidad=" + nacionalidad + "]";
	}
	
	
}
