package controlselection.accents;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WithoutAccentsTest {

    @Test
    void getWithoutAccent() {
        WithoutAccents withoutAccents = new WithoutAccents();

        assertEquals('a', withoutAccents.getWithoutAccent('á'));
        assertEquals('e', withoutAccents.getWithoutAccent('é'));
        assertEquals('u', withoutAccents.getWithoutAccent('ű'));
        assertEquals('U', withoutAccents.getWithoutAccent('Ű'));
        assertEquals('a', withoutAccents.getWithoutAccent('a'));
        assertEquals('g', withoutAccents.getWithoutAccent('g'));
        assertEquals('z', withoutAccents.getWithoutAccent('z'));
    }
}