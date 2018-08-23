package Main;

import Clases.Hombre;
import Clases.Persona;

public class Main {

	public static void main(String[] args) {
		
		Persona p1 = new Hombre ("Gaston Gimenez", 20,  40972177, 92, "Argentina");

		System.out.println("Nombre");
		System.out.println(p1.getNombre());
		System.out.println("Edad");
		System.out.println(p1.getEdad());
		System.out.println("DNI:");
		System.out.println(p1.getDni());
		System.out.println("Peso");
		System.out.println(p1.getPeso());
	}

}
