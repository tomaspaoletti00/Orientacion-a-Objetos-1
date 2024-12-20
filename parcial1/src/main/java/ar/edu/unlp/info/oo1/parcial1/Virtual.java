package ar.edu.unlp.info.oo1.parcial1;

import java.time.LocalDate;

public class Virtual extends Evento{

	private double montoFijo;

	public Virtual(String nombreE, LocalDate fecha, String temaPrincipal, double precioInscripcion, double precioRemera,
			double montoFijo) {
		super(nombreE, fecha, temaPrincipal, precioInscripcion, precioRemera);
		this.montoFijo = montoFijo;
	}
	public LocalDate getFecha() {
		return this.fecha;
	}
	public double consultarPrecioAsistencia(LocalDate fechaConsulta){
		if (this.fecha.equals(fechaConsulta)) {
			this.precioInscripcion=this.precioInscripcion*1.20;
		}
		return (this.precioInscripcion+this.precioRemera+this.montoFijo);
		}
}
