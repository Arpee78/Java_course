package exam_sv2_part2_sup.algorithms;

import java.util.ArrayList;
import java.util.List;

public class Sentences {

    public static final String ENDING_MARKS = ".?!";
    private List<String> sentences = new ArrayList<>();

    public List<String> getSentences() {
        return new ArrayList<>(sentences);
    }

    public void addSentence(String sentence) {
        if ( checkStartsWithCapital(sentence) && checkEndsWithMark(sentence)){
            sentences.add(sentence);
        }
    }

    private boolean checkStartsWithCapital(String sentence) {
        if (Character.isUpperCase(sentence.charAt(0))) {
            return true;
        }
        throw new IllegalArgumentException("Sentence must start with capital!");
    }

    private boolean checkEndsWithMark(String sentence) {
        if (ENDING_MARKS.contains(Character.toString(sentence.charAt(sentence.length() - 1)))) {
            return true;
        }
        throw new IllegalArgumentException("Sentence must end with ending mark!");
    }

    public String findLongestSentence() {
        if (sentences.isEmpty()) {
            throw new IllegalStateException("List is empty!");
        }
        String longest = sentences.get(0);
        for (String s : sentences) {
            if (s.length() > longest.length()) {
                longest = s;
            }
        }
        return longest;
    }
}
