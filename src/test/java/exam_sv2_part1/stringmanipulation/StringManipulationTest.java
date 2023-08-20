package exam_sv2_part1.stringmanipulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulationTest {

    @Test
    void everyEvenCharacter() {
        StringManipulation sm = new StringManipulation();
        String result = sm.everyEvenCharacter("This is a String");
        assertEquals("Ti saSrn", result);
    }
}