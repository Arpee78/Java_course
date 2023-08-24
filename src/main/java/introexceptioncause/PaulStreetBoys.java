package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PaulStreetBoys {

    public static void main(String[] args) {
        PaulStreetBoys paulStreetBoys = new PaulStreetBoys();
        List<String> names = paulStreetBoys.readNames(Paths.get("src/main/resources/palutcaifiuk_.txt"));

        paulStreetBoys.printNames(names);
    }

    private List<String> readNames(Path path) {
        List<String> names = new ArrayList<>();

        try {
            names = Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read File", ioe);
        }

        return names;
    }

    private void printNames(List<String> names){
        for (String actual: names) {
            if ("Nemecsek Ernő".equals(actual)){
                System.out.println(actual.toUpperCase());
            } else{
                System.out.println(actual);
            }
        }
    }
}
