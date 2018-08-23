package Clases;

public class Hombre extends Persona{

	String nacionalidad;
	
	
	public Hombre(String nombre, int edad, int dni, int peso, String nacionalidad) {
		super(nombre, edad, dni, peso);
		this.nacionalidad = nacionalidad;
	}

	
	
}
