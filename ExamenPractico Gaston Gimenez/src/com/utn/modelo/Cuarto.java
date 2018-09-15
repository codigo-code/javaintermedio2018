package com.utn.modelo;

import java.util.Scanner;

public class Cuarto extends Recipiente  {

	String tercerSabor, saborOpcional;
	@Override
	public void rellenar() {

		Scanner in = new Scanner (System.in);
		System.out.println("¿Que gustos desea agregar a su pedido?");
		primerSabor = in.nextLine();
		System.out.println("Seleccione otro gusto");
		segundoSabor = in.next();
		System.out.println("Seleccione otro gusto");
		tercerSabor = in.next();
		System.out.println("Que gusto opcional desea agregar?");
		System.out.println("1- Crema de vainilla");
		System.out.println("2- Chocolate fundido");
		System.out.println("3- Ninguno");
		int opcion = in.nextInt();
		if (opcion == 1)
		{
			saborOpcional = "Crema de vainilla" ;
			System.out.println("Cuarto cargado correctamente");
		}
		else if (opcion == 2)
		{
			saborOpcional = "Chocolate fundido" ;
			System.out.println("Cuarto cargado correctamente");
		}
		else if (opcion == 3)
		{
			saborOpcional = null ;
			System.out.println("Cuarto cargado correctamente");
		}
		else
		{
			System.out.println("Opcion invalida");
		}
		
		
		
	}
	public Cuarto(String primerSabor, String segundoSabor,String tercerSabor,String saborOpcional) {
		super(primerSabor, segundoSabor);
		this.tercerSabor = tercerSabor;
		this.saborOpcional = saborOpcional;
	}
	

}
