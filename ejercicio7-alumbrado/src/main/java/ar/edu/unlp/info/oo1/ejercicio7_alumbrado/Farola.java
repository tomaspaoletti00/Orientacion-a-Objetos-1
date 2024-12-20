package ar.edu.unlp.info.oo1.ejercicio7_alumbrado;

import java.util.ArrayList;
import java.util.List;

public class Farola {
	
	private boolean on;
	private List<Farola> neighbors;
	
	public Farola() {
		this.on=false;
		this.neighbors= new ArrayList<Farola>();
			}
	public boolean isOn() {
		return this.on;
	}
	public boolean isOff() {
		return !this.isOn();
	}
    public void pairWithNeighbour(Farola otraFarola) {
		if(!this.neighbors.contains(otraFarola)) {
			this.neighbors.add(otraFarola);
			otraFarola.pairWithNeighbour(this);
			}
	}
	
	public List<Farola> getNeighbors(){
		return this.neighbors;
	}
	
	public void turnOn() {
		if(!this.isOn()) {
			this.on=true;
			this.getNeighbors().forEach(i ->i.turnOn());
		}
	}
	public void turnOff() {
		if(this.isOn()) {
			this.on=false;
					this.getNeighbors().forEach(i ->i.turnOff());
		}
	}



	
}
