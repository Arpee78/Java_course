package exam_sv3_part2_supsup.algorithms;

import java.util.List;

public class Sentences {

    private static final String SENTENCE_ENDINGS = ".?!";

    public int countEndsWithSentenceEnding(List<String> sentences) {
        int count = 0;
        for (String s : sentences) {
            String lastChar = s.substring(s.length() - 1);
            if (SENTENCE_ENDINGS.contains(lastChar)) {
                count++;
            }
        }
        return count;
    }
}
