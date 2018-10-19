package com.utn.modelo;

public class Pedido {
	private String tipo;
	private double conAlcohol;
	private double sinAlcohol;
	
	public Pedido() {
		
	}
	
	
	public double getConAlcohol() {
		return conAlcohol;
	}
	public void setConAlcohol(int conAlcohol) {
		this.conAlcohol = conAlcohol;
	}
	public Pedido(String tipo, double conAlcohol, double sinAlcohol) {
		super();
		this.tipo = tipo;
		this.conAlcohol = conAlcohol;
		this.sinAlcohol = sinAlcohol;
	}


	public double getSinAlcohol() {
		return sinAlcohol;
	}
	public void setSinAlcohol(int sinAlcohol) {
		this.sinAlcohol = sinAlcohol;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public void setConAlcohol(double conAlcohol) {
		this.conAlcohol = conAlcohol;
	}


	public void setSinAlcohol(double sinAlcohol) {
		this.sinAlcohol = sinAlcohol;
	}
	
	

}
