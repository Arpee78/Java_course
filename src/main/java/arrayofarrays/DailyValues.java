package arrayofarrays;

public class DailyValues {

    public int[][] getValues() {
        int[][] year = new int[12][];
        int[] dayPerMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 0; i <year.length; i++) {
            year[i] = new int[dayPerMonth[i]];
        }
        return year;
    }

    public static void main(String[] args) {
        int[][] year = new DailyValues().getValues();
        new ArrayOfArrays().printArrayOfArrays(year);
    }
}
