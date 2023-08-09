package numbers;

import java.util.Scanner;

public class MathOperations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Mi ezen egyenlet megoldása? 4+2*(3+5/2)+0.3=? ");
        double solution = scanner.nextDouble();
        double mySolution = 4 + 2 * (3 + 5.0 / 2) + 0.3;
        System.out.println("A helyes megoldás: " + mySolution);
        System.out.println(Math.abs(mySolution - solution) < 0.0001 ? "A megoldásod helyes!" : "A megoldásod helytelen");
    }
}
