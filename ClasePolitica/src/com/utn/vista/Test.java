package com.utn.vista;

import java.io.FileWriter;
import java.io.IOException;

import com.utn.modelo.Politico;

public class Test {

	public static void main(String[] args) throws IOException {

		Politico p = new Politico();

		// System.out.println("====== SIN TRY ======");
		p.setNombre("Donald Trump");

		System.out.println("==== CON TRY ======");
		
		try {
		
			double res = 1/0;
			
		} catch (Exception e) {
			FileWriter f = new FileWriter("Archivo.log");
			f.write(e.getMessage());
			f.flush();
			f.close();
			System.out.println(e.getMessage());
		}

		System.out.println("FIN DE LA EJECUCION!");
	}

}
