package com.utn.vista;

import java.util.Scanner;

import com.utn.controlador.AnimalControlador;
import com.utn.modelo.Tipo;
import com.utn.modelo.Animal;

public class TestVet {

	public static void main(String[] args) {
		AnimalControlador ac = new AnimalControlador();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Que animal trajo?");
		String tipo = input.next();
		
		if (tipo.equalsIgnoreCase("conejo")) {
			String raza = input.next();
			int edad = input.nextInt();
			String causaAtencion = input.next();
			
			ac.crearAnimal(Tipo.CONEJO, raza, edad, causaAtencion);
		}

	}

}
