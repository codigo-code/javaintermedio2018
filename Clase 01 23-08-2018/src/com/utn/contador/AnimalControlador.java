package com.utn.contador;

import com.utn.modelo.Anfibio;
import com.utn.modelo.Animal;
import com.utn.modelo.Ave;
import com.utn.modelo.Mamifero;
import com.utn.modelo.Pez;
import com.utn.modelo.Reptil;

public class AnimalControlador 
{

	public void crearAnimal(String tipo)
	{
	
		if(tipo.equals("Ave"))
		{
			Animal a1 = new Ave (null, 0, 0, 0);
		}
		else if (tipo.equals("Mamifero"))
		{
			Animal a1 = new Mamifero (null, 0, 0, 0, 0);
		}
		else if (tipo.equals("Pez"))
		{
			Animal a1 = new Pez (null, 0, 0, 0);
		}
		else if (tipo.equals ("Reptil"))
		{
			Animal a1 = new Reptil (null, 0, 0, 0);
		}
		else
		{
			Animal a1 = new Anfibio (null, 0, 0, 0);
		}
	}
}


