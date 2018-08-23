package Clases;

public abstract class Persona {

	//Atributos
	
	String nombre;
	int edad, dni, peso;
	
	//Metodos (no obligatorio)
	
	
	//Constructor
	
	public Persona(String nombre, int edad, int dni, int peso) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.peso = peso;
	}

	
	//Getters y Setters 
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	
	
}
