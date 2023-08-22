package introexceptiontrycatchtrace;

import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem, adjon meg két számot. ");
        int number1 = 0;
        int number2 = 0;
        try {
            number1 = Integer.parseInt(scanner.nextLine());
            number2 = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException nfe) {
            System.out.println("Nem számot adot meg, ebből baj lehet");
        }

        System.out.print("Milyen műveletet végeznél rajtuk? " +
                "(Összeadás: +, Kivonás: -, Szorzás: *, Osztás: /)");
        String operator = scanner.nextLine();

        Calculator calculator = new Calculator();
        int result = 0;

        result = operator.equals("+") ? calculator.addNumbers(number1,number2) : result;
        result = operator.equals("-") ? calculator.subNumbers(number1,number2) : result;
        result = operator.equals("*") ? calculator.multiplyNumbers(number1,number2) : result;

        try {
            result = operator.equals("/") ? calculator.divideNumbers(number1,number2) : result;
        } catch (ArithmeticException ae) {
            System.out.println("Nem lehet nullával osztani");
        }

        System.out.println("Az eredmény: " + result);

    }

}
