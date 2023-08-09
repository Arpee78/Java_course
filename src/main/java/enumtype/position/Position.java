package enumtype.position;

public enum Position {
    CEO(1000,"Nyaralás bahamákon"), COO(800,"Síelés ausztriában"),
    CFO(700,"Szolgálati kocsi"), CMO(650,"Ingyen menza");

    private final int salary;
    private final String benefit;

    Position(int salary, String benefit) {
        this.salary = salary;
        this.benefit = benefit;
    }

    public int getSalary() {
        return salary;
    }

    public String getBenefit() {
        return benefit;
    }
}
