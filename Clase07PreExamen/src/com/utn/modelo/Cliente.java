package com.utn.modelo;

import java.util.ArrayList;

public class Cliente {
	
	private ArrayList<Pelicula> listaPelisAlquiladas;
	private String nombre;
	private String mail;
	private double dinero;
//	private int numero;
//	private int tiempo;
//	private int cliente;
	
	//asigno pelicula al cliente
	public boolean alquiloPelicula(Pelicula peli) {
		
		System.out.println("El valor de la pelicula a alquilar es de $" + peli.getPrecio());
		//compruebo si tiene dinero para alquilar la pelicula
		if(peli.getPrecio() <= this.dinero) {
			this.dinero = this.dinero-peli.getPrecio();
			this.listaPelisAlquiladas.add(peli);
			System.out.println("Su saldo actual es de: $" + this.dinero);
			return true;
		}else {
			System.out.println("pobre no tiene saldo suficiente");
			return false;
		}
	}

	public Cliente(String nombre, String mail, double dinero) {
		//ArrayList<Pelicula> listaPelisAlquiladas, 
		
		this.nombre = nombre;
		this.mail = mail;
		this.dinero = dinero;
		this.listaPelisAlquiladas = new ArrayList<Pelicula>();
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

	public ArrayList<Pelicula> getListaPelisAlquiladas() {
		return listaPelisAlquiladas;
	}

//	public Cliente(ArrayList<Pelicula> listaPelisAlquiladas, String nombre, String mail, double dinero) {
//		super();
//		this.listaPelisAlquiladas = listaPelisAlquiladas;
//		this.nombre = nombre;
//		this.mail = mail;
//		this.dinero = dinero;
//	}
	

}
