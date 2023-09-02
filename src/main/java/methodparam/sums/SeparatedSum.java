package methodparam.sums;

import looptypes.Sum;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SeparatedSum {

    public Sums sum(String floatingNumbers) {
        return loadNumbers(floatingNumbers);

    }

    public String readFromFile() {
        Path path = Path.of("src/main/resources/floatingnumbers.txt");
        try {
            return Files.readAllLines(path).get(0);
        } catch (IOException e) {
            throw new IllegalArgumentException("Cannot read file: " + path, e);
        }
    }

    private Sums loadNumbers(String string) {
        Sums sums=new Sums(0,0);
        String[] numbers = string.split(";");
        for (String s : numbers) {
            double number = Double.parseDouble(s.replaceAll(",","."));
            sums.addNumber(number);
        }
        return sums;
    }
}
