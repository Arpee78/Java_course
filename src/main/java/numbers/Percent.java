package numbers;

public class Percent {

    public static void main(String[] args) {
        Percent percent = new Percent();
        System.out.println(percent.getValue(110, 28));
        System.out.println(percent.getBase(30, 30));
        System.out.println(percent.getPercent(30, 35));
    }

    public double getValue(int numberA, int numberB) {
        return numberA * numberB / 100.0;
    }

    public double getBase(int numberA, int numberB) {
        return numberA / (numberB / 100.0);
    }

    public double getPercent(int numberA, int numberB) {
        return numberB * 100.0 / numberA;
    }
}
