package com.utn.modelo;

public class Movil extends Dispositivos {

	private boolean sim;
	
	public boolean isSim() {
		return sim;
	}

	public void setSim(boolean sim) {
		this.sim = sim;
	}

	public Movil(String marca, float imei, String modelo, String defecto, Estado estado, boolean reparable) {
		super(marca, imei, modelo, defecto, estado, reparable);
		// TODO Auto-generated constructor stub
	}

	public Movil() {
		// TODO Auto-generated constructor stub
	}

	public Movil(String marca, String modelo, String defecto) {
		super(marca, modelo, defecto);
		// TODO Auto-generated constructor stub
	}

}
