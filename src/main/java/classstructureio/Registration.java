package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg a felhasználónevet:");
        String userName = scanner.nextLine();
        System.out.println("Add meg az emailcímet:");
        String email = scanner.nextLine();
        System.out.println("Username: " + userName + "  Email: "+ email);
    }
}
