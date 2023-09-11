package interfacerules.bill;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Bill {

    public List<String> readBillItemsFromFile(Path path) {
        List<String> result = new ArrayList<>();
        try {
            result= Files.readAllLines(path);
        } catch (IOException e) {
            throw new IllegalArgumentException("Cannot read file: " + path, e);
        }
        return result;
    }
}
