package ar.edu.unlp.info.oo1.ejercicio23_mercadoDeObjetos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cliente {
	
	private String nombreC;
	private String direccion;
	private List<Pedido> pedidos;
	
	public Cliente(String nombreC, String direccion, List<Pedido> pedidos) {
		this.nombreC = nombreC;
		this.direccion = direccion;
		this.pedidos = pedidos;
	}
	public String getDireccion() {
		return this.direccion;
	}
	public void crearPedido(FormaDePago pago, FormaDeEnvio envio, Producto prod, int cantidad) {
		if(prod.verificarStock(cantidad)) {
		  prod.descontarStock(cantidad);
		  Pedido pedidoNuevo = new Pedido(this,pago,envio,prod,cantidad);
		  this.pedidos.add(pedidoNuevo);
		}
	}
	
	public int cantidadPorCategoria(String categoria) {
		return this.pedidos.stream()
		            .filter(p -> p.getProducto().getCategoria().equals(categoria))
		            .mapToInt(p -> p.getCantidadPedida())
		            .sum();
	}

}
	
	

