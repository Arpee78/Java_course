package introexceptionreadfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Holiday {

    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        try {
            items = Files.readAllLines(Paths.get(("src/main/resources/holiday.txt")));

        } catch (IOException ioe){
            ioe.printStackTrace();
        }

        for (String actual: items ) {
            System.out.println(actual);
        }
    }
}
