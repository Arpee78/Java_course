package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Poem {

    public static void main(String[] args) {
        List<String> poem = new ArrayList<>();
        try {
            poem = getPoem(Paths.get("src/main/resources/poem.txt"));
        } catch (IllegalStateException iae){
            iae.getCause().printStackTrace();
        }

        for (String actual : poem) {
            System.out.print(actual.charAt(0));
        }

        System.out.println("\n\nProgram vége");

    }

    private static List<String> getPoem(Path path) {
        List<String> poem;
        try {
            poem = Files.readAllLines(path);

        } catch (IOException ioe){
            throw new IllegalStateException("Can not read file", ioe);
        }
        return poem;
    }


}
