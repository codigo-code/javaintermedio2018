package com.utn.vista;
//Diego Barletta
import java.util.Scanner;

import com.utn.controlador.BebidaControlador;
import com.utn.controlador.PedidoControlador;

public class Test {

	public static void main(String[] args) {
		
		PedidoControlador pc = new PedidoControlador();
		BebidaControlador bc = new BebidaControlador();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Igrese bebida a preparar");
		String sabor = input.next();
		bc.prepararBebida(sabor);
		
		
		pc.hacerPedido(null);//este null rompe 
		
	}

}

