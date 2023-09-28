package exam_sv2_part2_supsup.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Words {

    private List<String> words = new ArrayList<>();

    public List<String> getWords() {
        return new ArrayList<>(words);
    }

    public void addWords(String newWord, String... newWords) {
        words.add(newWord);
        words.addAll(Arrays.asList(newWords));
    }

    public List<String> findWordsOccursOnes() {
        List<String> result = new ArrayList<>();
        for (String actual : words) {
            int count = calculateCount(actual);
            if (count == 1) {
                result.add(actual);
            }
        }
        return result;

    }

    private int calculateCount(String actual) {
        int count = 0;
        for (String compared : words) {
            if (actual.equals(compared)) {
                count++;
            }
        }
        return count;
    }
}
