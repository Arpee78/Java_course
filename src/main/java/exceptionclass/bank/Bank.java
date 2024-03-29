package exceptionclass.bank;

import java.util.List;

public class Bank {

    private List<Account> accounts;

    public Bank(List<Account> accounts) {
        if (accounts == null) {
            throw new IllegalArgumentException("Account list should not be null!");
        }
        this.accounts = accounts;
    }

    public void payment(String accountNumber, double amount) {
        for (Account a : accounts) {
            if (a.getAccountNumber().equals(accountNumber)){
                a.subtract(amount);
                return;
            }
        }
        throw new InvalidAccountNumberBankOperationException("Invalid account number!");
    }

    public void deposit(String accountNumber, double amount){
        for (Account a : accounts) {
            if (a.getAccountNumber().equals(accountNumber)){
                a.deposit(amount);
                return;
            }
        }
        throw new InvalidAccountNumberBankOperationException("Invalid account number!");
    }
}
