package ar.edu.unlp.info.oo1.PrimerRecuperatorio;

public interface Rol {

	double obtenerValorBase(double nivel, Habilidad habilidad);
	void aumentarHabilidad(Personaje p);
}
