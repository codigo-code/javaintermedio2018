package com.utn.modelo;

public class Taxi extends Transporte {

	public Taxi(double tarifa, int cantPasajeros, String recorrido,double saldoFinal) {
		super(tarifa, cantPasajeros, recorrido,saldoFinal);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cobrarYDarVuelto(double dineroRecibido) {
		// TODO Auto-generated method stub
		return dineroRecibido - super.getTarifa();
	}

	@Override
	public double calcularSube(double saldoSube) {
		// TODO Auto-generated method stub
		return 0;
	}
}
