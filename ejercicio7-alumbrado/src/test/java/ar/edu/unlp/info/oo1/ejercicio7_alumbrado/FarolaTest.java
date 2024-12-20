package ar.edu.unlp.info.oo1.ejercicio7_alumbrado;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FarolaTest {
    private Farola farolaUno;
    private Farola farolaDos;

    @BeforeEach
    void setUp() throws Exception {
        this.farolaUno = new Farola();
        this.farolaDos = new Farola();
    }

    @Test
    void testConstructor() {
        assertFalse(farolaUno.isOn(), "La farolaUno debe estar apagada al inicio.");
        assertTrue(farolaUno.isOff(), "La farolaUno debe estar apagada al inicio.");
        assertTrue(farolaUno.getNeighbors().isEmpty(), "La farolaUno no debería tener vecinos.");
    }

    @Test
    void testPairWithNeighbor() {
        farolaUno.pairWithNeighbour(farolaDos);
        assertTrue(farolaUno.getNeighbors().contains(farolaDos), "farolaUno debería tener a farolaDos como vecino.");
        assertTrue(farolaDos.getNeighbors().contains(farolaUno), "farolaDos debería tener a farolaUno como vecino.");
    }

    @Test
    void testTurnOnAndOff() {
        farolaUno.pairWithNeighbour(farolaDos);
        farolaUno.turnOn();
        assertTrue(farolaUno.isOn(), "La farolaUno debe estar encendida.");
        assertTrue(farolaDos.isOn(), "La farolaDos debe estar encendida.");

        farolaUno.turnOff();
        assertFalse(farolaUno.isOn(), "La farolaUno debe estar apagada.");
        assertFalse(farolaDos.isOn(), "La farolaDos debe estar apagada.");

        farolaDos.turnOn();
        assertTrue(farolaUno.isOn(), "La farolaUno debe estar encendida.");
        assertTrue(farolaDos.isOn(), "La farolaDos debe estar encendida.");

        farolaDos.turnOff();
        assertFalse(farolaUno.isOn(), "La farolaUno debe estar apagada.");
        assertFalse(farolaDos.isOn(), "La farolaDos debe estar apagada.");
    }
}
