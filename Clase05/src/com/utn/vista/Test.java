package com.utn.vista;

import com.utn.controlador.PersonaControlador;
import com.utn.modelo.TipoPersona;

public class Test {

	public static void main(String[] args) {
		
		PersonaControlador pc = new PersonaControlador();
		
		pc.dialogo(TipoPersona.POLITICO);
		
		pc.dialogo(TipoPersona.HINCHAFUTBOL);
		
		pc.dialogo(TipoPersona.ALUMNO);
		
		pc.dialogo(TipoPersona.VIRULETE);

	}

}
