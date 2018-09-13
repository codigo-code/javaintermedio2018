package com.utn.modelo;

public class Moto implements IMotor {

	@Override
	public void encender(String combustible) {
		System.out.println("enciendo la moto con el combustible " +  combustible);
	}

}
