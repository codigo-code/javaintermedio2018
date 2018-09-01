package com.utn.vista;

import java.util.Scanner;

import com.utn.controlador.TransporteControlador;
import com.utn.modelo.TipoTransporte;

public class Test {

	public static void main(String[] args) {

		// creamos la instancia del constrcutor
		TransporteControlador tc = new TransporteControlador();

		// creamos el objeto para pedir datos x la pantalla
		Scanner input = new Scanner(System.in);

		// creamos las variables que necesitaremos para crear el objeto taxi o colectivo

		for (int i = 0; i < 2; i++) {
			System.out.println("Señor/a que va a tomar? ");
			String tipo = input.next();

			if (tipo.toLowerCase().equalsIgnoreCase("taxi")) {
				System.out.println("Taxista ve cuantos monos van a subir");
				System.out.println("ingrese la cantidad de personas");
				int cantPasajeros = input.nextInt();

				System.out.println("Hasta donde va doña!");
				String recorrido = input.next();

				System.out.println("Soy un tachero muy honesto y te garcho");

				tc.creoTransporte(TipoTransporte.TAXI, 500.0, recorrido, cantPasajeros);
			} else if (tipo.toLowerCase().equals("colectivo")) {

			} else {
				System.out.println("Disculpe ese  tipo de transporte no lo conozco");
				return;
			}
		}
		
		tc.muestroListaTransporte();
	}

}
