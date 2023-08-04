package array;

public class ArrayHandler {

    public void addIndexToNumber(int[] source) {
        for (int i = 0; i < source.length; i++) {
            source[i] += i;
        }
    }

    public void concatenateIndexToWord(String[] source) {
        for (int i = 0; i < source.length; i++) {
            source[i] = i + "_" + source[i];
        }
    }

    public static void main(String[] args) {
        ArrayHandler arrayHandler = new ArrayHandler();

        int[] indexNumber = {10, 20, 30};
        arrayHandler.addIndexToNumber(indexNumber);

        String[] indexWord = {"Kutya", "Macska", "Egér"};
        arrayHandler.concatenateIndexToWord(indexWord);

        for (int i: indexNumber) {
            System.out.println(i);
        }

        for (String i: indexWord) {
            System.out.println(i);
        }

        for (int i: indexNumber) {
            System.out.print(i + ", ");
        }

        System.out.println();

        for (String i: indexWord) {
            System.out.print(i + ", ");
        }

    }


}
