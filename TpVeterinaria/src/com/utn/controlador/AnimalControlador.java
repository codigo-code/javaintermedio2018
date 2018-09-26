package com.utn.controlador;

import java.util.ArrayList;
import java.util.Scanner;

import com.utn.modelo.Animal;
import com.utn.modelo.Conejo;
import com.utn.modelo.Tipo;

public class AnimalControlador {
	
	private ArrayList<Animal> listaAnimales;
	
	public AnimalControlador() {
		this.listaAnimales = new ArrayList<>();
	
	}
	
	public void crearAnimal(Tipo tipo, String raza, int edad,String causaAtencion) {
		Scanner input = new Scanner(System.in);
		Animal a = null;
		
		switch(tipo) {
		case CONEJO:
			a = new Conejo(tipo, raza,edad,causaAtencion);
			//tengo un metodo en la clase Animal para crear animales pero no pude meterlo aca para que funcione el switch
			break;
		case PERRO:
			a = new Perro(tipo, raza,edad,causaAtencion);
			
			break;
			
		case GATO:
			a = new Gato(tipo, raza,edad,causaAtencion);
			
			break;
		default:
			System.out.println("No atendemos ese animal");
			break;
		}
		this.listaAnimales.add(a);
		System.out.println("=============================================");
	}
	
	
	public void muestroListaAnimales() {
		this.listaAnimales.forEach(item ->{
			System.out.println(item.getClass().getSimpleName());
			if (item instanceof Conejo) {
				Conejo itemConejo = (Conejo) item;
				System.out.println("Tipo animal: " + itemConejo.getTipo() + " , Raza: " + item.getRaza() + " Edad: "
						 + item.getEdad() + " Causa de visita: " + item.getCausaAtencion());				
			}if (item instanceof Gato) {
				Gato itemGato = (Gato) item;
				System.out.println("Tipo animal: " + itemGato.getTipo() + " , Raza: " + item.getRaza() + " Edad: "
						 + item.getEdad() + " Causa de visita: " + item.getCausaAtencion());
				}if (item instanceof Perro) {
					Perro itemPerro = (Perro) item;
					System.out.println("Tipo animal: " + itemPerro.getTipo() + " , Raza: " + item.getRaza() + " Edad: "
							 + item.getEdad() + " Causa de visita: " + item.getCausaAtencion());
				}

		});
	}
	
	

}
