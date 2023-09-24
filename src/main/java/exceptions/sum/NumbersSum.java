package exceptions.sum;

public class NumbersSum {

    public int getSum(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Parameter should not be null!");
        }
        int sum = 0;
        for (int n : numbers) {
            sum+=n;
        }

        return sum;
    }

    public int getSum(String[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Parameter should not be null!");
        }
        int sum = 0;
        try {
            for (String s : numbers) {
                sum+=Integer.parseInt(s);
            }
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException("Illegal numbers!");
        }
        return sum;
    }
}
