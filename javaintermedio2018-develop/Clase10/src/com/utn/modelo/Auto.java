package com.utn.modelo;

import com.utn.modelo.excepciones.MiExcepcion;

/*
 * PASO N3 generar el caso de error con el throw new MiExcepcion()
 */
public class Auto implements IVehiculo {

	@Override
	public void velocidadMaxima(double velocidad) throws Exception {

		if (velocidad > 200) {
			throw new Exception("No puede superar los 200 km y usted va a: " + velocidad + "  km x hora");
		} else {
			System.out.println("Va a la velocidad de: " + velocidad);
		}

	}

	@Override
	public void encender(boolean combustible) throws MiExcepcion {

		if (!combustible) {
			throw new MiExcepcion("No puede arrancar xq no tiene combustible");
		} else {
			System.out.println("El auto arranco sin problemas");
		}
	}
}
