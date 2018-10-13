package com.utn.controlador;

import java.util.ArrayList;

import com.utn.modelo.Alumno;
import com.utn.modelo.HinchaFutbol;
import com.utn.modelo.IDialecto;
import com.utn.modelo.TipoPersona;

public class PersonaControlador {

	// nos creamos una lista de la interfaz para luego
	// mostrar por pantalla lo indicado MAGIA!
	private ArrayList<IDialecto> listaDialogo;

	public PersonaControlador() {
		this.listaDialogo = new ArrayList<IDialecto>();
	}

	public void dialogo(TipoPersona tipo) {
		IDialecto d = null;
		switch (tipo) {
		case ALUMNO:
			d = new Alumno();
			System.out.println(d.insultar(100));;
			d.comunicarse("Examen!");
			d.hablar("espanol", "recreo");
			this.listaDialogo.add(d);
			break;
		case HINCHAFUTBOL:
			d = new HinchaFutbol();
			System.out.println(d.insultar(100));
			d.comunicarse("Partido perdiendo");
			d.hablar("caco", "partido");
			this.listaDialogo.add(d);
			break;

		default:
			System.err.println(" No esta implementada la funcionalidad, hable con el equipo de IT");
			break;
		}
	}
}
