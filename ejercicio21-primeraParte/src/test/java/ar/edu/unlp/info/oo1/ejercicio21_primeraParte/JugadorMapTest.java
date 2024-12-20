package ar.edu.unlp.info.oo1.ejercicio21_primeraParte;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Map;
import java.util.HashMap;

class JugadorMapTest {

    @Test
    void testJugadorMap() {
        // Crear el Map y agregar los jugadores con sus goles
        Map<Jugador, Integer> playersGoals = new HashMap<>();
        playersGoals.put(new Jugador("Messi", "Lionel"), 111);
        playersGoals.put(new Jugador("Batistuta", "Gabriel"), 56);
        playersGoals.put(new Jugador("Agüero", "Kun"), 42);

        // Eliminar la entrada con el jugador "Kun Agüero"
        playersGoals.remove(new Jugador("Agüero", "Kun"));
        assertFalse(playersGoals.containsKey(new Jugador("Agüero", "Kun")), "La clave 'Kun Agüero' debería haber sido eliminada.");

        // Actualizar los goles de "Lionel Messi" a 112
        playersGoals.put(new Jugador("Messi", "Lionel"), 112);
        assertEquals(112, playersGoals.get(new Jugador("Messi", "Lionel")), "Los goles de 'Lionel Messi' deberían ser 112.");

        // Intentar añadir nuevamente a "Gabriel Batistuta" con el mismo valor
        playersGoals.put(new Jugador("Batistuta", "Gabriel"), 56); // Sobrescribe si el valor cambia
        assertEquals(56, playersGoals.get(new Jugador("Batistuta", "Gabriel")), "Los goles de 'Gabriel Batistuta' deben ser 56.");

        // Sumar la cantidad total de goles
        int totalGoals = playersGoals.values().stream().mapToInt(Integer::intValue).sum();
        assertEquals(168, totalGoals, "La cantidad total de goles debería ser 168.");
    }
}
