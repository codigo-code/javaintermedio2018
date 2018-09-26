package com.utn.modelo;

public class Veterinario {
	private String nombre;
	private String causa;
	private String medicacion;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCausa() {
		return causa;
	}
	public void setCausa(String causa) {
		this.causa = causa;
	}
	public String getMedicacion() {
		return medicacion;
	}
	public void setMedicacion(String medicacion) {
		this.medicacion = medicacion;
	}
	public Veterinario(String nombre, String causa, String medicacion) {
		super();
		this.nombre = nombre;
		this.causa = causa;
		this.medicacion = medicacion;
	}
	
	
	

}
