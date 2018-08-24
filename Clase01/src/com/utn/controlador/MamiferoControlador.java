package com.utn.controlador;

import com.utn.modelo.Gato;
import com.utn.modelo.Mamifero;
import com.utn.modelo.Perro;
import com.utn.modelo.Persona;

public class MamiferoControlador {
	
	public void creoMamifero(String tipo) {
		
		//creacion de objetos => instancias
		//dos conceptos
		
		 // 1-Crear el objeto directamente por la clase que queremos utilizar
		 		//Persona p1 = new Persona("Joaquin",70.5,1.7,27,"Argentino");
		
		// 2-por factoria abstract
		 		//Mamifero m1 = new Persona("Claudia",50.0,1.7,28,"Argentina");
		
		//3-La que no vamos a poder utilizar mas
//		Mamifero m2 = new Mamifero("Flor",70,1.4,50);
		//NO SE PUEDE INSTANCIAR UNA CLASE ABSTRACTA
		 		
		//persona y perro extienden de mamifero
		Mamifero m1=null;
		//dependiendo del tipo creso una instasncia de persona o perro
		if(tipo.equals("persona")) {
			//uso m1 para instanciar una persona
			m1 = new Persona("Joaquin",70.5,1.7,27,"Argentino");
		}
		
		if(tipo.equals("perro")) {
			m1 = new Perro("boby",30,0.7,5,"bulldog");
		}
		
		if(tipo.equals("gato")) {
			m1 = new Gato("silvestre",10,0.7,3,"abisinio");
		}
		
		System.out.println(m1);
	
	
	}

}
