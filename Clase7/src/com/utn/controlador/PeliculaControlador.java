package com.utn.controlador;

import java.util.ArrayList;

import com.utn.modelo.Genero;
import com.utn.modelo.Pelicula;
import com.utn.modelo.formato.BlueRay;
import com.utn.modelo.formato.DVD;
import com.utn.modelo.formato.VHS;

public class PeliculaControlador {

	private ArrayList<Pelicula> listaPeliculas;

	public PeliculaControlador() {
		this.listaPeliculas = new ArrayList<Pelicula>();
	}

	public void creoPelicula(Genero genero) {
		
		switch (genero) {
		case ACCION:
				this.listaPeliculas.add(new DVD("Duro de matar", genero, 40.0)); 
				this.listaPeliculas.add(new VHS("Duro de matar", genero, 40.0)); 
				this.listaPeliculas.add(new BlueRay("Duro de m	atar", genero, 40.0)); 
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
