package introcontrol;

import java.util.Scanner;

public class BoatRental2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Csoport létszáma? ");
        int group = scanner.nextInt();

        int freeBoats = 3;
        int freePlace = 10;

        if (group>3){
            System.out.println("Elviszik az ötfős csónakot");
            group -= 5;
            freeBoats--;
            freePlace -= 5;
        }

        if (group>2){
            System.out.println("Elviszik a háromfős csónakot");
            group -= 3;
            freeBoats--;
            freePlace -= 3;
        }

        if (group>0){
            System.out.println("Elviszik a kétfős csónakot");
            group -= 2;
            freeBoats--;
            freePlace -= 2;
        }

        if (group > 0) {
            System.out.println("Sajnos nem fért el mindenki a hajókban.");
        } else {
            System.out.println("Üres helyek száma: " + freePlace);
            System.out.println("Üres csónakok száma: " + freeBoats);
        }


    }
}
