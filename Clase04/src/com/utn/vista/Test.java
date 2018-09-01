package com.utn.vista;
import java.util.Scanner;

import com.utn.controlador.TransporteControlador;
import com.utn.modelo.Transporte;
import com.utn.modelo.Vehiculo;


public class Test {
	public static void main(String[] args) {
		//creamos la instancia del constructor

		TransporteControlador tc = new TransporteControlador();

		//creamos el objeto para pedir datos por pantalla
		Scanner input = new Scanner(System.in);

		//creamos las variables que necesitamos para crear el objeto

		for (int i = 0; i < 5; i++) {
			System.out.println("Que va  a tomar?");
			String tipo = input.next();

			if (tipo.equalsIgnoreCase("taxi")) {
				System.out.println("Taxista ve cuantos suben");
				System.out.println("ingrese cantidad de pasajeros");
				int cantPasajeros = input.nextInt();

				System.out.println("hasta donde va doña?");
				String recorrido = input.next();

				System.out.println("soy tachero honesto");

				tc.creoTransporte(Vehiculo.TAXI, 500.0, recorrido, cantPasajeros);


			}else if (tipo.equalsIgnoreCase("colectivo")){
				System.out.println("ingrese cantidad de pasajeros");
				int cantPasajeros = input.nextInt();

				System.out.println("hasta donde va?");
				String recorrido = input.next();

				System.out.println("soy bondilero honesto");

				tc.creoTransporte(Vehiculo.COLECTIVO, 11.0, recorrido, cantPasajeros);

			}else {
				System.out.println("Disculpe ese tipo de transporte no esta disponible");
				return;
			}
		}
		tc.muestroListaTrasnporte();
	}


}
