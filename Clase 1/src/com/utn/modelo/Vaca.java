package com.utn.modelo;

public class Vaca extends Mamifero {
	
	private boolean lechera;
	
	public boolean isLechera() {
		return lechera;
	}
	
	
	public Vaca(String nombre, double peso, double altura, int edad, boolean lechera) {
		super(nombre, peso, altura, edad);
		this.lechera=lechera;
	}

	@Override
	public void comunicarse() {
		System.out.println("MUUUUUUUUU!!!!");
		
	}

	@Override
	public String dormir(double horas) {
			
		return null;
	}

}
