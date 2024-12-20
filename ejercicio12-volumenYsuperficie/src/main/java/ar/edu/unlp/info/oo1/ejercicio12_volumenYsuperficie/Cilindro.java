package ar.edu.unlp.info.oo1.ejercicio12_volumenYsuperficie;

public class Cilindro extends Pieza{
	private int radio;
	private int altura;
	
	public int getRadio() {
		return radio;
	}
	public void setRadio(int radio) {
		this.radio = radio;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	@Override
	public double getVolumen() {
		return (Math.PI * Math.pow(this.getRadio(),2) * this.getAltura());
	}
	@Override
    public double getSuperficie() {
    	return (2*Math.PI*this.getRadio()*this.getAltura())+2*Math.PI*Math.pow(this.getRadio(), 2);
    }
}
