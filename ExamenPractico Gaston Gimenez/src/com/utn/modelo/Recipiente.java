package com.utn.modelo;

public abstract class Recipiente {

	String primerSabor, segundoSabor;

	public abstract void rellenar();
	
	public String getPrimerSabor() {
		return primerSabor;
	}

	public void setPrimerSabor(String primerSabor) {
		this.primerSabor = primerSabor;
	}

	public String getSegundoSabor() {
		return segundoSabor;
	}

	public void setSegundoSabor(String segundoSabor) {
		this.segundoSabor = segundoSabor;
	}

	public Recipiente(String primerSabor, String segundoSabor) {
		super();
		this.primerSabor = primerSabor;
		this.segundoSabor = segundoSabor;
	}
	
	
	
}
