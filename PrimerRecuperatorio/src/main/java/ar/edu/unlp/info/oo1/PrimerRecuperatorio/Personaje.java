package ar.edu.unlp.info.oo1.PrimerRecuperatorio;

import java.util.List;
import java.util.stream.Collectors;

public abstract class Personaje {

	protected String nombreP;
	protected double nivel;
	protected Habilidad habilidad;
	protected Rol rol;
	
	public Personaje(String nombreP, double nivel, Habilidad habilidad,Rol rol) {
		this.nombreP=nombreP;
		this.nivel=nivel;
		this.habilidad=habilidad;
		this.rol=rol;
		}
	
	public void cambiarRol(Rol nuevoRol) {
		this.rol=nuevoRol;
		System.out.print(this.nombreP+"Cambio de Rol");
	}

	public double getNivel() {
		return this.nivel;
	}
	public boolean esDeDia(double hora) {
		if (hora>8 && hora<20) {
			return true;
		} 
		else return false;
	}
	
	public void aumentarInteligencia(double intelN) {
		this.habilidad.setInteligencia(intelN);
	}
	public void aumentarFuerza(double fuerzaN) {
		this.habilidad.setInteligencia(fuerzaN);
	}
	
	public abstract boolean puedoAumentar();
	public void subirNivel() {
		this.nivel++;
		if (puedoAumentar()) {
			rol.aumentarHabilidad(this);
		}
	}

	public abstract double valorIncrementado(boolean es);
	
	public  double determinarPA(double hora) {
		return rol.obtenerValorBase(this.nivel,this.habilidad)*valorIncrementado(this.esDeDia(hora));
	}
	
	public void enfrentamiento(Personaje rival, int hora) {
		if (this.determinarPA(hora)>rival.determinarPA(hora)) {
			this.subirNivel();
			System.out.println(this.nombreP + " ganó el enfrentamiento contra " + rival.nombreP);
		} else if (this.determinarPA(hora)<rival.determinarPA(hora)) {
			rival.subirNivel();
			System.out.println(rival.nombreP + " ganó el enfrentamiento contra " + this.nombreP);} 
		    else {
			  this.subirNivel();
			  rival.subirNivel();
			  System.out.println("El enfrentamiento entre " + this.nombreP + " y " + rival.nombreP + " terminó en empate. Ambos subieron de nivel.");}
	}
	public boolean diferencia(double a) {
		double dif=Math.abs(a-this.nivel);
		if (dif<=2) {
			return true;
		} else return false;
	}
	public List<Personaje> personajesSimilares(List<Personaje> personajes){
		int hora=12;
		return personajes.stream()
				.filter(p->(p.getNivel()==this.nivel && p.determinarPA(hora)<5) || diferencia(p.getNivel()))
				.collect(Collectors.toList());
	}
	
}
