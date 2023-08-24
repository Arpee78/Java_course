package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Operations {

    public List<String> readFile(String path) throws IOException {
        return Files.readAllLines(Paths.get(path));
    }

    public String getDailySchedule(List<String> numbers) {
        StringBuilder result = new StringBuilder();

        for (String actual : numbers) {
            if (actual.charAt(0) == '2') {
                result.append(actual + " ");
            }
        }

        return LocalDate.now() + ", " + result.toString();
    }

}
