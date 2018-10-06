package com.utn.modelo;

import java.util.Date;

public class OReparacion {
	
	private Date fecha;
	private Cliente cliente;
	private Tecnico tecnico;
	private int numReparacion;
	private String observacion;
	private Presupuesto presupuesto;
	public OReparacion(Date fecha, Cliente cliente, Tecnico tecnico, int numReparacion, String observacion,
			Presupuesto presupuesto) {
		super();
		this.fecha = fecha;
		this.cliente = cliente;
		this.tecnico = tecnico;
		this.numReparacion = numReparacion;
		this.observacion = observacion;
		this.presupuesto = presupuesto;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Tecnico getTecnico() {
		return tecnico;
	}
	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}
	public int getNumReparacion() {
		return numReparacion;
	}
	public void setNumReparacion(int numReparacion) {
		this.numReparacion = numReparacion;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public Presupuesto getPresupuesto() {
		return presupuesto;
	}
	public void setPresupuesto(Presupuesto presupuesto) {
		this.presupuesto = presupuesto;
	}
	
	
	
	

}
