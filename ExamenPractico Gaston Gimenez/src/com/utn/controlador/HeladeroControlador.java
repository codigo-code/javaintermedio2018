package com.utn.controlador;

import java.util.Scanner;
import java.util.Vector;

import com.utn.modelo.Heladero;

public class HeladeroControlador {

	Scanner in = new Scanner (System.in);
	Vector <Heladero> heladeros = new Vector <Heladero> ();
	Heladero h1 = new Heladero ("Juan", 5324, 1000, 10);
	Heladero h2 = new Heladero ("Lucas", 3629, 3021, 9);
	Heladero h3 = new Heladero ("Roberto", 4832, 2019,11);
	Heladero h4 = new Heladero ("Guido" , 7438, 2039, 8);
	
	public void mejorHeladero()
	{
		System.out.println("Cargando resultados...");
		System.out.println("Juntando toda la informacion necesaria...");
		double primerHeladero = h1.getDistanciaRecorridaMensualmente() / h1.getCantPedidosAsignados();
		double segundoHeladero = h2.getDistanciaRecorridaMensualmente() / h2.getCantPedidosAsignados();
		double tercerHeladero = h3.getDistanciaRecorridaMensualmente() / h3.getCantPedidosAsignados();
		double cuartoHeladero = h4.getDistanciaRecorridaMensualmente() / h4.getCantPedidosAsignados();
		
		if (primerHeladero> segundoHeladero && primerHeladero> tercerHeladero && primerHeladero>cuartoHeladero)
		{
			System.out.println(h1.getNombre() + " es el Heladero del mes");
			System.out.println("Ha ganado un bono del 20%");
		}
		else if (segundoHeladero> primerHeladero && segundoHeladero> tercerHeladero && segundoHeladero> cuartoHeladero)
		{
			System.out.println(h2.getNombre() + " es el Heladero del mes");
			System.out.println("Ha ganado un bono del 20%");
		}
		else if (tercerHeladero> primerHeladero && tercerHeladero > segundoHeladero && tercerHeladero > cuartoHeladero)
		{
			System.out.println(h3.getNombre() + " es el Heladero del mes");
			System.out.println("Ha ganado un bono del 20%");
		}
		else
		{
			System.out.println(h4.getNombre() + " es el Heladero del mes");
			System.out.println("Ha ganado un bono del 20%");
		}
 	}

	public void cargarHeladero() {
		

		System.out.println("Bienvenido");
		System.out.println("Ingrese nombre del heladero");
		String nombre = in.nextLine();
		System.out.println("Ingrese legajo del heladero");
		int legajo = in.nextInt();
		Heladero h = new Heladero (nombre,legajo,0,0); //Asigno 0 y 0 porque un heladero nuevo no tiene pedidos ni metros recorridos
		heladeros.add(h);
		System.out.println("Heladero cargado correctamente");
	}
}
