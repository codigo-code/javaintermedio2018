package com.utn.modelo;

import java.util.Scanner;

public class Animal {
	private Tipo tipo;
	private String raza;
	private int edad;
	private String causaAtencion;
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getCausaAtencion() {
		return causaAtencion;
	}
	public void setCausaAtencion(String causaAtencion) {
		this.causaAtencion = causaAtencion;
	}
	public Animal(Tipo tipo, String raza, int edad, String causaAtencion) {
		this.tipo = tipo;
		this.raza = raza;
		this.edad = edad;
		this.causaAtencion = causaAtencion;
	}

	public void ingresarAnimal() {
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese tipo de animal");
		String tipo = input.next();
		System.out.println("Ingrese raza");
		String raza = input.next();
		System.out.println("Ingrese edad");
		int edad = input.nextInt();
		System.out.println("Ingrese causa de atencion");
		String causaAtencion = input.next();
		
	}
	
}
