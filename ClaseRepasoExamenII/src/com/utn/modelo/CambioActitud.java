package com.utn.modelo;

public class CambioActitud extends Informe {

	private int cantAsientos;
	private boolean vidriado;
	
	public CambioActitud() {
	}
	
	public CambioActitud(Vehiculo vehiculo, 
			String tipo, 
			Cliente cliente, 
			String observaciones,
			int cantAsientos, 
			boolean vidriado ) 
	{
		super(vehiculo, tipo, cliente, observaciones);
		this.cantAsientos = cantAsientos;
		this.vidriado = vidriado;
	}


	public int getCantAsientos() {
		return cantAsientos;
	}
	public void setCantAsientos(int cantAsientos) {
		this.cantAsientos = cantAsientos;
	}
	public boolean isVidriado() {
		return vidriado;
	}
	public void setVidriado(boolean vidriado) {
		this.vidriado = vidriado;
	}
	
	
}
