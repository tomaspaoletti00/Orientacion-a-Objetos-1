package ar.edu.unlp.info.oo1.ejercicio5_figurasYcuerpos;

public class Cuadrado implements Figura {

	private double lado;
	
	public double getLado() {
		return this.lado;
	}
	public void setLado(int i) {
		this.lado= lado;
	}
	public double getPerimetro() {
		return this.getLado()*4;
	}
	
	public double getArea() {
		return this.getLado()*this.getLado();
	}
	
	
}
