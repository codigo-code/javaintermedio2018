package com.utn.controlador;

import java.util.ArrayList;
import java.util.Scanner;

import com.utn.modelo.Colectivo;
import com.utn.modelo.Taxi;
import com.utn.modelo.TipoTransporte;
import com.utn.modelo.Transporte;

public class TransporteControlador {

	private ArrayList<Transporte> listTrans;

	public TransporteControlador() {
		this.listTrans = new ArrayList<>();
	}

	public void creoTransporte(TipoTransporte tipo, double tarifa, String recorrido, int cantPasajeos) {

		Transporte t = null;

		switch (tipo) {
		case COLECTIVO:
			t = new Colectivo(tarifa, cantPasajeos, recorrido);

			break;
		case TAXI:
			t = new Taxi(tarifa, cantPasajeos, recorrido);
			System.out.println("El valor del viaje es " + t.getTarifa());
			Scanner input = new Scanner(System.in);
			System.out.println("Ingrese el dinero ");
			double dineroRecibido = input.nextDouble();
			double res = t.cobrarYDarVuelto(dineroRecibido);
			if (res >= 0) {
				System.out.println("Su vuelto es Patacones: " + res);
			} else {
				System.out.println("No le alcanza la plata pobre!");
			}
			break;

		default:
			System.out.println("No conozco el tipo");
			break;
		}

		this.listTrans.add(t);

		System.out.println("fue creado un " + t.getClass().getSimpleName());
	}

	// ciclamos la lista de transportes

	public void muestroListaTransporte() {
			
//		for (Transporte item : listTrans) {
//			System.out.println(item.getClass().getSimpleName());
//			System.out.println("Tarifa: "+item.getTarifa() + 
//					", Recorrido: " + item.getRecorrido());
//		}
		
			//lambda  Java 1.8
			this.listTrans.forEach(item->{
				System.out.println(item.getClass().getSimpleName());
				System.out.println("Tarifa: "+item.getTarifa() + 
						", Recorrido: " + item.getRecorrido());
			});

		}
}
