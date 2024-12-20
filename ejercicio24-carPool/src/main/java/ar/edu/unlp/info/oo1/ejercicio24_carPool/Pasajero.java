package ar.edu.unlp.info.oo1.ejercicio24_carPool;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pasajero extends Usuario {

	private boolean hizoUnVIaje;
	private Viaje ultimoViaje;
	
        public Pasajero(String nombre, double saldo, Viaje ultimoViaje) {
		super(nombre, saldo);
		this.ultimoViaje = ultimoViaje;
	}

        public boolean getHizoUnViaje() {
        	return this.hizoUnVIaje;
        }
    

	@Override
	public void cargarSaldo(double monto) {
		long  diferencia= (int) ChronoUnit.DAYS.between(this.ultimoViaje.getFechaViaje(), LocalDate.now());
		if (diferencia<=30) {
		this.saldo+= (monto*0.90);
		}
	}
	
}
