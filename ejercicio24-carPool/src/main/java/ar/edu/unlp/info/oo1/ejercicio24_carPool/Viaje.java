package ar.edu.unlp.info.oo1.ejercicio24_carPool;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Viaje {

	private String origen;
	private String destino;
	private double costoTotal;
	private Vehiculo vehiculo;
	private LocalDate fechaViaje;
	private List<Usuario> pasajeros;
	
	public Viaje(String origen, String destino, double costoTotal, Vehiculo vehiculo, LocalDate fechaViaje,
			List<Usuario> pasajeros) {
		this.origen = origen;
		this.destino = destino;
		this.costoTotal = costoTotal;
		this.vehiculo = vehiculo;
		this.fechaViaje = fechaViaje;
		this.pasajeros = new ArrayList<Usuario>();
	}
	
	public LocalDate getFechaViaje() {
		return this.fechaViaje;
	}
	
	public void registrarPasajero(Usuario nuevoPasajero) {
        long diferencia=(int) ChronoUnit.DAYS.between(LocalDate.now(), this.fechaViaje);
		if (this.pasajeros.size()>=this.vehiculo.getCapacidad() && (diferencia<=2) && (nuevoPasajero.saldo<0)) {
		      this.pasajeros.add(nuevoPasajero);
 	    }
    }
	public void procesarViaje() {
		double costoPorPersona= costoTotal/pasajeros.size();
		for (Usuario i: pasajeros ) {
			if (i instanceof Conductor ) {
				Conductor conductor=(Conductor) i;
				double descuentoConductor= costoPorPersona-(conductor.getVehiculo().getValorDeMercado()*0.01);
				i.saldo-= descuentoConductor;
				}
			else if (i instanceof Pasajero) {
				Pasajero pasajero=(Pasajero) i;
				double descuentoPasajero= costoPorPersona - 500;
				if(pasajero.getHizoUnViaje()) {
				i.saldo-= (costoPorPersona);}
				else 
					i.saldo-=costoPorPersona;
			}
		}
		
	}
	
	
}
		

