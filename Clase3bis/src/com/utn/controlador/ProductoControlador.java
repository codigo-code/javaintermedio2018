package com.utn.controlador;

import java.awt.PageAttributes;

import com.utn.modelo.Camisa;
import com.utn.modelo.Pantalon;
import com.utn.modelo.Producto;
import com.utn.modelo.Tipo;
import com.utn.modelo.Zapatilla;

public class ProductoControlador {

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

}
