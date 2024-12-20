package ar.edu.unlp.info.oo1.ejercicio5_figurasYcuerpos;

public class Circulo implements Figura{

	private double diametro;
	private double radio;
	private double perimetro;
	private double area;
	
	
	
	
	
	public double getDiametro() {
		return this.getRadio()*2;
	}
	public void setDiametro(double valor) {
		this.setRadio(valor/2);
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public double getPerimetro() {
		 return (Math.PI * this.getDiametro());
	}
	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
	public double getArea() {
		return (Math.PI * (Math.pow(this.getRadio(), 2)));
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	
	
	
	
}
