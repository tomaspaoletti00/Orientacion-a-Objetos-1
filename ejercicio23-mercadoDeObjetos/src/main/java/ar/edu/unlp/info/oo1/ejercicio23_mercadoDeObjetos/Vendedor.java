package ar.edu.unlp.info.oo1.ejercicio23_mercadoDeObjetos;

import java.util.ArrayList;
import java.util.List;

public class Vendedor {

	private String nombreV;
	private String direccion;
	private List<Producto> productos;
	public Vendedor(String nombreV, String direccion, List<Producto> productos) {
		this.nombreV = nombreV;
		this.direccion = direccion;
		this.productos = new ArrayList<Producto>();
	}
	
	
}
