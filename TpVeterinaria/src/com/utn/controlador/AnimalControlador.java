package com.utn.controlador;

import java.util.Scanner;

import com.utn.modelo.Animal;
import com.utn.modelo.Tipo;

public class AnimalControlador {
	
	public AnimalControlador() {}
	
	public void crearAnimal(Tipo tipo, String raza, int edad,String causaAtencion) {
		Scanner input = new Scanner(System.in);
		Animal a = null;
		
		switch(tipo) {
		case CONEJO:
			a = new Animal(tipo, raza,edad,causaAtencion);
			ingresarAnimal();
			
			break;
		case PERRO:
			a = new Animal(tipo, raza,edad,causaAtencion);
			ingresarAnimal();
			break;
			
		case GATO:
			a = new Animal(tipo, raza,edad,causaAtencion);
			ingresarAnimal();
			break;
		default:
			break;
		}
	}
	
	public void ingresarAnimal() {
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese tipo de animal");
		String tipo = input.next();
		System.out.println("Ingrese raza");
		String raza = input.next();
		System.out.println("Ingrese edad");
		int edad = input.nextInt();
		System.out.println("Ingrese causa de atencion");
		String causaAtencion = input.next();
		
	}
	
	

}
