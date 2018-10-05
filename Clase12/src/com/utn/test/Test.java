package com.utn.test;

import com.utn.controlador.StringBuilderController;

public class Test {

	// un solo proceso
	public static void main(String[] args) {

		StringBuilderController sc = new StringBuilderController();

		String valor = "alagordadrogala";

		// sc.invertirUnaCadena(valor); //

		StringBuilder dadoVuelta = sc.doyVultaConBuilder(new StringBuilder(valor));

		System.out.println(valor);
		System.out.println(dadoVuelta);
		
		
		
		if (dadoVuelta.toString().equals(valor.toString())) {
			System.out.println("Es igual");
		} else {
			System.out.println("No es igual");
		}
	}

}
