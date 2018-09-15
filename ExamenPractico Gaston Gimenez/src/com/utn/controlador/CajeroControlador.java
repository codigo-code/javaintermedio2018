package com.utn.controlador;

import java.util.Vector;

import com.utn.modelo.Cajero;
import com.utn.modelo.Despachante;
import com.utn.modelo.Recipiente;

public class CajeroControlador {

	Vector <Cajero> cajeros = new Vector <Cajero>();  //los vectores son para almacenar los cajeros
	Vector <Despachante> despachantes = new Vector <Despachante>(); // y despachantes para que
	Cajero c1 = new Cajero ("Lucas", 1232,5); // no queden en la nada 
	Cajero c2 = new Cajero ("Gaston", 4232,10);
	Cajero c3 = new Cajero ("Matias", 4632,15);
	Despachante d1 = new Despachante ("Luciana",3241, true);
	Despachante d2 = new Despachante ("Hernan",3441, false);
	Despachante d3 = new Despachante ("Camila",3291, true);
	
	
	public void asignarCajero (Recipiente recipiente, int opcion)
	{
		System.out.println("Usted ordeno un " + recipiente.getClass().getSimpleName());
		System.out.println("Asignando Despachante...");
		switch (opcion)
		{
			case 1: 
				System.out.println("El cajero " + c1.getNombre() + " lo asigno con " +d1.getNombre());
				despachantes.add(d1);
				if (d1.isTrabajo() == true)
				{
					System.out.println("En un momento su pedido sera entregado");
				}
				else
				{
					System.out.println(d1.getNombre() + " esta atendiendo otro pedido");
				}
				
				break;
			case 2:
				System.out.println("El cajero " + c2.getNombre() + " lo asigno con " +d2.getNombre());
				despachantes.add(d2);
				if (d2.isTrabajo() == true)
				{
					System.out.println("En un momento su pedido sera entregado");
				}
				else
				{
					System.out.println(d2.getNombre() + " esta atendiendo otro pedido");
				}
				break;
			case 3:
				System.out.println("El cajero " + c3.getNombre() + " lo asigno con " +d3.getNombre());
				despachantes.add(d3);
				if (d3.isTrabajo() == true)
				{
					System.out.println("En un momento su pedido sera entregado");
				}
				else
				{
					System.out.println(d3.getNombre() + " esta atendiendo otro pedido ");
				}
				break;
				
		}
	}
	
	
	
	
	public void menuCajas()
	{
		System.out.println("En que caja desea abonar?");
		System.out.println("1- Caja N1");
		System.out.println("2- Caja N2");
		System.out.println("3- Caja N3");
	}
	
	public void corroborarPedidos(int opcion)
	{
		if (opcion == 1)
		{
			cajeros.add(c1);
			int trabajo = c1.getCantidadDePedidos();
			trabajo--;
			if (trabajo == 0)
			{
				System.out.println("Esta caja ya no atiende mas pedidos");
			}
			else if (trabajo>0)
			{
				System.out.println("Esta caja aun toma pedidos");
			}
			else 
			{
				System.out.println("Caja cerrada");
			}
		}
		else if (opcion == 2)
		{
			cajeros.add(c2);
			int trabajo = c2.getCantidadDePedidos();
			trabajo--;
			if (trabajo == 0)
			{
				System.out.println("Esta caja ya no atiende mas pedidos");
			}
			else if (trabajo>0)
			{
				System.out.println("Esta caja aun toma pedidos");
			}
			else 
			{
				System.out.println("Caja cerrada");
			}
		}
		else if(opcion == 3)
		{
			cajeros.add(c3);
			int trabajo = c3.getCantidadDePedidos();
			trabajo--;
			if (trabajo == 0)
			{
				System.out.println("Esta caja ya no atiende mas pedidos");
			}
			else if (trabajo>0)
			{
				System.out.println("Esta caja aun toma pedidos");
			}
			else 
			{
				System.out.println("Caja cerrada");
			}
		}
	}
}
