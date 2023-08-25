package exam_sv3_part1_supsup.algorithms;

public class Algorithms {

    public int greatestCommonDivisor(int firstNumber, int secondNumber) {
        int maxDivisor = 1;
        int biggerNumber = firstNumber > secondNumber ? firstNumber : secondNumber;

        for (int i = 1; i < biggerNumber; i++) {
            if (firstNumber % i == 0 && secondNumber % i == 0) {
                maxDivisor = i;
            }
        }

        return maxDivisor;
    }

}
