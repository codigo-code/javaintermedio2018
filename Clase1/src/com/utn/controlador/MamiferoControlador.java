package com.utn.controlador;

import java.util.Scanner;

import com.utn.modelo.Caballo;
import com.utn.modelo.Mamifero;
import com.utn.modelo.Perro;
import com.utn.modelo.Persona;
import com.utn.modelo.Vaca;

public class MamiferoControlador {

	// public void creoMamifero() {

	// Creacion de objetos => instancias

	// dos conceptos

	/*
	 * 1) Crear el objeto directamente por la clase que queremos o que vamo a
	 * utilizar
	 */

	// Persona p1 = new Persona("Joaquin",70.5,1.70,27,"Argentino");

	// //2) por factoria abstract
	//// Mamifero m1 = new Persona("Claudia",50.0,1.70,28,"Argentina");
	//
	// //3) La que no vamos a poder utilizar mas
	//// Mamifero m2 = new Mamifero("Flor", 70, 1.40, 50);
	// //NO SE PUEDE INSTANCIAR UNA CLASE ABSTRACTA
	//
	// //Persona y Perro exitenden de mamifero
	// Mamifero m1=null;
	//
	// //dependiendo el tipo creare una instancia de Persona o Perro
	//// if(tipo.equals("persona")) {
	// //utilizo m1 para instanciar una Persona
	//// m1 = new Persona("Joaquin",70.5,1.70,27,"Argentino");
	// }
	//
	// if(tipo.equals("perro")) {
	// //utilizo m1 para crear una instanacia de Perro
	// m1 = new Perro("Sparkly", 30, 0.70, 10, "bulldog");
	// }
	//
	// //ya que sobre-escribi toString de la clase Mamifero
	// //lo imprimo por pantalla
	// System.out.println(m1);
	// }
	//
	//

	// Tenemos que buscar que tienen en comun las clases
	// En este caso todas extenden de mamifero
	public Mamifero creoMamifero(String tipo) {

		return asignoValores(tipo);
	}

	private Mamifero asignoValores(String tipo) {
		Mamifero m = null;
		Scanner input = new Scanner(System.in);
		System.out.println("escriba el nombre");
		String nombre = input.nextLine();

		System.out.println("ingrese el peso");
		double peso = input.nextDouble();

		System.out.println("ingrese la altura");
		double altura = input.nextDouble();

		System.out.println("ingrese la edad");
		int edad = input.nextInt();
		String nacionalidad = "";
		String raza = "";

		if (tipo == "persona") {
			System.out.println("Ingrese la nacionalidad");
			nacionalidad = input.next();
			
			m = new Persona(nombre, peso, altura, edad, nacionalidad);
		} else if (tipo.equals("perro")) {
			raza = input.next();
			m = new Perro(nombre, peso, altura, edad, raza);
		} else if (tipo.equals("caballo")) {
			m = new Caballo(nombre, peso, altura, edad);
		} else {
			m = new Vaca(nombre, peso, altura, edad, false);
		}

		return m;
	}

}
