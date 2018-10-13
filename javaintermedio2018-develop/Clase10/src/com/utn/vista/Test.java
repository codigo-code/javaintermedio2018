package com.utn.vista;

import com.utn.modelo.Auto;
import com.utn.modelo.excepciones.MiExcepcion;


/*
 * PASO N4 generar los try catch
 */
public class Test {

	public static void main(String[] args) {
		Auto a = new Auto();

		try {
			a.encender(false);
		} catch (MiExcepcion e) {
			e.muestroMensajeDeError("Exploto el metodo encender de la clase auto");
		}

		try {
			a.velocidadMaxima(300);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}
}
