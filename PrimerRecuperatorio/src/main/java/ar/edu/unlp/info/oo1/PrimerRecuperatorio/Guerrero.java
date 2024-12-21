package ar.edu.unlp.info.oo1.PrimerRecuperatorio;

public class Guerrero implements Rol{

	public double obtenerValorBase(double nivel, Habilidad habilidad) {
		return (habilidad.getFuerza()*2) + habilidad.getInteligencia() + nivel;
	}
	
	public void aumentarHabilidad(Personaje p) {
		double nuevaFuerza=p.habilidad.getFuerza()+(p.getNivel()/6);
		p.aumentarInteligencia(nuevaFuerza); 
	}
}
