package ar.edu.unlp.info.oo1.PrimerRecuperatorio;

public class Orco extends Personaje{
	
	public Orco(String nombreP,double nivel, Habilidad habilidad,Rol rol) {
		super(nombreP,nivel,habilidad,rol);
	}

	public double valorIncrementado(boolean es) {
		if (!es) {
		return 1.60;
		}
		else return 1;
	}
	public boolean puedoAumentar() {
		return (this.nivel%3==0) ;
	}

}
