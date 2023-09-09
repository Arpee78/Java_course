package abstractclass.exercise;

public class MathLesson {

    public static void main(String[] args) {
        Adder adder = new Adder();
        Subtracter subtracter = new Subtracter();
        Multiplier multiplier = new Multiplier();
        Divisor divisor = new Divisor();

        System.out.println(adder.getSolution(10,5));
        System.out.println(subtracter.getSolution(10,5));
        System.out.println(multiplier.getSolution(10,5));
        System.out.println(divisor.getSolution(10,5));
    }
}
