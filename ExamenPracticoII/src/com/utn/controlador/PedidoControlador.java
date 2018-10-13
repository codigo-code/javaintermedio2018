package com.utn.controlador;

import java.util.Scanner;

import com.utn.modelo.Pedido;

public class PedidoControlador {
	
	public Pedido hacerPedido(Pedido pedido) {
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese cantidad bebida con alcohol");
		int cantC = input.nextInt();
		pedido.setConAlcohol(cantC);
		System.out.println("Ingrese cantidad bebida con alcohol");
		int cantS = input.nextInt();
		pedido.setConAlcohol(cantS);
		
		int cant = cantC + cantS;
		if(cant < 100) {
			System.out.println("El pedido debe ser de 100 botellas minimo");
			System.out.println("Ingrese nueva cantidad");
			cant = input.nextInt();
		}
		
		
		return pedido;
	}

}
