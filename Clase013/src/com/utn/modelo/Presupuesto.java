package com.utn.modelo;

import java.util.ArrayList;

public class Presupuesto {

	private OReparacion Reparacion;
	private double costo;
	private ArrayList <String> Materiales; 
	 
	public OReparacion getReparacion() {
		return Reparacion;
	}

	public void setReparacion(OReparacion reparacion) {
		Reparacion = reparacion;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public ArrayList<String> getMateriales() {
		return Materiales;
	}

	public void setMateriales(ArrayList<String> materiales) {
		Materiales = materiales;
	}

	public Presupuesto(OReparacion reparacion, double costo, ArrayList<String> materiales) {
		super();
		Reparacion = reparacion;
		this.costo = costo;
		Materiales = materiales;
	}

	public Presupuesto () {
		
	} 

	
	
	
	
	
	
}
