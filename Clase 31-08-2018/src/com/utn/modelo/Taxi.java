package com.utn.modelo;

public class Taxi extends Transporte{

	public Taxi(double tarifa, int cantPasajeros, String recorrido) {
		super(tarifa, cantPasajeros, recorrido);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cobrarBoleto(double dineroRecibido) {
		
		return dineroRecibido - super.getTarifa();
	}

}
