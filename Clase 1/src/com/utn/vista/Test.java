package com.utn.vista;

import com.utn.controlador.MamiferoControlador;
import com.utn.modelo.Mamifero;

public class Test {

	public static void main(String[] args) {


		MamiferoControlador mc = new MamiferoControlador();
		
		
		//la variable m es de tipo mamifero pero...
		Mamifero m = mc.creoMamifero("Perro");
		
		System.out.println(m.getClass().getSimpleName()); //devuelve el nombre de la class que fue instanciado
		System.out.println(m.getNombre());
		m.comunicarse();
		
	//	System.out.println(m.getClass()); //comprovamos de que tipo es el objeto
			
		
	//getClass se hereda de la clase object y sirve para mostrar o devolver el tipo de la clase que fue instanciado
		
		//castear es la convercion de un tipo a otro
		
		}

	}


