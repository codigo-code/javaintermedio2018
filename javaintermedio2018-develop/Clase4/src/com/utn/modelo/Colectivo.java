package com.utn.modelo;

public class Colectivo extends Transporte {

	public Colectivo(double tarifa, int cantPasajeos, String recorrido) {
		super(tarifa, cantPasajeos, recorrido);
	}

	@Override
	public double cobrarYDarVuelto(double dineroRecibido) {
		return dineroRecibido - super.getTarifa();
	}
}
