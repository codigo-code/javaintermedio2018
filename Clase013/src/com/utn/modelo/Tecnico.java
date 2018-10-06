package com.utn.modelo;

public class Tecnico {
	
	private String nombre;
	private Dispositivos dispositivo;

	public Tecnico(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Dispositivos getDispositivo() {
		return dispositivo;
	}

	public void setDispositivo(Dispositivos dispositivo) {
		this.dispositivo = dispositivo;
	}

	public Tecnico() {}
}
