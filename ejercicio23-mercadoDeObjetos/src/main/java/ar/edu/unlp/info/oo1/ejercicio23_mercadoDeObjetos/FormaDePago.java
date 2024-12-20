package ar.edu.unlp.info.oo1.ejercicio23_mercadoDeObjetos;

public abstract class FormaDePago {

	public abstract double costoPago(double precioBase);
	
}



class AlContado extends FormaDePago{
	public double costoPago(double precioBase) {
		return precioBase;
	}
}

class SeisCuotas extends FormaDePago{
	public double costoPago(double precioBase) {
		return precioBase * 1.20;
	}
	
}