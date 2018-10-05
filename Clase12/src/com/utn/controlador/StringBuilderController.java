package com.utn.controlador;

public class StringBuilderController {

//	public void invertirUnaCadena(String palabra) {
//
//		// neuquen
//
//		char[] vecString = palabra.toCharArray();
//
//		int indexVec = vecString.length;
//		char[] nuevaPalabra = new char[indexVec];
//		for (int i = indexVec - 1; i >= 0; i--) {
//			nuevaPalabra[i] = vecString[i];
//		}
//
//		// convierte el char[] vector de char en un string
//		String resultado = String.valueOf(nuevaPalabra);
//
//		if (palabra.equals(resultado)) {
//			System.out.println("son iguales");
//		} else {
//			System.out.println("No son iguales");
//		}
//
//	}

	public StringBuilder doyVultaConBuilder(StringBuilder palabra) {
		return palabra.reverse();
	}
}
