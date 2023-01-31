package classstructureattributes;

import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {

        Client client = new Client();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add meg a nevet:");
        client.name = scanner.nextLine();
        System.out.println("Add meg a születési évet:");
        client.year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Add meg a címet:");
        client.address = scanner.nextLine();

        System.out.println("Név: " + client.name);
        System.out.println("Év: " + client.year);
        System.out.println("Cím: " + client.address);

    }

}
