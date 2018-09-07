package com.utn.modelo;

public interface IDialecto {

	/*
	 * TERORIA:
	 * todos sus metodos son publicos
	 * acepta constantes
	 * 
	 * con java 1.7 los metodos no se podian implementar en 
	 * la interfaz ( si se podia si tenian una clase anonima)
	 * 
	 * con java 1.8 exista el metodo default 
	 * donde te permite presczindir de la clase anonima
	 * 
	 * lo que nos permite es implementar directamente la funcionalidad
	 * 
	 */
	
	//a partir de java 1.4 deja de ser obligatorio poner el abstract
	public abstract void hablar(String idioma, String situacion);
	
	
	public void comunicarse(String situacion);
	
	
	//  si el metodo esta abstracto no tengo la necesidad
	//de implementarlo en este momento
	public String insultar(int lvlEnojo);
	
	
	
	
	
	
	
	
}
