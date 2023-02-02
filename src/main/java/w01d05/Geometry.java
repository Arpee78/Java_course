package w01d05;

import java.util.Scanner;

public class Geometry {
    // Készíts egy w01d05.Geometry nevű osztályt melyben van egy main() metódus,
    // itt teszteled az elkészített téglalapokat reprezentáló osztályt!
    // Commitold és töltsd fel a megoldásodat a megfelelő módon (ex-w01d05 kezdetű üzenettel)!

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg a téglalap A oldalát");
        int sideA = scanner.nextInt();

        System.out.println("Add meg a téglalap B oldalát");
        int sideB = scanner.nextInt();

        Rectangle rectangle = new Rectangle(sideA, sideB);
        System.out.println("Területe: " + rectangle.calculateArea());
    }
}
