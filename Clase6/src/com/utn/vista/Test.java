package com.utn.vista;

import com.utn.modelo.Auto;
import com.utn.modelo.IMotor;
import com.utn.modelo.Moto;

public class Test {

	public static void main(String[] args) {

//		// creo un objeto de tipo persona
//
//		/*
//		 * Mutabilidad e inmutabilidad
//		 * 
//		 * Teoria: La mutabilidad es un X-MEN una variable que sse incializa de una
//		 * forma y por X razon cambia su valor /
//		 */
//
//		// Ejemplo 1 la variable daniePoder es mutable
//		// String danielPoder="Ciclope";
//		//
//		// System.out.println(danielPoder);
//		//
//		// danielPoder="Pus por ojos";
//		// System.out.println("MUTO!");
//		// System.out.println(danielPoder);
//
//		// Ejemplo 2 Inmutabilidad
//		// final String danielPoder = "Ciclope"; // seteamoss el valor
//		//
//		// System.out.println(danielPoder);
//		//
//		// // danielPoder = "Pus por ojos";
//		// // System.out.println("MUTO!");
//		// System.out.println(danielPoder);
//
//		// ejemplo con objetos inmutables
//		final Persona p1 = new Persona("David", 12345);
//
//		System.out.println(p1.getNombre());
//		System.out.println(p1.getDni());
//
//		System.out.println("Muejeje cambiamos el valor !!!!!");
//		// p1 = new Persona("diego",7890); no se puede volver a inicializar porque p1 es
//		// inmutable
//		// p1.setNombre("Diego");
//		p1.setDni(7890);
//
//		System.out.println(p1.getNombre());
//		System.out.println(p1.getDni());
//
//		// Mutabilidad no va a dar ningun error a la hora de volver a inicializar el
//		// objeto
//		Persona p2 = new Persona("lucas", 1234123);
//
//		System.out.println(p2.getNombre());
//		p2 = new Persona("Julian", 12312312);
//		System.out.println(p2.getNombre());
//
//		// asociacion entre inmutables y mutables
//		final Persona p3 = new Persona("Mauro", 12345);
//		System.out.println(p3.getNombre() + " <.... P3 inmutable nombre");
//		p3.asignoValoresFamilares("Jonathan", 123123);
//
//		System.out.println(p3.getNombre() + " <.... P3 se modifica por el metodo asignoValoresFamilares");
//		Persona p4 = p3; // es la misma posicion de memoria
//
//		Persona p5 = p3;
//		Persona p6 = p3;
//		p5.setDni(0011);
//
//		System.out.println(p6.getDni() + " <---- muestro p5.setDni(9) pero en realidad ejecuto p6.getDni()");
//		// p4.setNombre("Agustona");
//		System.out.println(p3.getNombre() + " <-----");
//		// p4.setNombre("firifluasd");
//		System.out.println(p4.getNombre());
//		p4 = new Persona("Roxana", 98765);
//		System.out.println(p4.getNombre());

		
		IMotor a1 = new Auto();  //implements IMotor
		
		IMotor m1 = new Moto(); //implements IMotor
		
		a1.encender("gasoil");
		a1.combustion();
		
		m1.encender("Nafta");
		m1.combustion();
		
	}

}
