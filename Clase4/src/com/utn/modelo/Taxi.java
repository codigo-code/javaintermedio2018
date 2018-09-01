package com.utn.modelo;

public class Taxi extends Transporte {

	public Taxi(double tarifa, int cantPasajeos, String recorrido) {
		super(tarifa, cantPasajeos, recorrido);
	}

	@Override
	public double cobrarYDarVuelto(double dineroRecibido) {
		return dineroRecibido - super.getTarifa();
	}

}
