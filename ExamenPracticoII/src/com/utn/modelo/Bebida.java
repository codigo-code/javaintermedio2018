package com.utn.modelo;

public abstract class Bebida {
	private Sabor sabor;
	
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
