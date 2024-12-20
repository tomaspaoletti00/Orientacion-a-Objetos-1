package ar.edu.unlp.info.oo1.ejercicio14_intervaloDeTIempo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse {

	private LocalDate from;
	private LocalDate to;
	
	public DateLapse(LocalDate from, LocalDate to) {
        this.from = from;
        this.to = to;
    }
	
	public LocalDate getFrom() {
		return this.from;
	}
	public void setFrom() {
		this.from=from;
	}
	public LocalDate getTo() {
		return this.to;
	}
	public void setTo() {
		this.to=to;
	}
	
	public int sizeInDays() {
		return (int) ChronoUnit.DAYS.between(getFrom(), getTo());
		
	}
	public boolean includesDate(LocalDate other) {
		return other.isAfter(this.getFrom()) && other.isBefore(this.getTo());
	}
}
