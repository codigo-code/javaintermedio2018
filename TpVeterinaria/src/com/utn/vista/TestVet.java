package com.utn.vista;

import java.util.Scanner;

import com.utn.controlador.AnimalControlador;
import com.utn.modelo.Tipo;

public class TestVet {

	public static void main(String[] args) {
		AnimalControlador ac = new AnimalControlador();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Que animal trajo?");
		String tipo = input.next();
		
		if (tipo.equalsIgnoreCase("conejo")) {
			System.out.println("Ingrese raza");
			String raza = input.next();
			System.out.println("Ingrese edad");
			int edad = input.nextInt();
			System.out.println("Ingrese causa de atencion");
			String causaAtencion = input.next();
			ac.crearAnimal(Tipo.CONEJO, raza, edad, causaAtencion);
		}

				
	}
	
}
