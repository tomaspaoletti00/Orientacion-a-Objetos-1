package ar.edu.unlp.info.oo1.ejercicio5_figurasYcuerpos;

public class Cuerpo3D {

	private double altura;
	private Figura caraBasal;
	private double volumen;
	private double superficieExterior;
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getVolumen() {
		return (this.getCaraBasal().getArea() * this.getAltura());
	}	
	public double getSuperficieExterior() {
		return (2 * this.getCaraBasal().getArea() + this.getCaraBasal().getPerimetro() * this.getAltura());
	}
	public Figura getCaraBasal(){
		return caraBasal;
		}
	public void setCaraBasal(Figura caraBasal) {
		this.caraBasal=caraBasal;
	}
	
	
}
