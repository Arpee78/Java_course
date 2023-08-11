package controlselection.consonant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToConsonantTest {

    @Test
    void getNextChar() {
        ToConsonant toConsonant = new ToConsonant();
        assertEquals('b', toConsonant.getNextChar('a'));
        assertEquals('B', toConsonant.getNextChar('A'));
        assertEquals('f', toConsonant.getNextChar('e'));
        assertEquals('j', toConsonant.getNextChar('i'));
        assertEquals('b', toConsonant.getNextChar('b'));
        assertEquals('g', toConsonant.getNextChar('g'));
        assertEquals('z', toConsonant.getNextChar('z'));
    }
}