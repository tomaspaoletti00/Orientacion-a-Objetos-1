package ar.edu.unlp.info.oo1.ejercicio23_mercadoDeObjetos;

public class Pedido {

	private Cliente cliente;
	private FormaDePago fpago;
	private FormaDeEnvio fenvio;
	private Producto producto;
	private int cantidadPedida;
	
	public Pedido(Cliente cliente, FormaDePago fpago, FormaDeEnvio fenvio, Producto producto, int cantidadPedida) {
		this.cliente = cliente;
		this.fpago = fpago;
		this.fenvio = fenvio;
		this.producto = producto;
		this.cantidadPedida = cantidadPedida;
	}
	public int getCantidadPedida() {
		return this.cantidadPedida;
	}
	public Producto getProducto() {
		return this.producto;
	}
	
	public double costoTotal() {
		return this.fpago.costoPago(this.producto.getPrecio()) + this.fenvio.costoEnvio("Despacho", this.cliente.getDireccion());
	}
	
}
