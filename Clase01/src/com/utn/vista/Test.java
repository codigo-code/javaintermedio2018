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
		Mamifero m = mc.creoMamifero("perro");
		
		System.out.println(m.getClass().getSimpleName());
		System.out.println(m.getNombre());
		m.comunicarse();
		
		//chequear que la instancia
		if (m instanceof Persona) {
			//cast = la convercion de un tipo a otro
			Persona p1 = (Persona) m;
			System.out.println(p1.getNacionalidad());
			
		}
		//comparamos si m es de tipo perro 
		if (m instanceof Perro) {
			Perro perro1 = (Perro) m;
			//Asigno el objeto previamente creado sabiendo que es del tipo X a un nuevo objeto/atributo/variable
			//porque no hacemos el NEW?
			//RTA: al hacer new se inicializa nuevamente todo el objeto
			//perro1 = (ClasePerro)m <-- la instancia se copia a la nueva variable
			//perro1 => es estatic
			System.out.println(perro1.getRaza());
			
		}

	}

}
