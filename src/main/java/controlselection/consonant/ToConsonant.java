package controlselection.consonant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToConsonant {

    public char getNextChar(char c) {
        boolean vowel = "aeiou".indexOf(Character.toLowerCase(c)) > -1;
        if (vowel) {
            return (char) (c + 1);
        } else {
            return c;
        }

    }

}
