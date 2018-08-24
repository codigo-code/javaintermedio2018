package modelo;

public class perro extends mamifero {
	private String raza;

	public perro(String nombre, double peso, double altura, int edad, String raza) {
		super(nombre, peso, altura, edad);
		this.raza=raza;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void comunicarse() {
		// TODO Auto-generated method stub

	}

	@Override
	public String dormir(double horas) {
		return "durmio"+horas+
		return null;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public String toString() {
		return "perro [raza=" + raza + ", getRaza()=" + getRaza() + ", getNombre()=" + getNombre() + ", getPeso()="
				+ getPeso() + ", getAltura()=" + getAltura() + ", getEdad()=" + getEdad() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	

}
