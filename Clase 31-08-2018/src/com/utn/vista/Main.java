package com.utn.vista;
import java.util.Scanner;
import com.utn.controlador.TransporteControlador;
import com.utn.modelo.TipoTransporte;

public class Main {

	public static void main(String[] args) {
		
		TransporteControlador tc = new TransporteControlador(null);
		Scanner in = new Scanner (System.in);
		System.out.println("¿Que transporte desea tomar?");
		String tipo = in.nextLine();
		tc.definir(tipo);
	}
}
