package introexceptionreadfiletestjunit4;

import org.junit.Test;


import java.nio.file.Path;

import static org.junit.Assert.*;

public class WordsTest {

    @Test
    public void getFirstWordWithA() {
        String word = new Words().getFirstWordWithA(Path.of("src/test/resources/words.txt"));
        assertEquals("Anna",word);
    }

    @Test
    public void getFirstWordWithAnoSuchWord() {
        String word = new Words().getFirstWordWithA(Path.of("src/test/resources/wordsWithOutA.txt"));
        assertEquals("A",word);
    }
}