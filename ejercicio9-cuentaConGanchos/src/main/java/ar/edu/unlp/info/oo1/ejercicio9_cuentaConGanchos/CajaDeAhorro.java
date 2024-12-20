package ar.edu.unlp.info.oo1.ejercicio9_cuentaConGanchos;

public class CajaDeAhorro extends Cuenta{

	public CajaDeAhorro() {
		super();
	}
	public CajaDeAhorro(double saldo) {
		super();		
	}
	public boolean puedeExtraer(double monto) {
		if ((this.getSaldo()-monto)>=0) {
			return true;
			} 
		else {
				return false;
				}
			}
	public void depositar (double monto) {
		super.depositar(monto-monto*0.02);
	}
	public boolean transferirACuenta(double monto, Cuenta cuentaDestino) {
		return super.transferirACuenta(monto-monto*0.02, cuentaDestino);
	}
	public boolean extraer(double monto) {
		return super.extraer(monto-monto*0.02);
	}
	
	}

