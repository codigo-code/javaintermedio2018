package com.utn.vista;
import java.util.Scanner;

import com.utn.controlador.TransporteControlador;


public class Test {
	public static void main(String[] args) {
		//creamos la instancia del constructor
		
		TransporteControlador tc = new TransporteControlador();
		
		//creamos el objeto para pedir datos por pantalla
		Scanner input = new Scanner(System.in);
		
		//creamos las variables que necesitamos para crear el objeto
		System.out.println("Que va  a tomar?");
		String tipo = input.nextLine();
		
		if (tipo.equalsIgnoreCase("taxi")) {
			
		}else if (tipo.equalsIgnoreCase("colectivo")){
			
		}else {
			System.out.println("Disculpe ese tipo de transporte no esta disponible");
			return;
		}
	}
	

}
