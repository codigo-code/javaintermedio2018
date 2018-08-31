package com.utn.modelo;

public class Vaca extends Mamifero {

	private boolean lechera;
	
	
	public boolean isLechera() {
		return lechera;
	}

	public Vaca(String nombre, double peso, double altura, int edad,boolean lechera) {
		super(nombre, peso, altura, edad);
		this.lechera=lechera;
	}

	@Override
	public void comunicarse() {
		System.out.println("Muuuu");
		
	}

	@Override
	public String dormir(double horas) {
		// TODO Auto-generated method stub
		return null;
	}

}
