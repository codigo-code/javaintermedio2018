package com.utn.modelo;

public class Alumno  implements IDialecto {

	@Override
	public void hablar(String idioma, String situacicon) {
		if (idioma == "espanol")
			System.out.println("Buenos dias");
		else
			System.out.println("Bom dia");
		
	}

	@Override
	public void comunicarse(String situacion) {
		System.out.println("disculpe profe tengo una duda");
		
		
	}

	@Override
	public String insultar(int lvlEnojo) {
		// TODO Auto-generated method stub
		return null;
	}

}
