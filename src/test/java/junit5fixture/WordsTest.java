package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordsTest {

    Words words;

    @BeforeEach
    void setUp() {
        words = new Words();
        words.addWord("egy");
        words.addWord("kettő");
        words.addWord("három");
        words.addWord("négy");
        words.addWord("öt");
        words.addWord("hat");
        words.addWord("hét");
        words.addWord("nyolc");
        words.addWord("kilenc");
    }

    @Test
    void removeWordsWithoutLetter() {
        Words wordsWOe = new Words();
        wordsWOe.addWord("három");
        wordsWOe.addWord("négy");
        wordsWOe.addWord("öt");
        wordsWOe.addWord("hat");
        wordsWOe.addWord("hét");
        wordsWOe.addWord("nyolc");
        words.removeWordsWithoutLetter("e");
        assertEquals(wordsWOe.getWords(), words.getWords());
    }

    @Test
    void removeWordsWithOtherLength() {
        List<String> expected = Arrays.asList("kettő", "három", "nyolc");
        words.removeWordsWithOtherLength(5);
        assertEquals(expected, words.getWords());
    }
}