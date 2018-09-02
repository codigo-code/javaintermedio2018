package com.utn.modelo;

public class Colectivo extends Transporte {

	public Colectivo(double tarifa, int cantPasajeros, String recorrido,double precio, double saldoFinal) {
		super(tarifa, cantPasajeros, recorrido,saldoFinal);
		// TODO Auto-generated constructor stub
	}
		
	@Override
	public double cobrarYDarVuelto(double dineroRecibido) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public double calcularSube(double saldoSube) {
		return saldoSube - (super.getCantPasajeros()*super.getTarifa());
	}

	

	
}
// precio del pasaje
//cantidad de pasajeros
//saldo en sube
//saldo luego del viaje