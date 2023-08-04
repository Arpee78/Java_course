package arrayofarrays;

public class Rectangle {

    public int[][] rectangularMatrix(int size){

        int[][] rectangle = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                rectangle[i][j] = i;
            }
        }
        return rectangle;
    }

    public static void main(String[] args) {
        int[][] rectangle = new Rectangle().rectangularMatrix(4);
        new ArrayOfArrays().printArrayOfArrays(rectangle);
    }
}
