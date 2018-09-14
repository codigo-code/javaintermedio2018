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
		// TODO Auto-generated constructor stub
		this.listaPeliculas = new ArrayList<Pelicula>();
	}
	
	public void creoPelicula(Genero genero) {
		//Pelicula p = null;
		
		switch (genero) {
		case ACCION:
			this.listaPeliculas.add(new DVD("Duro de matar",genero,40));
			this.listaPeliculas.add(new VHS("Duro de matar",genero,40));
			this.listaPeliculas.add(new BlueRay("Duro de matar",genero,40));
			break;
		case TERROR:
			this.listaPeliculas.add(new DVD("la llamada",genero,20));
			this.listaPeliculas.add(new VHS("martes 13",genero,20));
			this.listaPeliculas.add(new BlueRay("pesadilla",genero,20));
			break;
		case PORNO:
			this.listaPeliculas.add(new DVD("Duro de matar",genero,10));
			this.listaPeliculas.add(new VHS("Duro de matar",genero,10));
			this.listaPeliculas.add(new BlueRay("Duro de matar",genero,10));
			
			break;
			
		default:
			System.out.println("desconozco el genero");
			break;
		
		}
	}
	
	public void muestroReportePelicula() {
		//estandar
		for (Pelicula item : listaPeliculas) {
			System.out.println("Nombre: " + item.getNombre() + "Genero: " + item.getGenero() + "Precio: $" + item.getPrecio());
		}
		System.out.println("=================================================================");
		//lambda solo para java 8
		this.listaPeliculas.forEach(item -> {System.out.println("Genero: " + item.getGenero() + "Nombre: " + item.getNombre());});
	}
	public ArrayList<Pelicula> devuelvoListaPeliculas(){
		return this.listaPeliculas;
				
	}
		
		


}
