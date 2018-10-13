package com.utn.modelo;

public class Pedido {
	private int conAlcohol;
	private int sinAlcohol;
	
	public Pedido() {
		
	}
	
	public Pedido(int conAlcohol, int sinAlcohol) {
		super();
		this.conAlcohol = conAlcohol;
		this.sinAlcohol = sinAlcohol;
	}
	public int getConAlcohol() {
		return conAlcohol;
	}
	public void setConAlcohol(int conAlcohol) {
		this.conAlcohol = conAlcohol;
	}
	public int getSinAlcohol() {
		return sinAlcohol;
	}
	public void setSinAlcohol(int sinAlcohol) {
		this.sinAlcohol = sinAlcohol;
	}
	
	

}
