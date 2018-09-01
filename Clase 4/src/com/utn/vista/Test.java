package com.utn.vista;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

import com.utn.controlador.TransporteControlador;
import com.utn.modelo.TipoTransporte;

public class Test {

	public static void main(String[] args) {
		//creamos la instancia del constructor
		
		TransporteControlador tc = new TransporteControlador();
		
		
		//creamos el objeto para pedir datos por la pantalla
		Scanner imput = new Scanner(System.in);
		
		//creamos las variables que necesitamos poara crear el objeto
		
		System.out.println("señor que va a comar? ");
		String tipo = imput.nextLine();
		
		if (tipo.toLowerCase().equalsIgnoreCase("taxi")) {
			System.out.println("Taxista ve cuantos monos van a subir");
			System.out.println("ingrese la cantidad de personas");
			int cantPasajeros = imput.nextInt();
			
			System.out.println("Hasta donde va doña?!");
			String recorrido = imput.next();
			
			System.out.println("soy un tachero muy honesto y te garcho");
			
			tc.creoTransporte(TipoTransporte.TAXI, 500.0, recorrido, cantPasajeros);
			
		} else if (tipo.toLowerCase().equals("colectivo")) {
			
		}else {
			System.out.println("disculpe ese tipo de transporte no lo conozco");
			return;
		}
		
	}

}
