package introexceptionreadfiletestjunit5;


import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class WordsTest {

    @Test
    void getFirstWordWithA() {
        String word = new Words().getFirstWordWithA(Path.of("src/test/resources/words.txt"));
        assertEquals("Anna", word);
    }

    @Test
    void getFirstWordWithAnoSuchWord() {
        String word = new Words().getFirstWordWithA(Path.of("src/test/resources/wordsWithOutA.txt"));
        assertEquals("A", word);
    }

    @Test
    void getFirstWordWithAfail() {
        IllegalStateException ise = assertThrows(IllegalStateException.class,
                () -> new Words().getFirstWordWithA(Path.of("src/test/resources/words_.txt")));
        System.out.println(ise.getMessage());
        assertEquals("Cannot read file: src\\test\\resources\\words_.txt", ise.getMessage());
    }

}