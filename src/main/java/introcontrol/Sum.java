package introcontrol;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Add meg az "+ (i+1) +". számot: ");
            sum += scanner.nextInt();
        }

        System.out.println(sum);
    }
}
