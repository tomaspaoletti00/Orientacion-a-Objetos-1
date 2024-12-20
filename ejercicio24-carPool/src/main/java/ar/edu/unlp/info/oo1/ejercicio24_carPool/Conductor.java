package ar.edu.unlp.info.oo1.ejercicio24_carPool;

import java.time.LocalDate;

public class Conductor extends Usuario{

	private Vehiculo vehiculo;
	
	public Conductor(String nombre, double saldo,Vehiculo vehiculo) {
		super(nombre,saldo);
		this.vehiculo=vehiculo;
	}
	@Override
	public void cargarSaldo(double monto) {
		int añoActual= LocalDate.now().getYear();
		int diferencia= añoActual - this.vehiculo.getAñoFabricacion();
		if (diferencia<5) {
		this.saldo+= (monto*0.99);
		}
		else this.saldo+= (monto*0.90);
	}
	
	public Vehiculo getVehiculo() {
		return this.vehiculo;
	}
	}

