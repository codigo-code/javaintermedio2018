package com.utn.vista;

import java.util.ArrayList;

import com.utn.controlador.ProductoControlador;
import com.utn.modelo.Pantalon;
import com.utn.modelo.Producto;
import com.utn.modelo.Tipo;

public class Test {

	public static void main(String[] args) {

		ProductoControlador pc = new ProductoControlador();
		 
		//bajo la instancia de una camisa
		 Producto p1= pc.creoProducto(Tipo.CAMISA, "Nike", "M", 2000);
		 Producto p2 = pc.creoProducto(Tipo.ZAPATILLA, "Avidas", 12, 3500);
		 Producto p3 = pc.creoProducto(Tipo.PANTALON, "Legacy", 58.5, 4000);
		 
		 
		pc.asignoProductoLista(p1);
		pc.asignoProductoLista(p2);		 
		pc.asignoProductoLista(p3);
		
		pc.muestroProductoLista();
		
		 // forma cabeza	
//		 System.out.println(p1.getClass().getSimpleName()+" => "+  p1.getMarca()+ " " + p1.getPrecio() + " " + p1.getTalle());
//		 System.out.println(p2.getClass().getSimpleName()+" => "+ p2.getMarca()+ " " + p2.getPrecio() + " " + p2.getTalle());
//		 System.out.println(p3.getClass().getSimpleName()+" => "+p3.getMarca()+ " " + p3.getPrecio() + " " + p3.getTalle());
	}

}