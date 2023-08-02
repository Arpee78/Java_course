package statements;

public class Investment {

    private double cost = 0.3;
    private int fund;
    private int interestRate;
    private boolean active;

    public Investment(int fund, int interestRate) {
        this.fund = fund;
        this.interestRate = interestRate;
        active = true;
    }

    public int getFund() {
        return fund;
    }

    public double getYield(int days) {
        return fund * interestRate / 100.0 * days / 365;
    }

    public double close(int days) {
        fund = active ? fund : 0;
        active = false;
        return (fund + getYield(days))*(1-cost/100);
    }
}
