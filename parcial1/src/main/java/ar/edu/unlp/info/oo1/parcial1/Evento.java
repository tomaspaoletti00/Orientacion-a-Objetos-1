package ar.edu.unlp.info.oo1.parcial1;

import java.time.LocalDate;

public abstract class Evento {
	protected String nombreE;
	protected LocalDate fecha;
	protected String temaPrincipal;
	protected double precioInscripcion;
	protected double precioRemera;
	
	public Evento(String nombreE, LocalDate fecha, String temaPrincipal, double precioInscripcion, double precioRemera) {
		this.nombreE=nombreE;
		this.fecha=fecha;
		this.temaPrincipal=temaPrincipal;
		this.precioInscripcion=precioInscripcion;
		this.precioRemera=precioRemera;
	}
	
	public abstract LocalDate getFecha();

	public abstract double consultarPrecioAsistencia(LocalDate fechaConsulta);
	
}
