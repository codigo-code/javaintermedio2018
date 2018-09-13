package com.utn.modelo;

public class Taxi extends Transporte {
private double tarifa;


	public double getTarifa() {
	return tarifa;
}

public void setTarifa(double tarifa) {
	this.tarifa = tarifa;
}

	public Taxi(double tarifa, int cantPasajeros, String recorrido,double saldoFinal) {
		super(cantPasajeros, recorrido,saldoFinal);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cobrarYDarVuelto(double dineroRecibido) {
		// TODO Auto-generated method stub
		return dineroRecibido - this.getTarifa();
	}

	@Override
	public double calcularSube(double saldoSube) {
		// TODO Auto-generated method stub
		return 0;
	}
}
