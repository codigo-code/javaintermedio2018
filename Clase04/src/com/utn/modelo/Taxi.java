package com.utn.modelo;

public class Taxi extends Transporte {

	public Taxi(double tarifa, int cantPasajeros, String recorrido) {
		super(tarifa, cantPasajeros, recorrido);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cobrarYDarVuelto(double dineroRecibido) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
