package ar.edu.unlp.info.oo1.parcial1;

import java.time.LocalDate;
import java.time.Period;

public class Entrada {

	private Evento evento;
	private LocalDate fechaCompra;
	private boolean reembolso;
	
	public Entrada(Evento evento, LocalDate fechaCompra, boolean reembolso) {
		this.evento = evento;
		this.fechaCompra = fechaCompra;
		this.reembolso = reembolso;
	}
	
	public LocalDate getFechaCompra() {
		return this.fechaCompra;
	}
	public Evento getEvento() {
		return this.evento;
	}
	public double calcularMontoArecuperar() {
		double montoArecuperar=0;
		double precioAsistencia=evento.consultarPrecioAsistencia(fechaCompra);
		int dias= Period.between(this.fechaCompra, evento.getFecha()).getDays();
		if (this.reembolso==true) {
			montoArecuperar+=precioAsistencia*0.15;
		}
		if (dias>=30) {
			montoArecuperar+=precioAsistencia*0.5;
			}
		return montoArecuperar;
	}
	
}
