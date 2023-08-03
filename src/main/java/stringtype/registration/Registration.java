package stringtype.registration;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Add meg a felhasználói nevet: ");
        String userName = scanner.nextLine();

        System.out.print("Add meg a jelszót: ");
        String password1 = scanner.nextLine();

        System.out.print("Add meg mégegyszer jelszót: ");
        String password2 = scanner.nextLine();

        System.out.print("Add meg az emailcímet: ");
        String email = scanner.nextLine();

        UserValidator userValidator = new UserValidator();

        System.out.println("A felhasználó név " + (userValidator.isValidUserName(userName) ? "helyes" : "NEM helyes"));
        System.out.println("A jelszó " + (userValidator.isValidPassword(password1, password2) ? " helyes" : "NEM helyes"));
        System.out.println("Az email " + (userValidator.isValidEmail(email) ? "helyes" : "NEM helyes"));
    }
}
