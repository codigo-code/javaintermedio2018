package com.utn.controlador;

import com.utn.modelo.Mamifero;
import com.utn.modelo.Perro;
import com.utn.modelo.Persona;

public class MamiferoControlador {

	public void CreoMamifero(String tipo) {
		
		Mamifero m1 = null;
		
		if (tipo.equals ("persona")) {
			m1 = new Persona("Joaquin", 70 ,1.70 , 27 , "Argentino");
		}
		if (tipo.equals("perro")) {
			m1 = new Perro ("Sparkly", 30 , 0.70, 10, "Bulldog");
		}
	System.out.println(m1);	
		}
	
	
	
	
}
