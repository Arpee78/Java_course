package introdate;

import java.util.Scanner;

public class EmployeeTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Add meg az alkalmazott nevét: ");
        String name = scanner.nextLine();

        System.out.print("Add meg az alkalmazott születési évét: ");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Add meg az alkalmazott születési hónapját: ");
        int monthOfBirth = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Add meg az alkalmazott születési napját: ");
        int dayOfBirth = scanner.nextInt();
        scanner.nextLine();

        Employee employee = new Employee(yearOfBirth, monthOfBirth, dayOfBirth, name);

        System.out.println("Alkalmazott neve: " + employee.getName());
        System.out.println("Alkalmazott születési dátuma: " + employee.getDateOfBirth());
        System.out.println("Munkaviszony kezdete: " + employee.getBeginEmployment());


    }
}
