package com.utn.modelo;

import java.util.Scanner;

public class Cono extends Recipiente {
	

	public Cono(String primerSabor, String segundoSabor) {
		super(primerSabor, segundoSabor);
	}

	public void rellenar() {

		Scanner in = new Scanner (System.in);
		System.out.println("¿Que gustos desea agregar a su pedido?");
		primerSabor = in.nextLine();
		System.out.println("Seleccione otro gusto");
		segundoSabor = in.next();
		System.out.println("Cono cargado correctamente");
		
	}
	

	
	
	

	

	
	

}
