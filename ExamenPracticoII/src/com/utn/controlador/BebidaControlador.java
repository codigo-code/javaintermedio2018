package com.utn.controlador;

import java.util.Scanner;

import com.utn.modelo.Bebida;
import com.utn.modelo.Sabor;

public class BebidaControlador {

	Scanner input = new Scanner(System.in);

	public Bebida prepararBebida(String sabor) {
		Sabor s = new Sabor(sabor);
	
	if(sabor == "Fernet") {
		s.agregarBicarbonato();
		s.agitar();
		s.reposar();
		s.inyectarAlcohol();
		s.embazar();
	}else {
		s.agregarBicarbonato();
		s.agitar();
		s.reposar();
		s.embazar();
	}
	System.out.println("Se ha producido " + s.getSabor());
	return s;
	}
	
	
	public BebidaControlador() {
		
	}
	
	
	
	
	
	
	
	
}