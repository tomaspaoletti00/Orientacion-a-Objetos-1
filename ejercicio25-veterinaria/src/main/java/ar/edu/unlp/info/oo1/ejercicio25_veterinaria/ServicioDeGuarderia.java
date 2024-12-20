package ar.edu.unlp.info.oo1.ejercicio25_veterinaria;

import java.time.LocalDate;

public class ServicioDeGuarderia extends ServicioMedico{

	private int cantidadDias;

	public ServicioDeGuarderia(Mascota mascota,LocalDate fecha, int cantidadDias) {
		super(mascota,fecha);
		this.cantidadDias = cantidadDias;
	}
	
	public double calcularCosto() {
		double descuento=1;
		if (this.mascota.cantidadServicios()>=5) {
			descuento=0.90;
		}
		return (500*descuento);
	}
	
}
