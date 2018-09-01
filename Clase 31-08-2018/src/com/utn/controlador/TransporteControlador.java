package com.utn.controlador;
import java.util.ArrayList;
import java.util.Scanner;

import com.utn.modelo.Colectivo;
import com.utn.modelo.Taxi;
import com.utn.modelo.TipoTransporte;
import com.utn.modelo.Transporte;

public class TransporteControlador {

	private ArrayList <Transporte> transportes;
	
	public TransporteControlador(ArrayList<Transporte> transportes) {
		super();
		this.transportes = transportes;
	}

	public void crearTransporte (TipoTransporte transporte,double tarifa, int cantPasajeros, String recorrido)
	{
		Scanner in = new Scanner (System.in);
		Transporte t = null;
		switch (transporte)
		{
			case COLECTIVO:
				t = new Colectivo (tarifa, cantPasajeros, recorrido);
				System.out.println("El valor del recorrido es "+ t.getTarifa());
				System.out.println("¿Con cuanto dinero va a abonar?");
				double dineroRecibido = in.nextDouble();
				double dinero = t.cobrarBoleto(dineroRecibido);
				verificarDinero(dinero);
				break;
			
			case TAXI:
				t = new Taxi (tarifa, cantPasajeros, recorrido);
				System.out.println("El valor del recorrido es "+ t.getTarifa());
				System.out.println("¿Con cuanto dinero va a abonar?");
				double dineroRecibidoo = in.nextDouble();
				double dineroo = t.cobrarBoleto(dineroRecibidoo);
				verificarDinero (dineroo);
				break;
				
			default:
				System.out.println("Tipo no identificado");
				break;
		}
		
		System.out.println("Fue creado un " + t.getClass().getSimpleName()+ " correctamente");
		this.transportes.add(t);
	}
	
	public void definir (String tipo)
	{
		Scanner in = new Scanner (System.in);
		if (tipo.equalsIgnoreCase("taxi"))
		{
			System.out.println("Ingrese cantidad de personas");
			int cantPasajeros = in.nextInt();
			System.out.println("¿Hasta donde necesita transporte?");
			String recorrido = in.next();
			crearTransporte(TipoTransporte.TAXI, 500.0, cantPasajeros, recorrido);
		}
		else if (tipo.equalsIgnoreCase("colectivo"))
		{
			System.out.println("Ingrese cantidad de personas");
			int cantPasajeros = in.nextInt();
			System.out.println("¿Hasta donde necesita transporte?");
			String recorrido = in.next();
			crearTransporte(TipoTransporte.COLECTIVO, 12.25, cantPasajeros, recorrido);
		}
		else
		{
			System.out.println("El transporte que usted seleciono no existe");
			return;
		}
	}
	
	public void verificarDinero(double dinero)
	{
		if(dinero>=0)
		{
			System.out.println("Su vuelto es: "+ dinero);
		}
		else
		{
			System.out.println("No le alcanza la plata");
		}
	}
	
	public void mostrarTransportes ()
	{
		this.transportes.forEach(item->{
			System.out.println(item.getClass().getSimpleName());
			System.out.println("Tarifa:" + item.getTarifa() + "Recorrido:" + item.getRecorrido());
		});
	
	}
}
