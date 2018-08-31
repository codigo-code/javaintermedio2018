package com.utn.controlador;

import com.utn.modelo.Camisa;
import com.utn.modelo.Producto;

public class ProductoControlador {
	
	public Producto creoProducto(String tipo,String marca, Object talle, double precio) {
		
		Producto p = null; //creamos variable tipo producto la inicializamos a null y 
		//luego en cada parte del switch le damos la instancia correspondiente
		
		switch(tipo) {
		case CAMISA:
			return new Camisa(marca,talle,precio);
		
		}
		
		return p;
	}
	
	//private producto
	

}
