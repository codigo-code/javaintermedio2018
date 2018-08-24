package com.utn.controlador;

import com.utn.modelo.Mamifero;
import com.utn.modelo.Perro;
import com.utn.modelo.Persona;

public class MamiferoControlador {

	public void creoMamifero(String tipo) {
		
		//Creacion de objetos => instancias
		
		//dos conceptos
		
		/*
		 * 1) Crear el objeto directamente por la clase
		 * que queremos o que vamo a utilizar 
		 */
		
//		Persona p1 = new Persona("Joaquin",70.5,1.70,27,"Argentino");

		
		//2) por factoria abstract
//		Mamifero m1 = new Persona("Claudia",50.0,1.70,28,"Argentina");
		
		//3) La que no vamos a poder utilizar mas
//		Mamifero m2 = new Mamifero("Flor", 70, 1.40, 50);
		//NO SE PUEDE INSTANCIAR UNA CLASE ABSTRACTA

		//Persona y Perro exitenden de mamifero
		Mamifero m1=null;
		
		//dependiendo el tipo creare una instancia de Persona o Perro
		if(tipo.equals("persona")) {
			//utilizo m1 para instanciar una Persona
			m1 = new Persona("Joaquin",70.5,1.70,27,"Argentino");
		}
		
		if(tipo.equals("perro")) {
			//utilizo m1 para crear una instanacia de Perro
			m1 = new Perro("Sparkly", 30, 0.70, 10, "bulldog");
		}
		
		//ya que sobre-escribi toString de la clase Mamifero
		//lo imprimo por pantalla
		System.out.println(m1);
	}
	
	
}
