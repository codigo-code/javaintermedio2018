package com.utn.controlador;

import java.util.Scanner;

import com.utn.modelo.Caballo;
import com.utn.modelo.Mamifero;
import com.utn.modelo.Perro;
import com.utn.modelo.Persona;
import com.utn.modelo.Vaca;

public class MamiferoControlador {
	
	//public void creoMamifero() {//String tipo) {
		
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
//		Mamifero m1=null;
//		//dependiendo del tipo creo una instasncia de persona o perro
//		if(tipo.equals("persona")) {
//			//uso m1 para instanciar una persona
//			m1 = new Persona("Joaquin",70.5,1.7,27,"Argentino");
//		}
//		
//		if(tipo.equals("perro")) {
//			m1 = new Perro("boby",15,0.75,5,"bulldog");
//		}
//		
//		if(tipo.equals("gato")) {
//			m1 = new Gato("silvestre",10,0.7,3,"abisinio");
//		}
//		
//		System.out.println(m1);
//	
//	
		//buscar que tienen en comun las clases, en este caso todas extienden de mamifero
		public Mamifero creoMamifero(String tipo) {
			Mamifero mami = null;
			
			//pilar de polimorfismo (factoria abstracta)
			switch(tipo.toLowerCase()) {
			case "persona":
				mami = new Persona("Santiago",60.0,1.77,25,"Colombiano");
				break;
			case "perro":
				mami = new Perro("boby",7.0,0.5,7,"caniche");
				break;
			case "caballo":
				mami = new Caballo("boby",7.0,0.5,7);
				break;
			case "vaca":
				mami = new Vaca("lola",400.0,1.5,4,false);
				break;
			case "gato":
				mami = new Perro("michi",7.0,0.5,7,"siames");
				break;
			default:
				System.out.println("no conozco el tipo, la instancia va vacia");
					
			}
			return mami;
		}
		
		private Mamifero asignoValores() { //(String nombre, double peso, double altura, int edad) {
			Scanner input = new Scanner(System.in);
			System.out.println("escriba el nombre");
			String nombre = input.nextLine();
			
			return null;
		}
	}

//}
