package com.utn.controlador;

import java.util.ArrayList;
import java.util.Scanner;

import com.utn.modelo.Colectivo;
import com.utn.modelo.Taxi;
import com.utn.modelo.Transporte;
import com.utn.modelo.Vehiculo;

public class TransporteControlador {
	
	private ArrayList<Transporte> listTrans;
	
	public TransporteControlador() {
		this.listTrans = new ArrayList<>();
	}
	
	public void creoTransporte(Vehiculo tipo,double tarifa, String recorrido,int cantPasajeros) {
		
		
		
		Transporte t = null;
		switch (tipo) {
		case COLECTIVO:
			t = new Colectivo(tarifa, cantPasajeros, recorrido);
			//t.cobrarYDarVuelto(dineroRecibido);
			break;
		case TAXI:
			t = new Taxi(tarifa, cantPasajeros, recorrido);
			System.out.println("El valor del viaje es $" + t.getTarifa());
			Scanner input = new Scanner(System.in);
			System.out.println("ingrese recibido");
			double dineroRecibido = input.nextDouble();
			double res = t.cobrarYDarVuelto(dineroRecibido);
			if(res >= 0) {
				System.out.println("su vuelto en euros es " + res);
			}else {
				System.out.println("no le alcanza por pobre!");
			}
			
			break;
			
			
			
		default:
			System.out.println("No conozo el tipo");
			break;
		}
		this.listTrans.add(t);
		System.out.println("=============================================");
		System.out.println("Fue creado un " + t.getClass().getSimpleName());
		
	}

}
