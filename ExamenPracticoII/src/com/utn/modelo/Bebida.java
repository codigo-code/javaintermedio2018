package com.utn.modelo;

public abstract class Bebida {
	private Sabor sabor;
	private String gustito;
	
	public Bebida() {
		
	}
	
	public Bebida(Sabor sabor) {
		super();
		this.sabor = sabor;
	}

	public abstract void agregarBicarbonato();
	
	public abstract void agitar();
	
	public abstract void reposar(); 
	
	public abstract void embazar(); 

}
