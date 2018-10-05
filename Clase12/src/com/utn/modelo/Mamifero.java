package com.utn.modelo;

public abstract class Mamifero {

	//trabajando con sobre - carga de metodos
	
	/*
	 * un metodo puede tener el mismo contrato
	 * contrato = 
	 * visibilida
	 * tipo
	 * nombre del metodo
	 * 
	 * pero tiene que tener distinta firma
	 * firma=
	 * parametros que van entre los parentesis
	 * 
	 * 
	 * Sobre-carga
	 * sobre-escritura ** 
	 * 
	 * ** la sobre-escritura se dara
	 * cuando extendamos en las clases no abstractas
	 * 
	 */

	//sobre carga de metodos abstractos
	public abstract void comer();
	
	public abstract void comer(String[] alimentos);
	
	public abstract void comer(int cantAlimentos);
	
	public abstract void comer(int cantAlimentos, String[] alimentos);
	
	public abstract void comer(String[] alimentos,int cantAlimentos);
	
	public abstract void comer(String hamburguesa, String lechuga);
	
	
	
}
