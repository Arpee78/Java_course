package methodparam.sums;

public class Sums {

    private double sumPositives;
    private double sumNegatives;

    public Sums(double sumPositives, double sumNegatives) {
        this.sumPositives = sumPositives;
        this.sumNegatives = sumNegatives;
    }

    public double getSumPositives() {
        return sumPositives;
    }

    public double getSumNegatives() {
        return sumNegatives;
    }

    public void addNumber(double number) {
        if (number > 0) {
            sumPositives += number;
        } else {
            sumNegatives += number;
        }
    }


}
