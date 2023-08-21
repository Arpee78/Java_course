package introexceptionfirstexception;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Név: ");
        String name = scanner.nextLine();

        System.out.print("Film címe: ");
        String movieTitle = scanner.nextLine();

        System.out.print("Hány jegyet kérsz: ");
        int ticketCount = Integer.parseInt(scanner.nextLine());

        System.out.print("Melyik sorba: ");
        String row = scanner.nextLine();

        System.out.println("A mozijegy.hu rendszerben vásárolt jegyek adatai a következők:");
        System.out.println("Vásárló neve: " + name);
        System.out.println("Film címe: " + movieTitle);

        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (int i = 1; i <= ticketCount; i++) {
            if (first) {
                first = false;
            } else {
                sb.append(", ");
            }
            sb.append(row + ". sor " + i + ". szék");
        }
        System.out.println("Lefoglalt helyek: " + sb);

        System.out.println("Jó szórakozást!");

    }
}
