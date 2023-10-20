package collectionsmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassTrip {

    private Map<String, Integer> inpayments = new HashMap<>();

    public Map<String, Integer> getInpayments() {
        return new HashMap<>(inpayments);
    }

    public void loadInpayments(Path path) {
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                processLine(line);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.", ioe);
        } catch (NumberFormatException nfe){
            throw new IllegalStateException("Wrong number format", nfe);
        }
    }

    public void processLine(String line) throws NumberFormatException{
        String[] parts = line.split(":");
        String name = parts[0];
        int value = Integer.parseInt(parts[1].strip());
        inpayments.put(name, value);
    }
}
