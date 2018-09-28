package com.utn.modelo;

import com.utn.modelo.excepciones.MiExcepcion;

public class Auto implements IVehiculo{

	@Override
	public void velocidadMaxima(double velocidad) throws Exception {
		if(velocidad>200){
			throw new Exception("No puede superar los 200 km x hora!!");
		}
		
	}

	@Override
	public void encender(boolean combustible) throws MiExcepcion {
		if (!combustible) {
			throw new MiExcepcion("No puede arrancar por que no tiene combustible!!");
		}
		
	}

}
