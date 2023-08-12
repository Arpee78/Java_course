package controladvanced.numbers;

import java.util.Scanner;

public class ForbiddenSevens {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Add meg a számot: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        for (int i = number; ; i++) {
            if (i % 7 == 0) {
                System.out.print("X ");
                continue;
            } else if (Integer.toString(i).contains("7")) {
                break;
            }
            System.out.print(i + " ");
        }
    }

}
