package com.utn.vista;

import java.util.Scanner;

import com.utn.controlador.TransporteControlador;

public class Test {

	public static void main(String[] args) {

		// creamos la instancia del constrcutor
		TransporteControlador tc = new TransporteControlador();

		// creamos el objeto para pedir datos x la pantalla
		Scanner input = new Scanner(System.in);

		// creamos las variables que necesitaremos para crear el objeto taxi o colectivo

		System.out.println("Señor/a que va a tomar? ");
		String tipo = input.nextLine();

		if (tipo.toLowerCase().equalsIgnoreCase("taxi")) {

		} else if (tipo.toLowerCase().equals("colectivo")) {

		} else {
			System.out.println("Disculpe ese  tipo de transporte no lo conozco");
			return;
		}
		
	}

}
