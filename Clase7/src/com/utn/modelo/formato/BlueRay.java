package com.utn.modelo.formato;

import com.utn.modelo.Genero;
import com.utn.modelo.Pelicula;

public class BlueRay extends Pelicula {

	public BlueRay(String nombre, Genero genero, double precio, String desde, String hasta) {
		super(nombre, genero, precio, desde, hasta);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String tipoFormato() {
		// TODO Auto-generated method stub
		return null;
	}

}
