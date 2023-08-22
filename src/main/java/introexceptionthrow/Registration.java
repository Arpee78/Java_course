package introexceptionthrow;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        System.out.println("Üdvözöljük a regisztrációnál!");

        Scanner scanner = new Scanner(System.in);
        Validation validation = new Validation();
        boolean success = true;

        System.out.print("Kérlek add meg a neved: ");
        String name = scanner.nextLine();
        try {
            validation.validateName(name);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
            success = false;
        }

        System.out.print("Kérlek add meg az életkorod: ");
        String age = scanner.nextLine();
        try {
            validation.validateAge(age);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
            success = false;
        }

        System.out.println();
        System.out.println("A megadott név: " + name);
        System.out.println("A megadott életkor: " + age);

        System.out.println();
        if (success) {
            System.out.println("Sikeres regisztráció");
        } else {
            System.out.println("Sikertelen regisztráció");
        }
    }
}
