package com.utn.controlador;

import com.utn.modelo.Colectivo;
import com.utn.modelo.Taxi;
import com.utn.modelo.TipoTransporte;
import com.utn.modelo.Transporte;

public class TransporteControlador {

	public void creoTransporte(TipoTransporte tipo, double tarifa, String recorrido, int cantPasajeos) {
		
		Transporte t = null;
		
		switch (tipo) {
		case COLECTIVO:
			t = new Colectivo(tarifa, cantPasajeos, recorrido);
			break;
		case TAXI:
			t = new Taxi(tarifa, cantPasajeos, recorrido);
			break;

		default:
			System.out.println("No conozco el tipo");
			break;
		}

		System.out.println("fue creado un " + t.getClass().getSimpleName());
	}
}
