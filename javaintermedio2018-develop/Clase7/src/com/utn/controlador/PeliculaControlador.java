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

	
	
	public void creoPeliculaxGenero(Genero genero) {

		switch (genero) {
		case ACCION:
			this.listaPeliculas.add(new DVD("Duro de matar", genero, 40.0));
			this.listaPeliculas.add(new VHS("Duro de matar", genero, 10.0));
			this.listaPeliculas.add(new BlueRay("Duro de m	atar", genero, 140.0));
			break;
		case TERROR:
			this.listaPeliculas.add(new DVD("the ring", genero, 40.0));
			this.listaPeliculas.add(new VHS("the ring", genero, 12.0));
			this.listaPeliculas.add(new BlueRay("the ring", genero, 100.0));
			break;
		case PORNO:
			this.listaPeliculas.add(new DVD("50 sombras de grey", genero, 40.0));
			this.listaPeliculas.add(new VHS("50 sombras de grey", genero, 12.0));
			this.listaPeliculas.add(new BlueRay("50 sombras de grey", genero, 100.0));
			break;
		default:
			System.out.println("Desconozco el genero");
			break;
		}
	}

	public void muestroReportePelicula() {
		// estandar
		for (Pelicula item : listaPeliculas) {
			System.out.println("Genero " + item.getGenero() + " nombre " + item.getNombre());
		}
System.out.println("==================================");
		// lambda solo para java 8
		this.listaPeliculas.forEach(item -> {
			System.out.println("Genero " + item.getGenero() + " nombre " + item.getNombre());
		});
	}

	public ArrayList<Pelicula> devuelvoListaPeliculas() {
		return this.listaPeliculas;
	}

}
