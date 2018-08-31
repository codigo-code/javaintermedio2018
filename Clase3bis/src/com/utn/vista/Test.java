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
		 
		 Producto[] listaProducto = new Producto[3];
		 listaProducto[0]=p1;
		 listaProducto[1]=p2;
		 listaProducto[2]=p3;
		 
		 
		 
		 //Foreach de java 7
//		 for (Producto item : listaProducto) {
//			 System.out.println(item.getClass().getSimpleName()+" => "+  item.getMarca()+ " " + item.getPrecio() + " " + item.getTalle());
//		 }

		 
		 //java 8 foreach 
		ArrayList<Producto> ProductList = new ArrayList<>();
		ProductList.add(p1);
		ProductList.add(p2);
		ProductList.add(p3);
		ProductList.forEach(item ->{
			 System.out.println(item.getClass().getSimpleName()+" => "+  item.getMarca()+ " " + item.getPrecio() + " " + item.getTalle());
		});
		
		 
		 // forma cabeza	
//		 System.out.println(p1.getClass().getSimpleName()+" => "+  p1.getMarca()+ " " + p1.getPrecio() + " " + p1.getTalle());
//		 System.out.println(p2.getClass().getSimpleName()+" => "+ p2.getMarca()+ " " + p2.getPrecio() + " " + p2.getTalle());
//		 System.out.println(p3.getClass().getSimpleName()+" => "+p3.getMarca()+ " " + p3.getPrecio() + " " + p3.getTalle());
	}

}
