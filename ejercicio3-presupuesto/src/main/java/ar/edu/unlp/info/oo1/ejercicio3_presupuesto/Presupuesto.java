package ar.edu.unlp.info.oo1.ejercicio3_presupuesto;

import ar.edu.unlp.info.oo1.ejercicio3_presupuesto.Item;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {

	private LocalDate fecha;
	private String cliente;
    private List<Item> items;
    
    public Presupuesto(String cliente) {
    	this.fecha=LocalDate.now();
    	this.cliente=cliente;
        this.items=new ArrayList<Item>();
    }
    
    
	public LocalDate getFecha() {
		return this.fecha;
	
	}
	public String getCliente() {
		return this.cliente;
	}
	public void setFecha() {
		this.fecha = fecha;
	}
	
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	
	public Presupuesto cliente(String cliente) {
		this.setCliente(cliente);
		return this;
		}
	
	public double calcularTotal() {
		return this.items.stream()
				.mapToDouble(item -> item.costo())
				.sum();
	}
	public void agregarItem(Item item) {
		this.items.add(item);
	}
}
