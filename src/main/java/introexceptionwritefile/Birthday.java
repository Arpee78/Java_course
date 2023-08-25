package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Birthday {

    public static void main(String[] args) {
        System.out.print("Hány családtag születésnapját akarod rögzíteni? ");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();

        List<String> birthDays = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            System.out.print((i + 1) + ". családtag neve: ");
            String name = scanner.nextLine();
            System.out.print("és születésnapja: ");
            String birthDay = scanner.nextLine();
            birthDays.add(name + " " + birthDay);
        }

        try{
            Files.write(Path.of("src/main/resources/birthdays.txt"), birthDays);
            System.out.println("Sikeres kiírás");
        } catch (IOException ioe){
            System.out.println("Sikertelen kiírás");
        }

    }
}
