package com.utn.modelo;

import java.util.ArrayList;

public class Cliente {

	private String nombre;
	private String mail;
	private double dinero;
	private ArrayList<Pelicula> listaPeliculasAlquiladas;

	// asigno una pelicula al cliente
	public boolean alquiloPelicula(Pelicula peli) {

		System.out.println("El valor de la pelicula a alquilar es de: " + peli.getPrecio());
		// compruebo si la persona tiene dinero para alquilar la pelicula
		if (peli.getPrecio() <= this.dinero) {
			this.dinero = this.dinero - peli.getPrecio();
			this.listaPeliculasAlquiladas.add(peli);
			System.out.println("Su saldo actual es de: " + this.dinero);
			return true;
		} else {
			System.out.println("pobreton no tiene dinero suficiente para alquilar esta pelicula ");
			return false;
		}
	}

	public Cliente(String nombre, String mail, double dinero) {
		this.nombre = nombre;
		this.mail = mail;
		this.dinero = dinero;
		this.listaPeliculasAlquiladas = new ArrayList<Pelicula>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public double getDinero() {
		return dinero;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}

	public ArrayList<Pelicula> getListaPeliculasAlquiladas() {
		return listaPeliculasAlquiladas;
	}
	
	
	
	
}
