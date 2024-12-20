package ar.edu.unlp.info.oo1.parcial1;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
public class Presencial extends Evento{

	private List<Sede> sedes;
	
	public Presencial(String nombreE, LocalDate fecha, String temaPrincipal, double precioInscripcion, double precioRemera,
			List<Sede> sedes) {
		super(nombreE, fecha, temaPrincipal, precioInscripcion, precioRemera);
		this.sedes= new ArrayList<Sede>();
		}
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public double getSumaPrecioTotales() {
		return sedes.stream()
				.mapToDouble(sedes -> sedes.getPrecioTotal())
				.sum();
				
	}
	public double consultarPrecioAsistencia(LocalDate fechaConsulta){
		if (this.fecha.equals(fechaConsulta)) {
			this.precioInscripcion=this.precioInscripcion*1.20;
		}
		return (this.precioInscripcion+this.precioRemera+this.getSumaPrecioTotales());
		}
	public String getNombreE() {
		return this.nombreE;
	}
	
}
