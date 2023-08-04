package introcontrol;

import java.util.Scanner;

public class BoatRental {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Csoport létszáma? ");
        int group = scanner.nextInt();

        if (group <= 2) {
            System.out.println("Elvitték a Boat2 csónakot");
            System.out.println("Szabad a Boat3 és Boat5 csónak");
        }

        if (group == 3) {
            System.out.println("Elvitték a Boat3 csónakot");
            System.out.println("Szabad a Boat2 és Boat5 csónak");
            System.out.println("Még 7 fő mehet utánuk.");
        }

        if (group == 4 || group == 5) {
            System.out.println("Elvitték a boat5 csónakot.");
            System.out.println("Szabad a Boat2 és Boat3 csónak.");
            System.out.println("Még 5 fő mehet utánuk.");
        }

        if (group >= 6 && group <= 7) {
            System.out.println("Elvitték a Boat5 és Boat2 csónakot.");
            System.out.println("Szabad a Boat3 csónak.");
            System.out.println("Még 3 fő mehet utánuk.");
        }

        if (group == 8) {
            System.out.println("Elvitték a Boat5 és Boat3 csónakot.");
            System.out.println("Szabad a Boat2 csónak.");
            System.out.println("Még 2 fő mehet utánuk.");
        }

        if (group >= 9 && group <= 10) {
            System.out.println("Elvitték a mindegyik csónakot.");
            System.out.println("Senki nem várakozik a parton.");
        }

        if (group > 10) {
            System.out.println("Elvitték a mindegyik csónakot");
            System.out.println("A parton várakozik " + (group-10) + " személy.");
        }
    }

}
