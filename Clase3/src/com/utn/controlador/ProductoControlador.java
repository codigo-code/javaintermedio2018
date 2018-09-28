package com.utn.controlador;

import com.utn.modelo.Camisa;
import com.utn.modelo.Pantalon;
import com.utn.modelo.Producto;
import com.utn.modelo.Tipo;
import com.utn.modelo.Zapatilla;

public class ProductoControlador {
	public Producto creoProducto(Tipo tipo, String marca, Object talle, double precio) {
		return null;
		
	
	

	switch(tipo) {
	case CAMISA:
		p = new Camisa();
		return asignoValores(p, marca, talle, precio);
		break;
		
	case PANTALON:
	p = new Pantalon();
	return asignoValores(p, marca, talle, precio);
	break;
	
	case ZAPATILLA:
	p = new Zapatilla();
	return asignoValores(p, marca, talle, precio);
	break;
	
	default:
		System.out.println("no conozco la prenda");
		break;
	}
	return p;
	
	
	}
}