package aslist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Favourites {

    public static void main(String[] args) {

        List<String> favouriteThings = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ki a kedvenc színészed? ");
        favouriteThings.add(scanner.nextLine());

        System.out.print("Melyik a kedvenc filmed? ");
        favouriteThings.add(scanner.nextLine());

        System.out.print("Mi a kedvenc ételed? ");
        favouriteThings.add(scanner.nextLine());

        System.out.print("Kedvenceid száma: " + favouriteThings.size());
        System.out.println();
        System.out.print("Kedvenceid: " + favouriteThings);
    }
}
