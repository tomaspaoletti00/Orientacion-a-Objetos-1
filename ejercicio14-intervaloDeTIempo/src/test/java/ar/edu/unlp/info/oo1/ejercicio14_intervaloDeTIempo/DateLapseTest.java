package ar.edu.unlp.info.oo1.ejercicio14_intervaloDeTIempo;
import ar.edu.unlp.info.oo1.ejercicio14_intervaloDeTIempo.*;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DateLapseTest {

	@Test
	void testSizeInDaysSameDay() {
		LocalDate date= LocalDate.of(2023, 11, 1);
		DateLapse dateLapse= new DateLapse(date,date);
		assertEquals(0,dateLapse.sizeInDays());
	}
	@Test
	void testSizeInDaysPositiveInterval() {
		LocalDate from= LocalDate.of(2023, 11, 1);
		LocalDate to= LocalDate.of(2023, 11, 6);
		DateLapse dateLapse= new DateLapse(from,to);
		assertEquals(5,dateLapse.sizeInDays());
	}
	
	 @Test
	    void testIncludesDateInsideRange() {
	        LocalDate from = LocalDate.of(2023, 11, 1);
	        LocalDate to = LocalDate.of(2023, 11, 6);
	        LocalDate insideDate = LocalDate.of(2023, 11, 3);
	        DateLapse dateLapse = new DateLapse(from, to);
	        assertTrue(dateLapse.includesDate(insideDate), "Una fecha dentro del rango debería estar incluida");
	    }
}
