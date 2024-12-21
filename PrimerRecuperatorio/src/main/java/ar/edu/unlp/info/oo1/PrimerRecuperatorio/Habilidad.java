package ar.edu.unlp.info.oo1.PrimerRecuperatorio;

public class Habilidad {

	private double fuerza;
	private double inteligencia;
	
	public Habilidad(double Fuerza, double Inteligencia) {
		this.fuerza=fuerza;
		this.inteligencia=inteligencia;
	}

	public double getFuerza() {
		return fuerza;
	}

	public void setFuerza(double fuerza) {
		this.fuerza = fuerza;
	}

	public double getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(double inteligencia) {
		this.inteligencia = inteligencia;
	}
	
	
}
