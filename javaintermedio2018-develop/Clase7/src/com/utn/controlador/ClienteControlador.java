package com.utn.controlador;

import com.utn.modelo.Cliente;
import com.utn.modelo.Genero;

public class ClienteControlador {

	private PeliculaControlador pc;

	public ClienteControlador() {
		this.pc = new PeliculaControlador();
	}

	public void alquiloPelicula() {
		System.out.println("Quiero una de accion");
		Cliente c1 = new Cliente("Felipe", "feliperez@pepe.com", 60.0);

		this.pc.creoPeliculaxGenero(Genero.ACCION);
		// aqui devuelvo una lista con los formatos posibles
		/*
		 * En esta lista me devuelve 3 objtos 1 DVD 2 VHS 3 BlueRay
		 */
		if (c1.alquiloPelicula(this.pc.devuelvoListaPeliculas().get(1))) {
			System.out.println("Gracias por alquilar la peli desea otra?");

			System.out.println("las peliculas que vio este cliente son:");
			c1.getListaPeliculasAlquiladas().forEach(x -> {
				System.out.println(x.getNombre() + " - Genero - " + x.getGenero());
			});

		} else {
			System.out.println("Guira !!!!");
		}

	}

}
