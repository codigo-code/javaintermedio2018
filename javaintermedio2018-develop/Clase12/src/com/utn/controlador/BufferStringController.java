package com.utn.controlador;

public class BufferStringController {

	public StringBuffer doyVueltaLaCadena(StringBuffer cadena) {
		return cadena.reverse();
	}

	public StringBuffer borrarPorcion(StringBuffer cadena, int inicio, int fin) {
		return cadena.delete(inicio, fin);
	}

	public int capacidad(StringBuffer cadena) {
		return cadena.capacity();
	}

	public void agregoDesde(String cadena, int desde) {
		cadena.indexOf(cadena, desde);
	}

}
