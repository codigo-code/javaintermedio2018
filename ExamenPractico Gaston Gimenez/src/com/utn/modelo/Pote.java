package com.utn.modelo;

import java.util.Scanner;

public class Pote extends Recipiente {

	String tercerSabor,cuartoSabor,saborOpcional;
	public Pote(String primerSabor, String segundoSabor, String tercerSabor, String cuartoSabor, String saborOpcional) {
		super(primerSabor, segundoSabor);
		this.tercerSabor = tercerSabor;
		this.cuartoSabor = cuartoSabor;
		this.saborOpcional = saborOpcional;
	}

	@Override
	public void rellenar() {

		Scanner in = new Scanner (System.in);
		System.out.println("¿Que gustos desea agregar a su pedido?");
		primerSabor = in.nextLine();
		System.out.println("Seleccione otro gusto");
		segundoSabor = in.next();
		System.out.println("Seleccione otro gusto");
		tercerSabor = in.next();
		System.out.println("Seleccione otro gusto");
		cuartoSabor = in.next();
		System.out.println("Que gusto opcional desea agregar?");
		System.out.println("1- Crema de vainilla");
		System.out.println("2- Chocolate fundido");
		System.out.println("3- Almendras");
		System.out.println("4- Ninguno");
		int opcion = in.nextInt();
		if (opcion == 1)
		{
			saborOpcional = "Crema de vainilla" ;
			System.out.println("Pote cargado correctamente");
		}
		else if (opcion == 2)
		{
			saborOpcional = "Chocolate fundido" ;
			System.out.println("Pote cargado correctamente");
		}
		else if (opcion == 3)
		{
			saborOpcional = "Almendras" ;
			System.out.println("Pote cargado correctamente");
		}
		else if (opcion == 4)
		{
			saborOpcional = "Ninguno" ;
			System.out.println("Pote cargado correctamente");
		}
		else
		{
			System.out.println("Opcion invalida");
		}
	}

	

}
