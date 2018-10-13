package com.utn.modelo;

public class Auto implements IMotor {

	@Override
	public void encender(String combustible) {
		System.out.println("encendio el auto con el combustible " +  combustible);
	}

	@Override
	public void combustion() {
		// TODO Auto-generated method stub
		System.out.println("se cambio la funcionalidad solo para la clase Auto");
	}
}
