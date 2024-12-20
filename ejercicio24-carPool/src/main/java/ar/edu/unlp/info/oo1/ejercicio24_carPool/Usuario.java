package ar.edu.unlp.info.oo1.ejercicio24_carPool;

public abstract class Usuario {
    protected String nombre;
    protected double saldo;
    
    public Usuario(String nombre, double saldo) {
    	this.nombre=nombre;
    	this.saldo=saldo;
    }
    public abstract void cargarSaldo(double monto);
}
