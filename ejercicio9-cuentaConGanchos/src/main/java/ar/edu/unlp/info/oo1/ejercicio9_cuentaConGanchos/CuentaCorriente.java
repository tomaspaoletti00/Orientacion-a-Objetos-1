package ar.edu.unlp.info.oo1.ejercicio9_cuentaConGanchos;

public class CuentaCorriente extends Cuenta{
	private double descubierto;
	
	public CuentaCorriente() {
		super();
	}
	public CuentaCorriente(double saldo) {
		super();
	}
	
	public double getDescubierto() {
		return this.descubierto;
	}
	
	public void setDescubierto() {
		this.descubierto=descubierto;
	}
	public boolean puedeExtraer(double monto) {
		if ((getSaldo()-monto)>=(getDescubierto()*(-1))){
			return true;
		} else {
			return false;
		}
		
		
	}
}
