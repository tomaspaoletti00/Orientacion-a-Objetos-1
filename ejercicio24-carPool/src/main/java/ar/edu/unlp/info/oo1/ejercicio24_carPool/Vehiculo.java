package ar.edu.unlp.info.oo1.ejercicio24_carPool;

public class Vehiculo {

	private Conductor conductor;
	private String descripcion;
	private int capacidad;
	private int añoFabricacion;
	private double valorDeMercado;
	
	public Vehiculo(Conductor conductor, String descripcion, int capacidad, int añoFabricacion, double valorDeMercado) {
		this.conductor = conductor;
		this.descripcion = descripcion;
		this.capacidad = capacidad;
		this.añoFabricacion = añoFabricacion;
		this.valorDeMercado = valorDeMercado;
	}
	public int getCapacidad() {
	    return this.capacidad;
	}
	public int getAñoFabricacion() {
		return this.añoFabricacion;
	}
	public double getValorDeMercado() {
		return this.valorDeMercado;
	}
}
