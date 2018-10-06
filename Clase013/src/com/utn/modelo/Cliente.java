package com.utn.modelo;

public class Cliente {

	private String nombre;
	private String apellido;
	private int telefono;
	private Dispositivos dispositivo;
	
	public Cliente(String nombre, String apellido, int telefono, Dispositivos dispositivo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.dispositivo = dispositivo;
	}
	public Cliente () {
		
	}

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

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public Dispositivos getDispositivo() {
		return dispositivo;
	}

	public void setDispositivo(Dispositivos dispositivo) {
		this.dispositivo = dispositivo;
	}
	
	
}
