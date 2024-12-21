package ar.edu.unlp.info.oo1.PrimerRecuperatorio;

public class Mago implements Rol{

	public double obtenerValorBase(double nivel, Habilidad habilidad) {
		return (nivel + habilidad.getInteligencia())*2;
	}
	
	public void aumentarHabilidad(Personaje p) {
		double nuevaIntel=p.habilidad.getInteligencia()+(p.getNivel()*(3/2));
		p.aumentarInteligencia(nuevaIntel); 
	}
	
}
