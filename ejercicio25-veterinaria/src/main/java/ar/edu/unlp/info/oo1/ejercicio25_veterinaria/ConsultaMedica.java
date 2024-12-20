package ar.edu.unlp.info.oo1.ejercicio25_veterinaria;

import java.time.LocalDate;

public class ConsultaMedica extends ServicioMedico{

	private Veterinario veterinario;
	
	public ConsultaMedica(Mascota mascota, LocalDate fecha, Veterinario veterinario) {
		super(mascota,fecha);
		this.veterinario=veterinario;
		
	}
	
	public double calcularCosto() {
		return (this.veterinario.getHonorarios()+300+this.esDomingo(this.fecha)+(this.veterinario.calcularCostoConsulta()));
	}


}
