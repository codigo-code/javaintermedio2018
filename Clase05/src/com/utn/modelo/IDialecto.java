package com.utn.modelo;

public interface IDialecto {
	
	/*
	 * TEORIA
	 * todos los metodos son publicos
	 * acepta constantes
	 * 
	 * java 1.7 los metodos no se podian implementar en la interfaz
	 * (si se podian tenian una clase anonima)
	 * 
	 * java 1.8 existe el metodo default
	 * que permite prescindir de la clase anonima
	 * 
	 * lo que nos permite es implementar directamente la funcionalidad
	 */
	//a partir de java 1.4 deja de ser obligatorio poner el abstract
	public abstract void hablar(String idioma, String situacicon); // por ser de tipo interfaz la palabra abstract es opcional
		
	public void comunicarse(String situacion);
	
	//si el metodo es abstracto no hay necesidad de implementarlo en el momento
	
	public String insultar(int lvlEnojo);

}
