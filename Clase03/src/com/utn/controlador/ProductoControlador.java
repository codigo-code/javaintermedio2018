package com.utn.controlador;

import com.utn.modelo.Camisa;
import com.utn.modelo.Pantalon;
import com.utn.modelo.Producto;
import com.utn.modelo.Zapatilla;
import com.utn.modelo.Tipo;

public class ProductoControlador {
	
	public Producto creoProducto(String tipo,String marca, Object talle, double precio) {
		
		Producto p = null; //creamos variable tipo producto la inicializamos a null y 
		//luego en cada parte del switch le damos la instancia correspondiente
		
		switch (tipo) {
		case CAMISA:
			// opcion b
			return new Camisa(marca, talle, precio);
		// Opcion A
		// return asignoValores(p, marca, talle, precio);

		case PANTALON:
			return new Pantalon(marca, talle, precio);
		// return asignoValores(p, marca, talle, precio);

		case ZAPATILLA:
			return new Zapatilla(marca, talle, precio);
		// return asignoValores(p, marca, talle, precio);

		default:
			System.out.println("no conozco la prenda");
			break;
		}

		return p;

	}

	}
	
	//private producto
	

}
