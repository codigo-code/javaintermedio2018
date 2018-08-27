package com.utn.vista;

import com.utn.controlador.MamiferoControlador;
import com.utn.modelo.Mamifero;
import com.utn.modelo.Perro;
import com.utn.modelo.Persona;

public class Test {

	public static void main(String[] args) {
		MamiferoControlador mc = new MamiferoControlador();
		
		//mc.creoMamifero("gato");//devuelve un objeto instanciado
		
		//la variable m es de tipo mamifero pero...
		Mamifero m = mc.creoMamifero("persona");
		
		System.out.println(m.getClass().getSimpleName());
		System.out.println(m.getNombre());
		m.comunicarse();
		
		//chequear que la instancia
		if (m instanceof Persona) {
			//cast = la convercion de un tipo a otro
			Persona p1 = (Persona) m;
			System.out.println(p1.getNacionalidad());
			
		}
		
		if (m instanceof Perro) {
			Perro perro1 = (Perro) m;
			System.out.println(perro1.getRaza());
			
		}

	}

}
