package ar.edu.unlp.info.oo1.ejercicio25_veterinaria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Mascota {

	private String nombreM;
	private LocalDate fechaNac;
	private String especie;
	List<ServicioMedico> servicios;
	
	public Mascota(String nombreM, LocalDate fechaNac, String especie) {
		this.nombreM = nombreM;
		this.fechaNac = fechaNac;
		this.especie = especie;
		this.servicios = new ArrayList<ServicioMedico>();
	}
	
	public String getNombreM() {
		return this.nombreM;
	}
	
	public int cantidadServicios() {
		return (int )this.servicios.stream()
				.count();
	}

	public ConsultaMedica darDeAltaConsultaMedica(Veterinario vet) {
		ConsultaMedica consultaNueva = new ConsultaMedica(this,LocalDate.now(),vet);
		this.servicios.add(consultaNueva);
		return consultaNueva;
		}
	public Vacunacion darDeAltaVacunacion(Veterinario vet, String nombreVacuna, double costoVacuna) {
		Vacunacion vacNueva = new Vacunacion(this,LocalDate.now(),vet,nombreVacuna,costoVacuna);
		this.servicios.add(vacNueva);
		return vacNueva;
	}
	public ServicioDeGuarderia darDeAltaGuarderia(int cantidadDias) {
		ServicioDeGuarderia guardNueva= new ServicioDeGuarderia(this,LocalDate.now(),cantidadDias);
		this.servicios.add(guardNueva);
		return guardNueva;
	}
	
	public double recaudacionPorFecha(LocalDate fechaDada) {
		return this.servicios.stream()
				.filter(s -> s.getFecha().equals(fechaDada))
				.mapToDouble(s -> s.calcularCosto())
				.sum();
	}
	
}

