package finalmodifier;

import static finalmodifier.CircleCalculator.PI;

public class CylinderCalculator {


    public double calculateVolume(double r, double h) {
        double area = r * r * PI;
        return area * h;
    }

    public double calculateSurfaceArea(double r, double h) {
        double area = r * r * PI;
        double perimeter = 2 * r * PI;
        return area * 2 + perimeter * h;
    }
}
