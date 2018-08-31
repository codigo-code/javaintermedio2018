package com.utn.controlador;

import com.utn.modelo.Colectivo;
import com.utn.modelo.Taxi;
import com.utn.modelo.Transporte;
import com.utn.modelo.Vehiculo;

public class TransporteControlador {
	public void creoTransporte(Vehiculo tipo,double tarifa, String recorrido,int cantPasajeros) {
		
		Transporte t = null;
		switch (tipo) {
		case COLECTIVO:
			t = new Colectivo(tarifa, cantPasajeros, recorrido);
			break;
		case TAXI:
			t = new Taxi(tarifa, cantPasajeros, recorrido);
			break;
			
			
			
		default:
			System.out.println("No conozo el tipo");
			break;
		}
		
		System.out.println("Fue creado un " + t.getClass().getSimpleName());
		
	}

}
