package com.utn.controlador;

import com.utn.modelo.Caballo;
import com.utn.modelo.Mamifero;
import com.utn.modelo.Perro;
import com.utn.modelo.Persona;
import com.utn.modelo.Vaca;

public class MamiferoControlador {
	
//	public void creoMamifero() {
//		
//		/*
//		 * Creacion de objeto => instancias
//		 * dos conceptos
//		 */
//		
//		  //1)crear el objeto directamente por la clase que queremos o que vamos a utilizar
//
//		 
//		 //Persona p1= new Persona ("joaquin", 70.5, 1.70, 27, "Argentino");
//		  
//
//		  //2) por factoria abstracta
//
//		 
//		 //Mamifero m1 = new Persona ("Claudia", 50.0, 1.70, 28, "Argentina");
//		 
//
//		  //3)la que no vamos a podeR
//		  //Mamifero m2 = new Mamifero("Flor", 70, 1.40, 50);
//		  //NO SE PUEDE INSTANCIAR UNA CLASE ABSTRACTA
//		
//		
//		
//		
//		//persona y perro extienden de mamifero
//		Mamifero m1=null;
//		
//		//dependiendo el tipo creare una instancia de persona o perro
//		if(tipo.equals("Persona")); {
//			//utilizo m1 para instanciar una persona
//			m1 = new Persona("joaquin", 70.5, 1.70, 27, "Argentino");
//		}
//		
//		if(tipo.equals("Perro")); {
//			//utilizo m1 para instanciar un perro
//			m1 = new Perro("Sparkly", 30, 0.70, 10, "bulldog");
//		}
//		
//		//ya que sobre-escribi  tostring de la clase mamifero
//		//lo imprimo por pantalla
//		System.out.println(m1);
//	}
	
	
	
	//tenemos que buscar que tienen en comun todas las clases (en este caso mamifero)
	public Mamifero creoMamifero(String tipo) {
		Mamifero mami = null;
		// a partir de un tipo podemos sacar 5 instancias distintas

		
		
		
		
		
		// pilar de polimorfismo ( Factoria abstracta)
		switch (tipo.toLowerCase()) {
		case "persona":
			mami = new Persona("Santiago", 60.0, 1.89, 25, "Colombiano");
			break;
		case "perro":
			mami = new Perro("Bobby", 7.0, 0.50, 6, "Caniche");
			break;
		case "caballo":
			mami = new Caballo("Mr Ed", 100.0, 2.0, 7);
			break;
		case "vaca":
			mami = new Vaca("Lola", 400.0, 1.50, 4, false);
			break;
		default:
			System.out.println("no conozco el tipo por ende la instancia viene vacia!");
			break;
		}

		return mami;
	}

}
