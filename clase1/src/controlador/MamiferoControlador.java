package controlador;

import modelo.mamifero;
import modelo.persona;

public class MamiferoControlador {

	
	public void creoMamifero(String tipo)
	{
		//creacion de objeto ==>>> instancias
		
		
		//dos conceptos
		//1)Crear el objeto directamente por la clase qie qieremos o que vamos a utilizar
		//
		
		//persona p1=new persona("joaquin",70.5,1.70,27,"Argentino");
				
		//2 por factoria abstracta
				
				//mamifero=new persona("claudia", 50, 1.74, 30, "Argentina");
				
				
		//3 la que no vamos a poder utilizar mas
			//mamifero m2=new mamifero("flor", 70, 1.40, 33)
		//una clase abtracta no se puede instanciar solo sirve para ser heredada
			//y tiene metodos abstractos
				
				mamifero m1=null;
		if (tipo.equals("perro")) {
			m1=new perro("sparkly",30,0.70,10,"bulldog");
		}
			//*****no se puede instancioar una clase abstracta*****
			
		System.out.println(m1);
			
	}
}
