package com.utn.vista;

import java.util.Scanner;

import com.utn.controlador.AnimalControlador;
import com.utn.modelo.Tipo;

public class TestVet {

	public static void main(String[] args) {
		AnimalControlador ac = new AnimalControlador();
		
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {

			System.out.println("Que animal trajo?");
			String tipo = input.next();
			
			if (tipo.equalsIgnoreCase("conejo")) {
				System.out.println("Ingrese raza del conejo");
				String raza = input.next();
				System.out.println("Ingrese edad");
				int edad = input.nextInt();
				System.out.println("Ingrese causa de atencion");
				String causaAtencion = input.next();
				ac.crearAnimal(Tipo.CONEJO, raza, edad, causaAtencion);
			}else if(tipo.equalsIgnoreCase("perro")){
				System.out.println("Ingrese raza del perro");
				String raza = input.next();
				System.out.println("Ingrese edad");
				int edad = input.nextInt();
				System.out.println("Ingrese causa de atencion");
				String causaAtencion = input.next();			
				ac.crearAnimal(Tipo.PERRO, raza, edad, causaAtencion);

			}else if(tipo.equalsIgnoreCase("gato")){
				System.out.println("Ingrese raza del michi");
				String raza = input.next();
				System.out.println("Ingrese edad");
				int edad = input.nextInt();
				System.out.println("Ingrese causa de atencion");
				String causaAtencion = input.next();			
				ac.crearAnimal(Tipo.GATO, raza, edad, causaAtencion);
			}else {
				System.out.println("No atendemos ese tipo de animal, gracias por su consulta");
			}
		}

		ac.muestroListaAnimales();
						
	}

	
	
}
