package exceptionclass.bank;

public class Account {

    private String accountNumber;
    private double balance;
    private double maxSubtract;

    public Account(String accountNumber, double balance) {
        if (accountNumber==null){
            throw new IllegalArgumentException("Account number should not be null!");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.maxSubtract = 100_000;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getMaxSubtract() {
        return maxSubtract;
    }

    public void setMaxSubtract(double maxSubtract) {
        checkSubtract(maxSubtract);
        this.maxSubtract = maxSubtract;
    }

    private void checkSubtract(double maxSubtract) {
        if (maxSubtract <0){
            throw new InvalidAmountBankOperationException("Invalid amount!");
        }
    }

    public void subtract(double value) {
        checkSubtract(value);
        balance -= value;
    }

    public void deposit(double value) {
        balance += value;
    }
}
