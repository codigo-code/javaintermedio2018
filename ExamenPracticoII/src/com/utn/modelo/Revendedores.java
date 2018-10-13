package com.utn.modelo;

public class Revendedores {
	private String nombre;
	private String apellido;
	private int dni;
	private int celular;
	private String direccion;
	private String localidad;
	private int codPostal;
	private String pedido;
	
	
	public Revendedores() {
		
	}
	
	public Revendedores(String nombre, String apellido, int dni, int celular, String direccion, String localidad,
			int codPostal, String pedido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.celular = celular;
		this.direccion = direccion;
		this.localidad = localidad;
		this.codPostal = codPostal;
		this.pedido = pedido;
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




	public void setDni(int dni) {
		this.dni = dni;
	}




	public int getCelular() {
		return celular;
	}




	public void setCelular(int celular) {
		this.celular = celular;
	}




	public String getDireccion() {
		return direccion;
	}




	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}




	public String getLocalidad() {
		return localidad;
	}




	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}




	public int getCodPostal() {
		return codPostal;
	}




	public void setCodPostal(int codPostal) {
		this.codPostal = codPostal;
	}




	public String getPedido() {
		return pedido;
	}




	public void setPedido(String pedido) {
		this.pedido = pedido;
	}
	
	
	
	
	

}
