package com.utn.modelo;

public class Fernet extends Bebida {

	private int cantidadFernet;
	
	
	
	public int getCantidadFernet() {
		return cantidadFernet;
	}

	public void setCantidadFernet(int cantidadFernet) {
		this.cantidadFernet = cantidadFernet;
	}

	public void inyetarAlcohol() {
		
	}
	
	public Fernet() {
		// TODO Auto-generated constructor stub
	}

	public Fernet(Sabor sabor) {
		super(sabor);
		// TODO Auto-generated constructor stub
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

}
