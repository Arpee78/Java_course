package exam_sv3_part2.algorithms;

import java.util.List;

public class Words {

    public int countWordsStartsWithUpperCase(List<String> words) {
        int sum = 0;
        for (String s : words) {
            if (Character.isUpperCase(s.charAt(0))) {
                sum++;
            }
        }
        return sum;
    }
}
