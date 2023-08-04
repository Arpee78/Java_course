package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Crossword {

    public static void main(String[] args) {
        List<String> crowWords = Arrays.asList("KULCS", "KÁLYHA",
                "LÓ", "AJTÓ", "CSERESZNYEFA", "TEJ", "FELHŐ",
                "CIPŐ", "MOSODA", "KÁVÉTEJSZÍN", "CITERA", "BABA");

        for (String s : crowWords) {
            if (s.length() == 6) {
                System.out.println(s);
            }
        }

    }

}
