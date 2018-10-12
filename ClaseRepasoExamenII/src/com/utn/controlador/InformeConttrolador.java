package com.utn.controlador;

import java.util.Scanner;

import com.utn.modelo.CambioActitud;
import com.utn.modelo.Cliente;
import com.utn.modelo.Informe;
import com.utn.modelo.Vehiculo;

public class InformeConttrolador {

	// ejemplo N1
	public void trabajoConElInforme(Informe informe) {

		System.out.println(informe.getClass().getSimpleName());
		System.out.println("El cliente " +informe.getCliente().getNombre() +
				" con el vehiculo " + informe.getVehiculo().getMarca() + " lo cambio a " + informe.getTipo());
	
	}

	// ejemplo N2
	public void creoInformeCambioActitud() {

		// Opcion 1
		// me debo crear los objetos que espera la clase CambioActitud

		Vehiculo v = new Vehiculo("Peugeot", "Partner", "AC 123 XX", "Diesel", "1234abc");
		Cliente c = new Cliente("Pedro", "Gallo", 1234);

		CambioActitud ca = new CambioActitud(v, "Familiar", c, "Apto para circular", 5, true);

		// invoco al metodo y le paso la instancia
		this.muestroInforme(ca);
	}

	// Ejemplo N3
	public void creoInforme(Cliente c, Vehiculo v) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("ingrese el tipo");
		String utilitario = input.nextLine();
		System.out.println("ingrese el estado");
		String estado = input.nextLine();
		System.out.println("ingrese la cantidad de asientos");
		int cantAsientos = input.nextInt();
		System.out.println("es vidriado");
		boolean vidriado = input.nextBoolean();
	
		CambioActitud ca = new CambioActitud(v, utilitario, c, estado, cantAsientos, vidriado);
	
	}
	
	// Ejemplo N3
		public void creoInforme(Cliente c) {
		
			Scanner input = new Scanner(System.in);
			System.out.println("ingrese el tipo");
			String utilitario = input.nextLine();
			System.out.println("ingrese el estado");
			String estado = input.nextLine();
			System.out.println("ingrese la cantidad de asientos");
			int cantAsientos = input.nextInt();
			System.out.println("es vidriado");
			boolean vidriado = input.nextBoolean();
		
			CambioActitud ca = new CambioActitud(c.getListaVehiculos().get(1), utilitario, c, estado, cantAsientos, vidriado);
		
		}
	

	private void muestroInforme(CambioActitud pepita) {

		System.out.println(pepita);

	}
}
