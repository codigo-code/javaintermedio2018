package com.utn.controlador;

import com.utn.modelo.Cliente;
import com.utn.modelo.Dispositivos;
import com.utn.modelo.Tecnico;

public class TecnicoControler {
	private Tecnico tecnico;

	public TecnicoControler() {
		this.tecnico = new Tecnico();
		this.tecnico.setNombre("Roberto Galan");
	}

	public String observaciones(Cliente cliente) {

		Dispositivos d = cliente.getDispositivo();
		String resultadoObservacion;
		switch (d.getEstado()) {
		case MALO:
			resultadoObservacion = "NO esta malo esta hecho mierda!";
			break;
		case BUENO:
			resultadoObservacion = "Se puede reparar y es barato";
			break;

		default:
			return null;
		}

		return resultadoObservacion;
	}

}
