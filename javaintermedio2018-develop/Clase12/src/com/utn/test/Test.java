package com.utn.test;

import java.util.ArrayList;

import com.utn.controlador.StringBuilderController;
import com.utn.modelo.Persona;

public class Test {

	// un solo proceso
	public static void main(String[] args) {

		StringBuilderController sc = new StringBuilderController();

		String valor = "alagordadrogala";

		// sc.invertirUnaCadena(valor); //

		StringBuilder dadoVuelta = sc.doyVultaConBuilder(new StringBuilder(valor));

		System.out.println(valor);
		System.out.println(dadoVuelta);

		// hay q pasarlo a toString y aplicar el equals
		if (dadoVuelta.toString().equals(valor.toString())) {
			System.out.println("Es igual");
		} else {
			System.out.println("No es igual");
		}

		System.out.println("===========================");

		Persona p1 = new Persona("alex",26);
		
		System.out.println(p1.getNombre() + " se comio! y tiene la edad de: " + p1.getEdad());
		String[] alimentos = { "papas", "pan", "helado" };

		p1.comer();
		p1.comer(alimentos);
		p1.comer(alimentos, 1);
		p1.comer("Salchica", "Banana");

		System.out.println(p1.hablar());
		p1.hablar("hellow!");
		
		//ArrayList estoy utilizando lambda foreach(variable ->{ meetodo});
		p1.hablar("hello", "hi", "cat", "dog", "goodbye", "lenny").forEach(x -> {
			System.out.println(x);
		});
		
		ArrayList<String> vector =  p1.hablar("palabra1","palabra2");
		
		for (String item : vector) {
			System.out.println(item);
		}
		

	}

}
