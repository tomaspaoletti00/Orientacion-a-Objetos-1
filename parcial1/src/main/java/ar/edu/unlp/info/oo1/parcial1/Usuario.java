package ar.edu.unlp.info.oo1.parcial1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Usuario {

	private String nombreU;
	private List<Entrada> entradasCompradas;
	
	public Usuario(String nombreU, List<Entrada> entradasCompradas) {
		this.nombreU = nombreU;
		this.entradasCompradas = new ArrayList<Entrada>();
	}
	

	public String getNombreU() {
		return this.nombreU;
	}
	public List<Entrada> getEntradasCompradas(){
		return this.entradasCompradas;
	}
	public void comprarEntrada(Evento eventoNuevo, boolean siTieneR) {
		Entrada nuevaEntrada= new Entrada(eventoNuevo,LocalDate.now(),siTieneR);
		entradasCompradas.add(nuevaEntrada);
	}
		
	public double montoTotalPorEntradas(LocalDate fechaI, LocalDate fechaF) {
		return entradasCompradas.stream()
				.filter(e -> e.getFechaCompra().isBefore(fechaF) && e.getFechaCompra().isAfter(fechaF))
				.mapToDouble(e -> e.getEvento().consultarPrecioAsistencia(e.getFechaCompra()))
				.sum();
                }
	public Entrada RetornarAsiguienteEvento() {
		return entradasCompradas.stream()
				.filter(e -> e.getEvento().getFecha().isAfter(LocalDate.now()))
				.min(Comparator.comparing(e -> e.getEvento().getFecha()))
				.orElse(null);
		}
	
}
