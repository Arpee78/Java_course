package algorithmsdecision.words;

import java.util.List;

public class Word {

    public boolean containsLongerWord(List<String> words, String word) {
        int wordLength = word.length();

        for (String actual : words) {
            if (actual.length() > wordLength) {
                return true;
            }
        }
        return false;
    }
}
