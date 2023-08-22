package introexceptionthrow;

import java.util.Scanner;

public class PositiveNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg egy pozitív számot: ");
        String number = scanner.nextLine();

        char[] numberArray = number.toCharArray();

        for (char c : numberArray) {
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException("Ez nem pozitív szám: " + number);
            }
        }

    }
}
