package arrayofarrays;

public class ArrayOfArrays {

    public void printArrayOfArrays(int[][] a) {
        for (int[] outer : a) {
            for (int inner : outer) {
                System.out.print(inner + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new ArrayOfArrays().printArrayOfArrays(new int[][]{{0, 1, 2}, {0, 1, 2}, {0, 1, 2}, {0, 1, 2}});
    }
}
