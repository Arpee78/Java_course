package classstructureio;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adj meg egy egész számot: ");
        int number1 = scanner.nextInt();
        System.out.print("Adj meg még egy egész számot: ");
        int number2 = scanner.nextInt();
        System.out.println(number1 + " + " + number2);
        System.out.println(number1 + number2);
    }
}
