package com.utn.modelo;



public abstract class Dispositivos {
	private String marca;
	private float imei;
	private String modelo;
	private String defecto;
	private Estado estado;
	private boolean reparable;
	public Dispositivos(String marca, float imei, String modelo, String defecto, Estado estado, boolean reparable) {
		super();
		this.marca = marca;
		this.imei = imei;
		this.modelo = modelo;
		this.defecto = defecto;
		this.estado = estado;
		this.reparable = reparable;
	}
	
public Dispositivos () {
	
}
public Dispositivos(String marca, String modelo, String defecto) {
	this.marca= marca;
	this.modelo= modelo;
	this.defecto= defecto;
	
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public float getImei() {
	return imei;
}

public void setImei(float imei) {
	this.imei = imei;
}

public String getModelo() {
	return modelo;
}

public void setModelo(String modelo) {
	this.modelo = modelo;
}

public String getDefecto() {
	return defecto;
}

public void setDefecto(String defecto) {
	this.defecto = defecto;
}

public Estado getEstado() {
	return estado;
}

public void setEstado(Estado estado) {
	this.estado = estado;
}

public boolean isReparable() {
	return reparable;
}

public void setReparable(boolean reparable) {
	this.reparable = reparable;
}

}
