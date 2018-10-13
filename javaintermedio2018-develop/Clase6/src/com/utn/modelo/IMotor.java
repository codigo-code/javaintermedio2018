package com.utn.modelo;

public interface IMotor {

	
	public void encender(String combustible);  
	
	
	//A partir de java 1.8 existen el metodo default 
	//lo que permite es tener una funcionalidad por defecto
	// similar a que si fuera una clase abstracta con un metod no abstracto
	//que luego se puede re-definir en la clas implementada
	default void combustion() {
		System.out.println("la combustion es indfierente si es nafta o gasoil");
	}
}
