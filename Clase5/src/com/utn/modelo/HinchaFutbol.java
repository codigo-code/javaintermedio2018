package com.utn.modelo;

public class HinchaFutbol implements IDialecto {

	@Override
	public void hablar(String idioma, String situacion) {
		
		if(idioma == "caco") {
			System.out.println("e ameo altas yanta'");
		}else {
			System.out.println("es ameo altas yantas");
		}
		
	}

	@Override
	public void comunicarse(String situacion) {
		
		System.out.println(situacion + ", una birra jefe!");
		
	}

	@Override
	public String insultar(int lvlEnojo) {
		// TODO Auto-generated method stub
		return "Corre muerto para que te vine a ver!";
	}

}
