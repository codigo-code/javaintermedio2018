package com.utn.controlador;

import com.utn.modelo.Colectivo;
import com.utn.modelo.Taxi;
import com.utn.modelo.TipoTransporte;
import com.utn.modelo.Transporte;

public class TransporteControlador {
	
	public void creoTransporte(TipoTransporte tipo, double tarifa, String recorrido, int cantPasajeros) {
		Transporte t = null;
				
		switch (tipo) {
		case COLECTIVO:
			t = new Colectivo(tarifa, cantPasajeros, recorrido);
			break;
		case TAXI:
			t = new Taxi(tarifa, cantPasajeros, recorrido);
			break;
		default:
			System.out.println("no conozco el tipo");
			break;
		}
		
		System.out.println("fue creado un " + t.getClass().getSimpleName());
		
	}
}
