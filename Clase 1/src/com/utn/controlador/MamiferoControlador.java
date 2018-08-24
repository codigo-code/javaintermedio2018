package com.utn.controlador;

import com.utn.modelo.Mamifero;
import com.utn.modelo.Perro;
import com.utn.modelo.Persona;

public class MamiferoControlador {
	
	public void creoMamifero(String tipo) {
		
		/*
		 * Creacion de objeto => instancias
		 * dos conceptos
		 */
		
		  //1)crear el objeto directamente por la clase que queremos o que vamos a utilizar

		 
		 //Persona p1= new Persona ("joaquin", 70.5, 1.70, 27, "Argentino");
		  

		  //2) por factoria abstracta

		 
		 //Mamifero m1 = new Persona ("Claudia", 50.0, 1.70, 28, "Argentina");
		 

		  //3)la que no vamos a podeR
		  //Mamifero m2 = new Mamifero("Flor", 70, 1.40, 50);
		  //NO SE PUEDE INSTANCIAR UNA CLASE ABSTRACTA
		
		
		
		
		//persona y perro extienden de mamifero
		Mamifero m1=null;
		
		//dependiendo el tipo creare una instancia de persona o perro
		if(tipo.equals("Persona")); {
			//utilizo m1 para instanciar una persona
			m1 = new Persona("joaquin", 70.5, 1.70, 27, "Argentino");
		}
		
		if(tipo.equals("Perro")); {
			//utilizo m1 para instanciar un perro
			m1 = new Perro("Sparkly", 30, 0.70, 10, "bulldog");
		}
		
		//ya que sobre-escribi  tostring de la clase mamifero
		//lo imprimo por pantalla
		System.out.println(m1);
	}
}
