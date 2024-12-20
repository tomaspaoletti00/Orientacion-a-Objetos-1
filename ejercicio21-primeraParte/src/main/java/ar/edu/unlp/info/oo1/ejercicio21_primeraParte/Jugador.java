package ar.edu.unlp.info.oo1.ejercicio21_primeraParte;
import java.util.Objects;

public class Jugador {
	private String nombre;
	private String apellido;
	
	public Jugador(String nombre, String apellido) {
		this.nombre=nombre;
		this.apellido=apellido;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre() {
		this.nombre=nombre;
	}
	public String getApellido() {
		return this.apellido;
	}
	public void setApellido() {
		this.apellido=apellido;
	}
   @Override
    public boolean equals(Object o) {
		if (this == o) return true;
		if ((o==null) || (getClass() != o.getClass())) return false;
		Jugador jugador=(Jugador)o;
		return apellido.equals(jugador.apellido) && nombre.equals(jugador.nombre);
	}
   @Override
	public int hashCode(){
		return Objects.hash(apellido,nombre);
		}
	@Override
	public String toString() {
		return nombre+" "+apellido;
	}
}
