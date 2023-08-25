package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class RoadMap {

    public static void main(String[] args) {
        List<String> towns = Arrays.asList("Budapest", "Miskolc", "Debrecen");
        String path = "src/main/resources/roadmap.txt";
        try {
            Files.write(Path.of(path), towns);
            System.out.println("A fájl kiírásra került: " + path);
        } catch (IOException ioe) {
            System.out.println("A fájl kiírása sikertelen: " + path);
        }

    }
}
