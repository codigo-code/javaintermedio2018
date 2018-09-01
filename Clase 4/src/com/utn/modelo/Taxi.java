package com.utn.modelo;

public class Taxi extends Transporte {

	public Taxi(double tarifa, int cantPasajero, String recorrido) {
		super(tarifa, cantPasajero, recorrido);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cobrarYDarVuelto(double dineroRecibido) {
		
		return dineroRecibido - super.getTarifa();
	}

}
