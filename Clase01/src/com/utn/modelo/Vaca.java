package com.utn.modelo;

public class Vaca extends Mamifero{
	
	private boolean lechera;

	public Vaca(String nombre, double peso, double altura, int edad, boolean lechera) {
		super(nombre, peso, altura, edad);
		this.lechera=lechera;
		// TODO Auto-generated constructor stub
	}
	
	public boolean isLechera() {
		return lechera;
	}



	@Override
	public void comunicarse() {
		System.out.println("Mooooo");
		
	}

	@Override
	public String dormir(double horas) {
		// TODO Auto-generated method stub
		return null;
	}

}
