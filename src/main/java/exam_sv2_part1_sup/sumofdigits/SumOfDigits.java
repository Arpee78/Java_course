package exam_sv2_part1_sup.sumofdigits;

public class SumOfDigits {

    int getSumOfDigits(int number) {
        int sum = 0;

        for (int i = number; Math.abs(i) != 0; i = i / 10) {
            sum += i % 10;
        }

        return sum;
    }
}
