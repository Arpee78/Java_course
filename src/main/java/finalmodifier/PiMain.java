package finalmodifier;

public class PiMain {

    public static void main(String[] args) {

        CylinderCalculator cylinderCalculator = new CylinderCalculator();
        System.out.println("A henger térfogata: " + cylinderCalculator.calculateVolume(45,5000));
        System.out.println("A henger felülete: " + cylinderCalculator.calculateSurfaceArea(45,5000));

        System.out.println();

        CylinderCalculatorBasedOnCircle cylinderCalculatorBasedOnCircle = new CylinderCalculatorBasedOnCircle();
        System.out.println("A henger térfogata: " + cylinderCalculatorBasedOnCircle.calculateVolume(45,5000));
        System.out.println("A henger felülete: " + cylinderCalculatorBasedOnCircle.calculateSurfaceArea(45,5000));
    }
}
