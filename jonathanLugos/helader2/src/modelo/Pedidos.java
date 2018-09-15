package modelo;

public abstract class Pedidos {
	private String gustos;
	private String cantidad;
	
			
	

	public String getGustos() {
		return gustos;
	}

	public void setGustos(String gustos) {
		this.gustos = gustos;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public Pedidos(String gustos, String cantidad) {
		this.gustos = gustos;
		this.cantidad = cantidad;
		
	}

	
public abstract void Pedidolisto(String gustos, String cantidad);
	
	public String toString() {
		return "Pedidos[gustos=" + gustos+ ", cantidad=" + cantidad+"]";		
}
	}
