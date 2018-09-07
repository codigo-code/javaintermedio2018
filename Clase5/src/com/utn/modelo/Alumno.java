package com.utn.modelo;

public class Alumno implements IDialecto {

	@Override
	public void hablar(String idioma, String situacion) {
		if (idioma == "espanol")
			System.out.println("Buenos dias");
		else
			System.out.println("bom dia!");
	}

	@Override
	public void comunicarse(String situacion) {

		System.out.println("Disculpe profe tenge une dude");
	}

	@Override
	public String insultar(int lvlEnojo) {
		// TODO Auto-generated method stub
		return "Profe me cago!";
	}

}
