package statements;

import java.util.Scanner;

public class TimeMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Egyik időpont, óra: ");
        int timeOneHours = scanner.nextInt();
        System.out.print("Egyik időpont, perc: ");
        int timeOneMinutes = scanner.nextInt();
        System.out.print("Egyik időpont, másodperc: ");
        int timeOneSeconds = scanner.nextInt();
        Time timeOne = new Time(timeOneHours, timeOneMinutes, timeOneSeconds);

        System.out.print("Másik időpont, óra: ");
        int timeTwoHours = scanner.nextInt();
        System.out.print("Másik időpont, perc: ");
        int timeTwoMinutes = scanner.nextInt();
        System.out.print("Másik időpont, másodperc: ");
        int timeTwoSeconds = scanner.nextInt();
        Time timeTwo = new Time(timeTwoHours, timeTwoMinutes, timeTwoSeconds);

        System.out.println("Az első időpont " + timeOne.toString() + " = " + timeOne.getInMinutes() + " perc");
        System.out.println("A második időpont " + timeTwo.toString() + " = " + timeTwo.getInSeconds() + " másodperc");

        System.out.println("Az első korábbi, mint a második: " + timeOne.earlierThan(timeTwo));

    }
}