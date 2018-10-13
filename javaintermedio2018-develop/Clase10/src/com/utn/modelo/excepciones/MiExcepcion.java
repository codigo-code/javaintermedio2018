package com.utn.modelo.excepciones;


/*
 * PASO N1 Crear una clase que extienda de Excpetion
 */
public class MiExcepcion extends Exception {

	private static final long serialVersionUID = 4847004212019106143L;

	//mensaje donde voy a alojar el mensaje
	private String mensaje;
	
	public MiExcepcion(String mensaje) {
		this.mensaje=mensaje;
	}
	
	public void muestroMensajeDeError(Object objError) {
		System.out.println("Hubo un error en la ejecucion de: " + objError);
		System.err.println(this.mensaje);
	}
	
	@Override
	public String getMessage() {
		return this.mensaje;
	}
}
