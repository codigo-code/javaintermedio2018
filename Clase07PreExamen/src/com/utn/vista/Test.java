package com.utn.vista;

import com.utn.controlador.ClienteControlador;
import com.utn.controlador.PeliculaControlador;

public class Test {

	public static void main(String[] args) {
	
		ClienteControlador cc = new ClienteControlador();
		cc.alquiloPelicula();
		
		PeliculaControlador pc = new PeliculaControlador();
		pc.muestroReportePelicula();

	
	}
		// TODO Auto-generated constructor stub



}


