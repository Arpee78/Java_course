package finalmodifier;

public class CylinderCalculatorBasedOnCircle {

    public double calculateVolume(double r, double h) {
        double area = new CircleCalculator().calculateArea(r);
        return area * h;
    }

    public double calculateSurfaceArea(double r, double h) {
        double area = new CircleCalculator().calculateArea(r);
        double perimeter = new CircleCalculator().calculatePerimeter(r);
        return area * 2 + perimeter * h;
    }
}
