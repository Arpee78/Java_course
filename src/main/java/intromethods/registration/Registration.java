package intromethods.registration;

import java.time.LocalDate;
import java.util.Scanner;

public class Registration {

    public String getFullName(String firstName, String familyName) {
        return firstName + " " + familyName;
    }

    public LocalDate getBirthDate(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Add meg a vezetéknevet: ");
        String familyName = scanner.nextLine();

        System.out.print("Add meg a keresztnevet: ");
        String firstName = scanner.nextLine();

        System.out.print("Add meg a születési évet: ");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Add meg a születési hónapot: ");
        int monthOfBirth = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Add meg a születési napot: ");
        int dayOfBirth = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Add meg az emailcímet: ");
        String emailAddress = scanner.nextLine();

        Registration reg = new Registration();

        Person person = new Person(
                reg.getFullName(firstName, familyName),
                reg.getBirthDate(yearOfBirth, monthOfBirth, dayOfBirth),
                emailAddress);

        System.out.println(person);

    }
}
