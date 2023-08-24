package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Neptun {

    public static void main(String[] args) {

        List<String> students = new ArrayList<>();
        try {
            students = new Neptun().readStudents("src/main/resources/neptun.csv");

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        for (String actual : students) {
            System.out.println(actual);
        }

    }

    private List<String> readStudents(String path) throws IOException {
        return Files.readAllLines(Paths.get(path));
    }


}
