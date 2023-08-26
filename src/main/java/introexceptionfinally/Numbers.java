package introexceptionfinally;

import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = 0;
        do {
            System.out.print("Adj meg egy számot! ");
            try {
                number = scanner.nextInt();
                scanner.nextLine();
            } catch (NumberFormatException nfe) {
                throw new IllegalArgumentException("Not a number", nfe);
            } finally {
                System.out.println("End of round.");
            }

        } while (number % 2 != 0);
    }
}
