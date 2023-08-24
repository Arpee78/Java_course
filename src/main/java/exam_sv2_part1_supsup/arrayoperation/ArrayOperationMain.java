package exam_sv2_part1_supsup.arrayoperation;

public class ArrayOperationMain {

    public static void main(String[] args) {
        ArrayOperation arrayOperation = new ArrayOperation();

        System.out.println(arrayOperation.getWordsBackwards(new String[]{"alma", "körte", "barack"})); // barack, körte, alma
    }
}
