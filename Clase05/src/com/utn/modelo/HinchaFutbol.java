package com.utn.modelo;

public class HinchaFutbol implements IDialecto {

	@Override
	public void hablar(String idioma, String situacicon) {
		if(idioma == "caco") {
			System.out.println("e ameo alta yanta");
		}else {
				System.out.println("ey amigo altas yantas");
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comunicarse(String situacion) {
		
		System.out.println(situacion + " , una birra jefe!");
		// TODO Auto-generated method stub
		
	}

	@Override
	public String insultar(int lvlEnojo) {
		// TODO Auto-generated method stub
		return "corre muerto";
	}

}
