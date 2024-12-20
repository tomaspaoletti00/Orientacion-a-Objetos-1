package ar.edu.unlp.info.oo1.ejercicio25_veterinaria;

import java.time.LocalDate;

public abstract class ServicioMedico {
	
	protected Mascota mascota;
	protected LocalDate fecha;
	
	public ServicioMedico(Mascota mascota, LocalDate fecha) {
		this.mascota=mascota;
		this.fecha=fecha;
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	public double esDomingo(LocalDate fecha) {
		if (fecha.getDayOfWeek().getValue()== 7 ) {
			return 200;
	} else 
		return 0;
	}
	
	public abstract double calcularCosto();


}
