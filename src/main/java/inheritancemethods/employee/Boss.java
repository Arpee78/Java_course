package inheritancemethods.employee;

public class Boss extends Employee {

    private static final double LEADERSHIP_FACTOR = 0.1;
    private int numberOfEmployees;

    public Boss(String name, String address, double salary, int numberOfEmployees) {
        super(name, address, salary);
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + baseSalary * numberOfEmployees * LEADERSHIP_FACTOR;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }
}
