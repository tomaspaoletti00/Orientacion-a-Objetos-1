package ar.edu.unlp.info.oo1.ejercicio25_veterinaria;

import java.time.LocalDate;
import java.time.Period;

public class Veterinario {

	private String nombreV;
	private LocalDate fechaIngreso;
	private double honorarioXatencion;
	public Veterinario(String nombreV, LocalDate fechaIngreso, double honorarioXatencion) {
		this.nombreV = nombreV;
		this.fechaIngreso = fechaIngreso;
		this.honorarioXatencion = honorarioXatencion;
	}
	

	public double getHonorarios() {
		return this.honorarioXatencion;
	}
	public LocalDate getFechaIngreso() {
		return this.fechaIngreso;
	}
	public int añosAntiguedad() {
		int años = Period.between(this.getFechaIngreso(), LocalDate.now()).getYears();
		return años;
	}
	public double calcularCostoConsulta() {
		return this.añosAntiguedad()*100;
	}
}
	

