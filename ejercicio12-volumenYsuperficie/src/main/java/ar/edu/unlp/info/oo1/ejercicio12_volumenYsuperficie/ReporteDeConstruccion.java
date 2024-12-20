package ar.edu.unlp.info.oo1.ejercicio12_volumenYsuperficie;

import java.util.List;
import java.util.ArrayList;

public class ReporteDeConstruccion  {

	private List<Pieza> piezas;
	
	public ReporteDeConstruccion(List<Pieza> piezas) {
		this.piezas=piezas;
		}
	
	public void agregarPieza(Pieza pieza) {
		this.piezas.add(pieza);
	}
	public double volumenDeMaterial(String material) {
		return this.piezas
				.stream()
				.filter(pieza ->pieza.getMaterial().equals(material))
				.mapToDouble(pieza -> pieza.getVolumen())
				.sum();
	}
	
	public double superficieDeColor(String color) {
		return this.piezas
				.stream()
				.filter(pieza ->pieza.getColor().equals(color))
				.mapToDouble(pieza -> pieza.getSuperficie())
				.sum();
		
	}
}
