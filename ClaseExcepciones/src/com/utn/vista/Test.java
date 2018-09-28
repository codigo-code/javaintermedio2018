package com.utn.vista;

import com.utn.modelo.Auto;
import com.utn.modelo.excepciones.MiExcepcion;

public abstract class Test {

	public static void main(String[] args) {

      Auto a = new Auto();
      
      try {
		a.encender(false);
	} catch (MiExcepcion e) {
		
		e.muestroMensajeDeError("No tiene combustible para encender");
	}
      try {
		a.velocidadMaxima(201);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}

	}

}
