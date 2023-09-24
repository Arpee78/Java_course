package exceptions.measurement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Measurement {

    public List<String> readFromFile(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file.", e);
        }
    }

    public List<String> validate(List<String> lines) {
        List<String> result = new ArrayList<>();
        for (String s : lines) {
            if (!validateLine(s)) {
                result.add(s);
            }
        }

        return result;
    }

    private boolean validateLine(String s) {
        try {
            String[] parts = s.split(",");
            boolean isThreeValue = parts.length == 3;
            boolean validSerialNumber = validateSerialNumber(parts[0]);
            boolean validValue = validateValue(parts[1]);
            boolean validName = validateName(parts[2]);
            return isThreeValue && validSerialNumber && validValue && validName;
        } catch (IndexOutOfBoundsException e) {
            return false;
        }
    }

    private boolean validateName(String name) {
        return name.split(" ").length >= 2;
    }

    private boolean validateValue(String value) {
        try {
            Double.parseDouble(value);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    private boolean validateSerialNumber(String serialNumber) {
        try {
            Integer.parseInt(serialNumber);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

}
