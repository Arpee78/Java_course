package controliteration.fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A Fibonacci sorozat hány elemét akarod látni? ");
        int number = scanner.nextInt();

        int[] fib = new int[number + 2];
        fib[1] = 1;
        for (int i = 0; i < fib.length - 2; i++) {
            System.out.print(fib[i] + " ");
            fib[i + 2] = fib[i] + fib[i + 1];
        }

        int count = number;
        for (int i = 0, j = 1, k = 1; count > 0; count--) {
            System.out.print(i + " ");
            i = j;
            j = k;
            k = j + i;
        }

        System.out.println();
        count = number;
        int first = 0;
        int second = 1;
        int third = 1;
        while (count > 0) {
            System.out.print(first + " ");
            first = second;
            second = third;
            third = first + second;
            count--;
        }
    }

}
