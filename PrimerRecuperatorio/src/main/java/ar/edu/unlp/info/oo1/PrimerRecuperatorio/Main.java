package ar.edu.unlp.info.oo1.PrimerRecuperatorio;

public class Main {

	public static void main(String[] args) {
		
		double nivelInicial=1;
		Habilidad inicialHumano= new Habilidad(2,1);
		Habilidad inicialOrco= new Habilidad(1,2);
		
		Mago mago= new Mago();
		Guerrero guerrero= new Guerrero();
		
		Personaje player1= new Humano("Tomas",nivelInicial,inicialHumano,mago);
		Personaje player2= new Orco("Augusto",nivelInicial,inicialOrco,guerrero);
		
		System.out.print("p1:"+player1.nombreP);
		System.out.print("vs");
		System.out.print("p2:"+player2.nombreP);
		
		player1.enfrentamiento(player2, 22);
		
		
		
		player1.cambiarRol(guerrero);
		
	
		
		player1.enfrentamiento(player2, 14);
		
		
		
		
	}

}
