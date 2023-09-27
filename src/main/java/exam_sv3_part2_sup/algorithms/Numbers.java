package exam_sv3_part2_sup.algorithms;

import java.util.List;

public class Numbers {

    public boolean isPairInListWithSumOf(List<Integer> numbers, int value) {

        for (int i = 0; i < numbers.size() - 1; i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(i) + numbers.get(j) == value) {
                    return true;
                }
            }
        }
        return false;
    }
}
