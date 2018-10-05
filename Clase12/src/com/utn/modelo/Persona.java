package com.utn.modelo;

import java.util.ArrayList;

public class Persona  extends Mamifero{

	
	private String nombre;
	private int edad;
	//sobre-carga de constructores
	
	//por defecto esta el que hereda de object
	
	public Persona(){}
	
	public Persona(String nombre) {
		this.nombre=nombre;
	}
	
	public Persona(int edad) {
		this.edad=edad;
	}
	
	public Persona(String nombre, int edad) {
		this.nombre=nombre;
		this.edad=edad;
	}
	
	
	/*
	 *  override es sobre la sobre-escritura de los metodos
	 *  
	 *  sobre-carga el el mismo metodo con distinta firma
	 */
	
	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	@Override
	public void comer() {

			System.out.println("la persona esta comeindo");
	}

	@Override
	public void comer(String[] alimentos) {
		
		System.out.println("la persona comio");
		
		for (int i = 0; i < alimentos.length; i++) {
			System.out.println(alimentos[i]);
		}
		
	}

	@Override
	public void comer(int cantAlimentos) {
		System.out.println("hoy la persona se clavo " + cantAlimentos + " cantidad de alimentoss");
	}

	@Override
	public void comer(int cantAlimentos, String[] alimentos) {
		System.out.println("se comio " + cantAlimentos);
		for (int i = 0; i < alimentos.length; i++) {
			System.out.println(alimentos[i]);
		}
	}

	@Override
	public void comer(String[] alimentos, int cantAlimentos) {
		System.out.println("no implementado");
		
	}

	@Override
	public void comer(String hamburguesa, String lechuga) {
		System.out.println("comido el alimento N1 " + hamburguesa +  " y el alimento N2 " + lechuga);
	}
	
	public String hablar() {
		return "hola como estas";
	}
	
	public void hablar(String idioma) {
		System.out.println(idioma);
	}
	
	public ArrayList<String> hablar(String...palabras){
		ArrayList<String> vec = new ArrayList<>();
		
		for (int i = 0; i < palabras.length; i++) {
			vec.add(palabras[i]);
		}
		return vec;
	}
	
	
	
}
