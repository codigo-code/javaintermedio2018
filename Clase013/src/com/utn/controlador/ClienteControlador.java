package com.utn.controlador;

import com.utn.modelo.Cliente;
import com.utn.modelo.Dispositivos;
import com.utn.modelo.Movil;

public class ClienteControlador {
	public Cliente ingresoClienteYDispositivo() {
	
		Cliente c = new Cliente();
		c.setNombre("Raul");
		c.setApellido("Alfonsin");
		c.setDispositivo(new Movil("Nokia", "1100", "no funciona el whatsapp y el 4G"));
		
		return c;		
	}

	
}
