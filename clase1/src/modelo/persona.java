package modelo;


//Persona extiende de la clase mamifero
public class persona extends mamifero{
	
	
	private String nacionalidad;
	//contructor de la clase persona

	public persona(String nombre, double peso, double altura, int edad, String nacionalidad) {
		
		//invoca al constructor de la clase mamifero
		super(nombre, peso, altura, edad);
		
		this.nacionalidad=nacionalidad;
		// TODO Auto-generated constructor stub
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	@Override
	public void comunicarse() {
		System.out.println("hola soy una persona");
		
	}

	@Override
	public String dormir(double horas) {
		if(horas>10)
		{
			return "durmio aceptablemente";
			else if (horas >=5 && horas <=9)
			{
				return "durmio masomenos";
				
			}
			else 
			{
				System.out.println("durmio para el orto");
			}
			return null;
		}
	}

	@Override
	public String toString() {
		return "persona [nacionalidad=" + nacionalidad + ", getNacionalidad()=" + getNacionalidad() + ", getNombre()="
				+ getNombre() + ", getPeso()=" + getPeso() + ", getAltura()=" + getAltura() + ", getEdad()=" + getEdad()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	

}
