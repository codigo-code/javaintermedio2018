package com.utn.controlador;

import java.awt.PageAttributes;
import java.util.ArrayList;

import com.utn.modelo.Camisa;
import com.utn.modelo.Pantalon;
import com.utn.modelo.Producto;
import com.utn.modelo.Tipo;
import com.utn.modelo.Zapatilla;

public class ProductoControlador {

	/*
	 * Puede tener dos tipos 1) tipado 2) no tipado
	 * 
	 * Ejemplo 1) ArrayList<Producto> listaProdcuto listaProducto.add(Camisa,
	 * Zapatilla, Pantalon)
	 * 
	 * Ejemplo 2) ArrayList listaObjecto listaObjeto.add(1);
	 * listaObjecto.add("hola mundo"); listaObjecto.add(Camisa);
	 * 
	 * 
	 */

	private ArrayList<Producto> listaProducto; // no lo inicializo
	// private String nombre=""; //declaracion de la variable

	public ProductoControlador() {
		// inicializo la lista
		// this.nombre="lucas"; //inicializacion de la variable darle valor o crear
		// instancia
		this.listaProducto = new ArrayList<Producto>();
	}

	public Producto creoProducto(Tipo tipo, String marca, Object talle, double precio) {

		// asignando los valores dependiendo el tipo
		// esto no los dara el enum

		switch (tipo) {
		case CAMISA:
			return new Camisa(marca, talle, precio);

		case PANTALON:
			return new Pantalon(marca, talle, precio);

		case ZAPATILLA:
			return new Zapatilla(marca, talle, precio);

		default:
			System.err.println("No conozco al tipo");
			return null;
		}
	}

	// asigno producto a lista
	public void asignoProductoLista(Producto product1) {
		this.listaProducto.add(product1);
	}

	public void muestroProductoLista() {
		System.out.println("Mostramos foreach por java 7 ");
		// java 7
		for (Producto item : listaProducto) {
			System.out.println(item.getClass().getSimpleName() + " => " + item.getMarca() + " " + item.getPrecio() + " "
					+ item.getTalle());
		}
		System.out.println("=======================");
		System.out.println("Mostramos foreach por java 8 ");

		// java 8 aplicando lambda
		listaProducto.forEach(item -> {
			System.out.println(item.getClass().getSimpleName() + " => " + item.getMarca() + " " + item.getPrecio() + " "
					+ item.getTalle());
		});
		System.out.println("=======================");
	}

}
