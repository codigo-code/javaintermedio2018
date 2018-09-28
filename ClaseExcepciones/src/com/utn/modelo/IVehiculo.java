package com.utn.modelo;

import com.utn.modelo.excepciones.MiExcepcion;

public interface IVehiculo {

	public void velocidadMaxima(double velocidad) throws Exception;
	
	public void encender(boolean combustible) throws MiExcepcion;
	
	
}
