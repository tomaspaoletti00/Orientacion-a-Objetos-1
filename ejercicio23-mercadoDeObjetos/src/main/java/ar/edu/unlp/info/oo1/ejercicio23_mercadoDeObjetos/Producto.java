package ar.edu.unlp.info.oo1.ejercicio23_mercadoDeObjetos;

public class Producto {

	private String nombreP;
	private String categoria;
	private double precio;
	private int stock;
	
	public Producto(String nombreP, String categoria, double precio, int stock) {
		this.nombreP = nombreP;
		this.categoria = categoria;
		this.precio = precio;
		this.stock = stock;
	}
	public double getPrecio() {
		return this.precio;
	}
	public String getCategoria() {
		return this.categoria;
	}
	
	public int getStock() {
		return this.stock;
	}
	
	public boolean verificarStock(int cant) {
		if(this.stock-cant >= 0) {
			return true;
		}else 
			return false;
	}
	
	public void descontarStock(int cantidad) {
		this.stock-=cantidad;
		
	}
}
