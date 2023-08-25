package introexceptionwritefiletestjunit4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Electricity {

    public static void main(String[] args) {
        String[] streets = {"Diófa", "Cseralja", "Mogyoró", "Harkály", "Malomkert"};

        Electricity electricity = new Electricity();
        List<String> lines = electricity.makeLines(streets);
        electricity.writeStreets(Path.of("src/main/resources/maintenance.txt"), lines);
    }

    public List<String> makeLines(String[] streets) {
        List<String> lines = new ArrayList<>();
        for (int i = 0; i < streets.length; i++) {
            lines.add(LocalDate.now() + " " + streets[i]);
        }
        return lines;
    }

    public void writeStreets(Path path, List<String> lines) {
        try {
            Files.write(path, lines);
            System.out.println("Sikeres kiírás");
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot write file", ioe);
        }
    }

}
