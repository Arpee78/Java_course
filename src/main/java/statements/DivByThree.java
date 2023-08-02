package statements;

import java.util.Scanner;

public class DivByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Adj meg egy egész számot: ");
        int number = scanner.nextInt();

        System.out.println(number%3 == 0 ? "A szám osztható hárommal" :  "A szám NEM osztható hárommal" );

    }
}
