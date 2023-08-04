package arrays;

import java.util.Arrays;

public class ArraysMain {

    public String numberOfDaysAsString() {
        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return Arrays.toString(numberOfDays);
    }

    public String multiplicationTableAsString(int size) {
        int[][] multiplication = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                multiplication[i][j] = (i + 1) * (j + 1);
            }
        }
        return Arrays.deepToString(multiplication);
    }

    public boolean sameTempValues(double[] day, double[] anotherDay) {
        return Arrays.equals(day, anotherDay);
    }

    public boolean sameTempValuesDaylight(double[] day, double[] anotherDay) {
        int minLength = min(day.length, anotherDay.length);
        return Arrays.equals(Arrays.copyOfRange(day,0,minLength), Arrays.copyOfRange(anotherDay,0,minLength));
    }

    private int min(int a, int b) {
        return a < b ? a : b;
    }

    public boolean wonLottery(int[] a, int[] b){
        int[] aCopy = Arrays.copyOf(a, a.length);
        int[] bCopy = Arrays.copyOf(b, b.length);
        Arrays.sort(aCopy);
        Arrays.sort(bCopy);
        return Arrays.equals(aCopy, bCopy);
    }

    public static void main(String[] args) {
        ArraysMain arraysMain = new ArraysMain();
        System.out.println(arraysMain.numberOfDaysAsString());
        System.out.println(arraysMain.multiplicationTableAsString(4));
        System.out.println(arraysMain.sameTempValues(new double[]{19.3, 19, 20.5}, new double[]{19.3, 19, 20.5}));
        System.out.println(arraysMain.sameTempValuesDaylight(new double[]{19.3, 19, 20.5}, new double[]{19.3, 19}));
        System.out.println(arraysMain.wonLottery(new int[] {1,2,6,3,5,6}, new int[] {8,2,3,4,5,6}));
    }

}
