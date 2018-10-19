package com.utn.controlador;

import java.util.Scanner;

import com.utn.modelo.Bebida;
import com.utn.modelo.Sabor;
import com.utn.modelo.Variedades;

public class BebidaControlador {

	Scanner input = new Scanner(System.in);
	
	//String gusto = this.input.next();
	
	
	public Bebida prepararBebida(Variedades variedad) {
		Sabor s = new Sabor(variedad);
	
	switch(variedad) {
	case FERNET:
		//s.setSabor(gusto);
		s.agregarBicarbonato();
		s.agitar();
		s.reposar();
		s.inyectarAlcohol();
		s.embazar();
		break;
	case MANZANA:
		//s.setSabor(gusto);
		s.agregarBicarbonato();
		s.agitar();
		s.reposar();
		s.embazar();
		break;
	case NARANJA:
		//s.setSabor(gusto);
		s.agregarBicarbonato();
		s.agitar();
		s.reposar();
		s.embazar();
		break;
	case COLA:
		//s.setSabor(gusto);
		s.agregarBicarbonato();
		s.agitar();
		s.reposar();
		s.embazar();
		break;
		default:
			System.out.println("No fabricamos esa bebida");
		break;
	}
	System.out.println("Se ha producido " + s.getSabor());
	return s;
	}
	
	
	public BebidaControlador() {
		
	}


	public void prepararBebida(String sabor) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	
}