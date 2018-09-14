package com.utn.modelo;

import java.util.ArrayList;

public abstract class Pelicula {

	private ArrayList<Actor> listaActores; // new ArrayList<Actor>();
	private Genero genero;
	private double precio;
	private String desde;
	private String hasta;
	private String nombre;
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pelicula(String nombre, Genero genero, double precio) {
		this.genero = genero;
		this.precio = precio;
		this.nombre=nombre;
		//inicializo la lista por cada objeto de tipo pelicula que se crea
		this.listaActores= new ArrayList<Actor>();
	}

	public ArrayList<Actor> getListaActores() {
		return listaActores;
	}

	/***
	 * @Description se le agrega un actor por cada llamado
	 *              recuerden que el objeto fue inicializado
	 *              en el constrctor de pelicula
	 * @param actor
	 */
	public void agregarActorAPelicula(Actor actor) {
		this.listaActores.add(actor);
	}
	
	
	public Genero getGenero() {
		return genero;
	}





	public void setGenero(Genero genero) {
		this.genero = genero;
	}





	public double getPrecio() {
		return precio;
	}





	public void setPrecio(double precio) {
		this.precio = precio;
	}





	public String getDesde() {
		return desde;
	}





	public void setDesde(String desde) {
		this.desde = desde;
	}





	public String getHasta() {
		return hasta;
	}





	public void setHasta(String hasta) {
		this.hasta = hasta;
	}





	//metodo abstracto
	public abstract String tipoFormato();
	
	
	
}
