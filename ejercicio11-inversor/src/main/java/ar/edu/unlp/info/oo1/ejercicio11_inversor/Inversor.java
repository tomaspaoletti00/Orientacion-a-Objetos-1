package ar.edu.unlp.info.oo1.ejercicio11_inversor;

import java.util.List;
import java.util.stream.Collectors;

public class Inversor{

	private String nombre;
	List <Inversion> inversiones;
	
	public Inversor(String nombre, List<Inversion> inversiones) {
		this.nombre=nombre;
		this.inversiones=inversiones;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre() {
		this.nombre=nombre;
	}
	public List<Inversion> getInversiones(){
		return this.inversiones;
	}
	
	
	public double valorActual(){
		inversiones.stream()
        .mapToDouble(Inversion::valorActual)
        .sum();
	}
	
}
