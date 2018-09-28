package com.utn.modelo.excepciones;

public class MiExcepcion extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4847004212019106143L;
	
	
	private String mensaje;

	
	public MiExcepcion(String mensaje) {
		this.mensaje = mensaje;
		
	}

	public void muestroMensajeDeError(Object objError){
		System.out.println("Hubo un error en la ejecucion de: " + objError);
		System.err.println(this.mensaje);
		
		
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.mensaje;
	}
	
}
