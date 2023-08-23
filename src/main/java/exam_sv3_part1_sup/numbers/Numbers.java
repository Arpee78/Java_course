package exam_sv3_part1_sup.numbers;

import java.util.List;

public class Numbers {

    public int sumOfPositiveEvenNumbers(List<Integer> numbers) {
        int sum = 0;

        for (int actual : numbers) {
            if (actual > 0 && actual % 2 == 0) {
                sum += actual;
            }
        }

        return sum;
    }
}
