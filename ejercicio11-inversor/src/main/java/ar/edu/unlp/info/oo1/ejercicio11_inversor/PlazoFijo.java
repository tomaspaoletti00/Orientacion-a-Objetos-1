package ar.edu.unlp.info.oo1.ejercicio11_inversor;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion{
	
	private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double porcentajeDeInteresDiario;

	public PlazoFijo(LocalDate fechaDeConstitucion,double montoDepositado, double porcentajeDeInteresDiario) {
		this.fechaDeConstitucion=fechaDeConstitucion;
		this.montoDepositado=montoDepositado;
		this.porcentajeDeInteresDiario=porcentajeDeInteresDiario;
	}
	 public LocalDate getFechaDeConstitucion() {
		 return this.fechaDeConstitucion;
	 }
	 public void setFechadeConstitucion() {
		 this.fechaDeConstitucion=fechaDeConstitucion;
	 }
	 public double getMontoDepositado() {
		 return this.montoDepositado;
	 }
	 public void setMontoDepositado() {
		 this.montoDepositado=montoDepositado;
	 }
	 public double getPorcentajeDeInteresDiario() {
		 return this.porcentajeDeInteresDiario;
	 }
	 public void setPorcentajeDeInteresDiario() {
		 this.porcentajeDeInteresDiario=porcentajeDeInteresDiario;
	 }
	 
	 public double valorActual() {
		 long dias = ChronoUnit.DAYS.between(this.getFechaDeConstitucion(), LocalDate.now());
		 return montoDepositado * Math.pow(1 + (porcentajeDeInteresDiario / 100), dias);
	 }
	 
}
