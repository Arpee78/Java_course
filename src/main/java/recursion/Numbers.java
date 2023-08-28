package recursion;

import java.util.Arrays;

public class Numbers {

    public int getSum(int[] numbers) {

        int length = numbers.length;

        if (length > 1) {
            return numbers[0] + getSum(Arrays.copyOfRange(numbers, 1, length));
        }

        if (length == 1) {
            return numbers[0];
        }

        return 0;

    }
}
