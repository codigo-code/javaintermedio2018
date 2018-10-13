package com.utn.modelo;

public class Politico {

	private String nombre;
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void discurso(String situacion) {
		situacion=null;
		                  //null.toString()
		System.out.println(situacion.toString());
	}


}
