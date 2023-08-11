package controlselection.greetings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingsTest {

    @Test
    void sayGreeting() {
        Greetings greetings = new Greetings();
        assertEquals("jó reggelt", greetings.sayGreeting(5, 40));
        assertEquals("jó napot", greetings.sayGreeting(11, 20));
        assertEquals("jó estét", greetings.sayGreeting(19, 50));
        assertEquals("jó éjt", greetings.sayGreeting(1, 03));
    }
}