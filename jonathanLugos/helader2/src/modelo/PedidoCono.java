package modelo;

public class PedidoCono extends Pedidos {
	private String cono;
	
	
	public String getCono() {
		return cono;
	}
	public void setCono(String cono) {
		this.cono = cono;
	}


	public PedidoCono(String gustos, String cantidad,String cono) {
		super(gustos, cantidad);
		this.cono=cono;
	}


	@Override
	public void Pedidolisto(String gustos, String cantidad) {
		
	}
	
	public String toString() {
		return "Pedidos= " +super.toString() + "PedidoCono [cono=" +cono+"]";
	}

}
