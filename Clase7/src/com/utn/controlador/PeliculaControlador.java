package com.utn.controlador;

import java.util.ArrayList;

import com.utn.modelo.Genero;
import com.utn.modelo.Pelicula;

public class PeliculaControlador {

	private ArrayList<Pelicula> listaPeliculas;
	
	public PeliculaControlador() {
		this.listaPeliculas= new ArrayList<Pelicula>();
	}

	
	public void creoPelicula(Genero genero) {
		
		switch (genero) {
		case ACCION:
			
			break;
		case TERROR:
			
			break;
		case PORNO:
			
			break;

		default:
			break;
		}
	}
	
	
}
