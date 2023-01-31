package classstructureattributes;

import java.util.Scanner;

public class Music {

    public static void main(String[] args) {
        Song song = new Song();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ki a kedvenc előadód?");
        song.band = scanner.nextLine();
        System.out.println("Mi tőle a kedvenc számod?");
        song.title = scanner.nextLine();
        System.out.println("Milyen hosszú ez a szám?");
        song.length = scanner.nextInt();

        System.out.println(song.band + " - " + song.title + " (" + song.length + " perc)");

    }
}
