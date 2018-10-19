package com.utn.controlador;

import java.util.ArrayList;
import java.util.Scanner;

import com.utn.modelo.Pedido;

public class PedidoControlador {
	private double porc;
	private double cant;
	private double cantC;
	
	private ArrayList<Pedido> listaPedido;
	
	
	public Pedido hacerPedido() {
		Pedido p1 = new Pedido();
		
		this.listaPedido = new ArrayList<Pedido>();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese tipo de bebida");
		p1.setTipo(input.next());
		System.out.println("Ingrese cantidad bebida con alcohol");
		cantC = input.nextDouble();
		p1.setConAlcohol(cantC);
		System.out.println("Ingrese cantidad bebida sin alcohol");
		double cantS = input.nextDouble();
		p1.setSinAlcohol(cantS);
		this.listaPedido.add(p1);  
		
		cant = cantC + cantS;
		
		this.listaPedido.forEach(item -> {System.out.println("Bebida: " + item.getTipo() + " Cantidad con Alcohol: " + item.getConAlcohol() + " Cantidad sin Alcohol: " + item.getSinAlcohol());});
		System.out.println("Total del pedido: " + cant);
		
//		if(cant < 99.0) {
//		do {
//			System.out.println("El pedido debe ser de 100 botellas minimo");
//			System.out.println("Ingrese nueva cantidad de bebidas con alcohol");
//			cantC = input.nextDouble();
//			System.out.println("Ingrese cantidad bebida sin alcohol");
//			cantS = input.nextInt();
//			cant = cantC + cantS;
//		}
//			while(cant < 99.0); 
//		}
//		porc = cantC/cant;
//		if(porc < 0.1999){
//			//System.out.println("Al menos el 20% del pedido deben ser bebidas con alcohol");
//			do {
//				System.out.println("Al menos el 20% del pedido deben ser bebidas con alcohol");
//				System.out.println("Ingrese nueva cantidad de bebidas con alcohol");
//				cantC = input.nextInt();
//				System.out.println("Ingrese cantidad bebida sin alcohol");
//				cantS = input.nextInt();
//				cant = cantC + cantS;
//				porc = (cantC / cant);
//				System.out.println(porc);
//			}
//				while(porc < 0.1999); 
//		}
		
		
		System.out.println("Cantidad de bebidas con alcohol pedidas: " + cantC);
		System.out.println("Cantidad de bebidas sin alcohol pedidas: " + cantS);
		//Pedido.setSinAlcohol(cantS);
		//Pedido.setConAlcohol(cantC);
		
		return hacerPedido();
	}

}
