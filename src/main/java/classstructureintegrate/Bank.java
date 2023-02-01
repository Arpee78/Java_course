package classstructureintegrate;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg a bankszámla számát.");
        String accountnumber = scanner.nextLine();
        System.out.println("Add meg a bankszámla tulajdonosát.");
        String owner = scanner.nextLine();
        System.out.println("Add meg a bankszámla kezdő egyenlegét.");
        int initialBalance = scanner.nextInt();

        BankAccount bankAccount = new BankAccount(accountnumber, owner, initialBalance);
        System.out.println(bankAccount.getInfo());

        bankAccount.deposit(100);
        System.out.println(bankAccount.getInfo());

        bankAccount.withdraw(200);
        System.out.println(bankAccount.getInfo());

    }
}
