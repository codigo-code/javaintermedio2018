package com.utn.modelo;

public class Actor {

	private String nombre;
	private String apellido;
	private int anoNacimiento;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getAnoNacimiento() {
		return anoNacimiento;
	}

	public void setAnoNacimiento(int anoNacimiento) {
		this.anoNacimiento = anoNacimiento;
	}

	public Actor(String nombre, String apellido, int anoNacimiento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.anoNacimiento = anoNacimiento;
	}

}
