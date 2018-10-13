package com.utn.modelo;

public class Sabor extends Bebida {
	
	private String sabor;

	
	public Sabor(String sabor) {
		this.sabor = sabor;
	}
	
	
	
	public String getSabor() {
		return sabor;
	}



	public void setSabor(String sabor) {
		this.sabor = sabor;
	}



	@Override
	public void agregarBicarbonato() {
		// TODO Auto-generated method stub

	}

	@Override
	public void agitar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void reposar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void embazar() {
		// TODO Auto-generated method stub

	}
	
	public void inyectarAlcohol() {
		
	}
	

}
