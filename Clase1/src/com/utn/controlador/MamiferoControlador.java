package com.utn.controlador;

import com.utn.modelo.Mamifero;
import com.utn.modelo.Perro;
import com.utn.modelo.Persona;

public class MamiferoControlador {

	public void creoMamifero(String tipo){
		
	//	Mamifero m1 = new Persona("Joaquin", 70.5,1.70,28,"Argentino");
		Mamifero m1=null;
	
		if (tipo.equals("persona")) {
			m1 = new Persona("Joaquin", 70.5,1.70,28,"Argentino");
		}
		
		if (tipo.equals("perro")) {
			m1 = new Perro("Adin", 30.0,0.70,10,"Labrador");
		}
		System.out.println(m1);
		
	}
}
