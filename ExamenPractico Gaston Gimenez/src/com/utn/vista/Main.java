package com.utn.vista;

import java.util.Scanner;

import com.utn.controlador.CajeroControlador;
import com.utn.controlador.HeladeroControlador;
import com.utn.controlador.PedidoControlador;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Sistema de Heladeria");
		System.out.println("Usted es...?");
		System.out.println("1-Cliente");
		System.out.println("2-Empleado");
		System.out.println("3-Dueño");
		int opcion = in.nextInt();
		
		switch (opcion)
		{
			case 1: 
				PedidoControlador pc = new PedidoControlador();
				CajeroControlador cc = new CajeroControlador();
				pc.menuInicial();
				int opc = in.nextInt();
				pc.rellenarHelado(opc);
				break;
			case 2:
				System.out.println("Esto no es parte del enunciado, fue para hacer mas real el menu");
				break;
			case 3:
				System.out.println("Seleccione una opcion");
				System.out.println("1- Ver heladero del mes");
				System.out.println("2- Cargar heladero");
				int op = in.nextInt();
				if (op == 1)
				{
					HeladeroControlador hc = new HeladeroControlador ();
					hc.mejorHeladero();
				}
				else if (op == 2)
				{
					HeladeroControlador hc = new HeladeroControlador ();
					hc.cargarHeladero();
				}
		}
	

	}

}
