package algorithmscount;

public class Digits {

    public int getCountOfNumbers() {
        int count = 0;

        for (int i = 10; i < 100; i++) {
            int number1 = i % 10;
            int number10 = i / 10;
            if (number10 + 5 == number1 || number10 - 5 == number1) {
                count++;
            }
        }
        return count;
    }

}
