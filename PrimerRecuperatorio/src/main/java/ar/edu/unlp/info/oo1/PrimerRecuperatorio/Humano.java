package ar.edu.unlp.info.oo1.PrimerRecuperatorio;

public class Humano extends Personaje {

	public Humano(String nombreP,double nivel, Habilidad habilidad,Rol rol) {
		super(nombreP,nivel,habilidad,rol);
	}
	
	public double valorIncrementado(boolean es) {
		if (es) {
		return 1.40;
		}
		else return 1;
	}
	public boolean puedoAumentar() {
		return (this.nivel==7) ;
	}
	
}
