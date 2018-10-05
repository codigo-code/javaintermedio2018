package com.utn.controlador;

import java.util.Scanner;

import com.utn.modelo.Envase;
import com.utn.modelo.Plus;

public class HeladeriaControlador {
	Scanner ingreso = new Scanner(System.in);
	
	public void pedir(Envase envase, String gusto1, String gusto2,Plus plus){
	switch(envase) {
	case CONO:
		System.out.println("Primer gusto");
		gusto1 = ingreso.next();
		System.out.println("Segundo gusto");
		gusto2 = ingreso.next();
		
		break;
	case CUARTO:
		
		break;
	case KILO:
		break;
	default:
		break;
	
	}
	}
}
