package primitivetypes.exam;

import java.time.LocalDate;
import java.util.Scanner;

public class ExamRegistration {

    public static void main(String[] args) {
        System.out.println("Add meg a jelentekzási adataid.");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Név: ");
        String name = scanner.nextLine();

        System.out.print("Születési év: ");
        int yearOfBirth = Integer.parseInt(scanner.nextLine());
        System.out.print("Születési hónap száma: ");
        int monthOfBirth = Integer.parseInt(scanner.nextLine());
        System.out.print("Születési nap: ");
        int dayOfBirth = Integer.parseInt(scanner.nextLine());
        LocalDate dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);

        System.out.print("Irányítószám: ");
        int zipcode = Integer.parseInt(scanner.nextLine());

        System.out.print("Érdemjegy átlag: ");
        double average = Double.parseDouble(scanner.nextLine());

        Exam exam = new Exam();
        exam.addPerson(new Person(name, dateOfBirth, zipcode, average));

        System.out.println(exam.getPersons());
    }
}
