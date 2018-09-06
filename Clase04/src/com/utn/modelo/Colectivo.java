package com.utn.modelo;

public class Colectivo extends Transporte {

	private double tarifa;
	
	
	
	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	public Colectivo(double tarifa, int cantPasajeros, String recorrido,double precio, double saldoFinal) {
		super(cantPasajeros, recorrido,saldoFinal);
		this.tarifa = tarifa;
		// TODO Auto-generated constructor stub
	}
		
	@Override
	public double cobrarYDarVuelto(double dineroRecibido) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public double calcularSube(double saldoSube) {
		return saldoSube - (super.getCantPasajeros()*this.getTarifa());
	}

	

	
}
// precio del pasaje
//cantidad de pasajeros
//saldo en sube
//saldo luego del viaje