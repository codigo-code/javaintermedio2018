package com.utn.vista;

import java.util.Scanner;

import com.utn.controlador.AnimalControlador;
import com.utn.controlador.Gato;
import com.utn.controlador.Perro;
import com.utn.modelo.Animal;
import com.utn.modelo.Conejo;
import com.utn.modelo.Tipo;

public class TestVet {

	public static void main(String[] args) {
		AnimalControlador ac = new AnimalControlador();
		
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			

			System.out.println("Que animal trajo?");
			String tipo = input.next();
			
			if (tipo.equalsIgnoreCase("conejo")) {
				System.out.println("Ingrese raza del conejo");
				input.nextLine();
				String raza = input.nextLine();
				System.out.println("Ingrese edad");
				int edad = input.nextInt();
				System.out.println("Ingrese causa de atencion");
				input.nextLine();
				String causaAtencion = input.nextLine();
				//Animal a = new Conejo(Tipo.CONEJO, raza,edad,causaAtencion);
				ac.crearAnimal(Tipo.CONEJO, raza, edad, causaAtencion);
			}else if(tipo.equalsIgnoreCase("perro")){
				System.out.println("Ingrese raza del perro");
				input.nextLine();
				String raza = input.nextLine();
				System.out.println("Ingrese edad");
				int edad = input.nextInt();
				System.out.println("Ingrese causa de atencion");
				input.nextLine();
				String causaAtencion = input.nextLine();	
				//Animal a = new Perro(Tipo.PERRO, raza, edad, causaAtencion);
				ac.crearAnimal(Tipo.PERRO, raza, edad, causaAtencion);

			}else if(tipo.equalsIgnoreCase("gato")){
				System.out.println("Ingrese raza del michi");
				input.nextLine();
				String raza = input.nextLine();
				System.out.println("Ingrese edad");
				int edad = input.nextInt();
				System.out.println("Ingrese causa de atencion");
				input.nextLine();
				String causaAtencion = input.nextLine();		
				//Animal a = new Gato(Tipo.GATO, raza, edad, causaAtencion);
				ac.crearAnimal(Tipo.GATO, raza, edad, causaAtencion);
			}else {
				System.out.println("No atendemos ese tipo de animal, gracias por su consulta");
			}
			
		}
		

		ac.muestroListaAnimales();
						
	}

	
	
}
