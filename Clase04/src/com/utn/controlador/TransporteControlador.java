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

	public void creoTransporte(Vehiculo tipo,double tarifa, String recorrido,int cantPasajeros, double saldoFinal) {


		Scanner input = new Scanner(System.in);
		Transporte t = null;
		switch (tipo) {
		case COLECTIVO:
			t = new Colectivo(tarifa, cantPasajeros, recorrido, tarifa,saldoFinal);
			System.out.println("El valor del viaje es $" + ((Colectivo)t).getTarifa() + " por " + t.getCantPasajeros() + " pasajeros." );
			
			System.out.println("ingrese saldo en sube");
			double saldoSube = input.nextDouble();
			double res = t.calcularSube(saldoSube);
					
			if(res >= 0) {
				System.out.println("su saldo en la sube es " + res);
			}else {
				System.out.println("no le alcanza el saldo en sube por pobre!");
			}
			break;
			
		case TAXI:
			t = new Taxi(tarifa, cantPasajeros, recorrido,0);//tuve que poner 0 o la variable saldoFinal para que ande
			System.out.println("El valor del viaje es $" +  ((Taxi)t).getTarifa());
			//Scanner input = new Scanner(System.in);
			System.out.println("ingrese recibido");
			double dineroRecibido = input.nextDouble();
			double res1 = t.cobrarYDarVuelto(dineroRecibido);
			if(res1 >= 0) {
				System.out.println("su vuelto en euros es " + res1);
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

	//ciclamos lista transportes
	public void muestroListaTrasnporte() {
		//lambda Java 1.8
		this.listTrans.forEach(item ->{
			System.out.println(item.getClass().getSimpleName());
			if (item instanceof Colectivo) {
				Colectivo itemColectivo = (Colectivo) item;
				System.out.println("Tarifa: " + itemColectivo.getTarifa() + " , Recorrido: " + item.getRecorrido());				
			}

		});

	}
	//java 1.7
	//	for (Transporte item : listTrans) {
	//		System.out.println(item.getClass().getSimpleName());
	//		System.out.println("Tarifa: " + item.getTarifa() + " , Recorrido: " + item.getRecorrido());
	//	}
}
