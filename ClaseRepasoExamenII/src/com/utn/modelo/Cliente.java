package com.utn.modelo;

import java.util.ArrayList;

public class Cliente {

	private String nombre;
	private String apellido;
	private int dni;
	
	//  a modo ejemplo
	//	private Vehiculo[] listaArrayVehiculo = new Vehiculo[5];
	// como esto debo instanciarlo lo puedo hacer o en esta linea
	// o en el constructor
	private ArrayList<Vehiculo> listaVehiculos;

	/*
	 * Sobre-cargar de constructores donde uno esta esperando
	 * la lista
	 * y el otro la instancia dentro del cosntructor
	 */
	public Cliente(String nombre, String apellido, int dni) {
		this.listaVehiculos = new ArrayList<Vehiculo>();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}

	public Cliente(String nombre, String apellido, int dni, ArrayList<Vehiculo> listaVehiculos) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.listaVehiculos = listaVehiculos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(final int dni) {
		this.dni = dni;
	}

	//devuelve toda la lista de vehiculos
	public ArrayList<Vehiculo> getListaVehiculos() {
		return listaVehiculos;
	}

	//asigno una lista de vehiculos a la lista que tengo en dicha clase...
	//lo cambio por un metodo que ingrese vehiculos a la lista
	public void setVehiculoLista(Vehiculo vehiculo) {
		this.listaVehiculos.add(vehiculo);
	}
	
//	public void asignoItemAlVector(Vehiculo v, int indice) {
//		if(indice < 5)
//		this.listaArrayVehiculo[indice]=v;
//		else 
//			System.out.println("no puede ingresar mas xq no tiene dismesion!");
//	}

}
