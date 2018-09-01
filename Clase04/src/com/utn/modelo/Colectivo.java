package com.utn.modelo;

public class Colectivo extends Transporte {

	public Colectivo(double tarifa, int cantPasajeros, String recorrido) {
		super(tarifa, cantPasajeros, recorrido);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cobrarYDarVuelto(double dineroRecibido) {
		// TODO Auto-generated method stub
		double precio = super.getCantPasajeros() * super.getTarifa();
		return dineroRecibido - precio;
	}

	
}
