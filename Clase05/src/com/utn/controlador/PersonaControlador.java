package com.utn.controlador;

import java.util.ArrayList;

import com.utn.modelo.Alumno;
import com.utn.modelo.HinchaFutbol;
import com.utn.modelo.IDialecto;
import com.utn.modelo.TipoPersona;

public class PersonaControlador {
	
	//public void dialogo(TipoPersona tipo) {
		
		//nos creamos una lista de la interfaz para luego mostrar por pantalla lo indicado
		
		private ArrayList<IDialecto> listaDialogo;
		
		public PersonaControlador() {
			this.listaDialogo = new ArrayList<IDialecto>();
		}
		public void dialogo(TipoPersona tipo) {
			IDialecto d = null;
		
		switch (tipo) {
		case ALUMNO:
			d = new Alumno();
			d.insultar(100);
			d.comunicarse("Examen");
			d.hablar("espanol","recreo");
			this.listaDialogo.add(d);
			break;
		case HINCHAFUTBOL:
			d = new HinchaFutbol();
			d.insultar(100);
			d.comunicarse("Partido perdiendo");
			d.hablar("caco","recreo");
			this.listaDialogo.add(d);
			
			break;
		case POLITICO:
			
			break;
					
			default:
				System.err.println("no esta implementada la funcionalidad, comuniquese con IT");
			break;
		}
	
}
}
