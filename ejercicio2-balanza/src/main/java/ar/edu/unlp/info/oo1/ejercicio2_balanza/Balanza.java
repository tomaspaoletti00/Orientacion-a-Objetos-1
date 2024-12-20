package ar.edu.unlp.info.oo1.ejercicio2_balanza;

import java.util.ArrayList;
import java.util.List;

public class Balanza {

	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	private List<Producto> productos;
	
	public int getCantidadDeProductos() {
		return this.productos.size();
	}
	public double getPrecioTotal() {
		return this.productos.stream().mapToDouble(producto -> producto.getPrecio()).sum();
	}

	public double getPesoTotal() {
		return this.productos.stream().mapToDouble(producto -> producto.getPeso()).sum();
	}
	
	public void ponerEnCero() {
		this.productos.clear();
	}
	
	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}
	
	public Balanza() {
		this.productos= new ArrayList<Producto>();
	}
	public List<Producto> getProductos() {
		return this.productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	public Ticket emitirTicket () {
		return new Ticket(this.getCantidadDeProductos(), this.getPesoTotal(), this.getPrecioTotal(),this.getProductos());

	}
}

