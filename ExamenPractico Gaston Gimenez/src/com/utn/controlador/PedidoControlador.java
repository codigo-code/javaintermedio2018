package com.utn.controlador;

import java.util.Scanner;
import java.util.Vector;

import com.utn.modelo.Cono;
import com.utn.modelo.Cuarto;
import com.utn.modelo.Pote;
import com.utn.modelo.Recipiente;

public class PedidoControlador {

	Scanner in = new Scanner (System.in);
	Vector <Recipiente> pedidos = new Vector <Recipiente> ();
	CajeroControlador cc = new CajeroControlador ();
	public void rellenarHelado (int opcion)
	{
		switch (opcion)
		{
			case 1:
				Cono c1 = new Cono(null, null);
				c1.rellenar();
				pedidos.add(c1);
				cc.menuCajas();
				opcion = in.nextInt();
				cc.corroborarPedidos(opcion);
				cc.asignarCajero(c1,opcion);
				break;
			case 2:
				Cuarto cu1 = new Cuarto(null, null, null, null);
				cu1.rellenar();
				pedidos.add(cu1);
				cc.menuCajas();
				opcion = in.nextInt();
				cc.asignarCajero(cu1,opcion);
				break;
			case 3:
				Pote p1 = new Pote(null, null, null, null, null);
				p1.rellenar();
				pedidos.add(p1);
				cc.menuCajas();
				opcion = in.nextInt();
				cc.asignarCajero(p1,opcion);
				break;
			default:
				break;
		}
	}
	
	
	
	
	
	
	
	public void menuInicial ()
	{
		System.out.println("Que desea ordenar?");
		System.out.println("1- Cono");
		System.out.println("2- Vaso de 1/4");
		System.out.println("3- Pote de 1KG");
	}
	

}
