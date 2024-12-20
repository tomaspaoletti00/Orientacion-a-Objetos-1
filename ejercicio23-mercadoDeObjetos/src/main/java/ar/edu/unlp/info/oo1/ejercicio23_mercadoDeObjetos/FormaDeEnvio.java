package ar.edu.unlp.info.oo1.ejercicio23_mercadoDeObjetos;

public abstract class FormaDeEnvio {

	protected Calculadora calculadora;
	public abstract double costoEnvio(String direccion, String direccion2);
	
}

class RetirarEnElComercio extends FormaDeEnvio{
	public double costoEnvio(String direccion, String direccion2) {
		return 0;
	}
}

class RetirarEnSucursal extends FormaDeEnvio{
	public double costoEnvio(String direccion, String direccion2) {
		return 3000;
	}
}

class ExpressADomicilio extends FormaDeEnvio{
	public double costoEnvio(String direccion, String direccion2) {
		return 0.5* calculadora.distanciaEntre(direccion, direccion2);
	}
}