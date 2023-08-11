package controliteration.division;

import java.util.Scanner;

public class Division {

    public void getDivisors() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Adjon meg egy pozitív egész számot! A program ennél kisebb számokat fog kiíírni. ");
        int number = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Hánnyal osztható számokat szeretne kapni? ");
        int divisor = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i < number; i++) {
            if (i % divisor == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        int count =1;
        while (count<35){
            if (count % divisor == 0) {
                System.out.print(count + " ");
            }
            count++;
        }

    }

    public static void main(String[] args) {
        Division division = new Division();
        division.getDivisors();
    }
}
