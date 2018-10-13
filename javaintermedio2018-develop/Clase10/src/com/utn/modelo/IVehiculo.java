package com.utn.modelo;

/*
 * PASO N2 en la interfaz declarar el throws de la excepcion creada previamente
 */
import com.utn.modelo.excepciones.MiExcepcion;

public interface IVehiculo {

	
	public void velocidadMaxima(double velocidad) throws Exception;
	
	public void encender(boolean combustible)throws MiExcepcion;
}
