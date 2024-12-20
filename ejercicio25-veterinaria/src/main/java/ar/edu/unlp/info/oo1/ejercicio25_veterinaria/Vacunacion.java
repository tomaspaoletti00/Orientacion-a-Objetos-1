package ar.edu.unlp.info.oo1.ejercicio25_veterinaria;

import java.time.LocalDate;

public class Vacunacion extends ServicioMedico{
	private Veterinario veterinario;
	private String nombreVac;
	private double costoVac;
	
	public Vacunacion(Mascota mascota, LocalDate fecha, Veterinario veterinario, String nombreVac, double costoVac) {
		super(mascota,fecha);
		this.veterinario = veterinario;
		this.nombreVac = nombreVac;
		this.costoVac = costoVac;
	}
	
	public double calcularCosto() {
		return (this.veterinario.getHonorarios()+500+this.esDomingo(this.fecha)+this.costoVac);
	}
	

}
