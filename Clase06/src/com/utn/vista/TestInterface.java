package com.utn.vista;

import com.utn.modelo.Auto;
import com.utn.modelo.IMotor;
import com.utn.modelo.Moto;

public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto a1 = new Auto();
		
		IMotor a2 = new Auto();
		IMotor m1 = new Moto();
		
		a1.encender("Gasoil");

		a2.encender("Nafta");
	}

}
