package ar.edu.unlp.info.oo1.parcial1;

import java.time.LocalDate;
import java.util.List;

public class Sede{

	public String nombreS;
	public double precioXdia;
	public int cantidadDias;
	
	public Sede(String nombreS, double precioXdia, int cantidadDias) {
		this.nombreS = nombreS;
		this.precioXdia = precioXdia;
		this.cantidadDias = cantidadDias;
	}
	
	public double getPrecioTotal() {
		return (this.precioXdia*this.cantidadDias);
	}
	
	}
	
	

