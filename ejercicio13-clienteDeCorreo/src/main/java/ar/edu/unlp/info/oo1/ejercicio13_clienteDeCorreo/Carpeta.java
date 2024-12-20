package ar.edu.unlp.info.oo1.ejercicio13_clienteDeCorreo;

import java.util.List;

public class Carpeta {

	private String nombre;
	private List<Email> emails;
	
	public Carpeta(String nombre) {
		this.nombre=nombre;
		this.emails=new ArrayList<Email>();
		}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void agregarCorreo(Email email) {
		this.emails.add(email);
	}
	public Email buscar (String texto) {
		return this.emails
				.stream()
				.filter(email -> email.contiene(texto))
				.findFirst().orElse(null);
	}
	public void removerCorreo(Email email) {
		this.emails.remove(email);
	}
	public void mover(Email email, Carpeta destino) {
		this.emails.remove(email);
		destino.emails.add(email);
	}
	public double espacioOcupado() {
		return this.emails
				.stream()
				.mapToDouble(email -> email.espacioOcupado())
				.sum();
	}
}
