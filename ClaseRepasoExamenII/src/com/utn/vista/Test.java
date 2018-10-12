package com.utn.vista;

import com.utn.controlador.InformeConttrolador;
import com.utn.modelo.CambioActitud;
import com.utn.modelo.CambioCarroceria;
import com.utn.modelo.Cliente;
import com.utn.modelo.Vehiculo;

public class Test {

	public static void main(String[] args) {
		
		InformeConttrolador ic = new InformeConttrolador();
		
		ic.creoInformeCambioActitud();
		
		
		ic.creoInforme(new Cliente("Diego", "Berardi", 123),
				new Vehiculo("Renault", "4", "AC 0000001", "Gas", "12312aesasd"));
			
		ic.trabajoConElInforme(new CambioCarroceria(new Vehiculo("Fiat", "Fiorino", "XXX123", "Nafta", "avc123"), "Utilitario", new Cliente("Jonatahn", "tilcara", 1234), "joya nunca taxi"));
	}

}
