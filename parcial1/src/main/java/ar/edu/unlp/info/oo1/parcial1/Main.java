package ar.edu.unlp.info.oo1.parcial1;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Sede sede1 = new Sede("Alpha",100,12);
		Sede sede2 = new Sede("Beta",120,7);
		 
		Presencial eventoPresencial = new Presencial("El gran Evento", LocalDate.of(2024, 07, 12),
				"Musica",1000,50, Arrays.asList(sede1,sede2));
	
	Usuario usuario = new Usuario("Juan Perez", new ArrayList<>());
	
	usuario.comprarEntrada(eventoPresencial, true);
	
	Entrada entradaComprada = usuario.getEntradasCompradas().get(0);

	double montoArecuperar = entradaComprada.calcularMontoArecuperar();
	
	System.out.println("Usuario: " + usuario.getNombreU());
    System.out.println("Evento: " + eventoPresencial.getNombreE());
    System.out.println("Monto a recuperar: $" + montoArecuperar);

	
	
	}
	
	
}
