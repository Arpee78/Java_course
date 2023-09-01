package methodstructure.bmi;

public class BodyMass {

    private final double lowerLimit = 18.5;
    private final double upperLimit = 25.0;

    private double weight;
    private double height;

    public BodyMass(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double getBodyMassIndex() {
        return weight / (height * height);
    }

    public BmiCategory getBody() {
        double bmi = getBodyMassIndex();
        if (bmi < lowerLimit) {
            return BmiCategory.UNDERWEIGHT;
        }
        if (bmi > upperLimit) {
            return BmiCategory.OVERWEIGHT;
        }
        return BmiCategory.NORMAL;
    }

    public boolean isThinnerThan(BodyMass other) {
        return getBodyMassIndex() < other.getBodyMassIndex();
    }

}
