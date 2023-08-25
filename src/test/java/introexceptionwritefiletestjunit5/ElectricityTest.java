package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ElectricityTest {

    @TempDir
    File tempFolder;

    @Test
    void run() throws IOException {
        Path path = tempFolder.toPath().resolve("maintenanceJ5.txt");
        Electricity electricity = new Electricity();
        String[] streets = {"Diófa", "Cseralja", "Mogyoró", "Harkály", "Malomkert"};
        electricity.run(path, streets);
        List<String> result = Files.readAllLines(path);
        assertEquals(LocalDate.now() + ": " + streets[0] + " utca", result.get(0));
        assertEquals(LocalDate.now() + ": " + streets[1] + " utca", result.get(1));
        assertEquals(LocalDate.now() + ": " + streets[2] + " utca", result.get(2));
        assertEquals(LocalDate.now() + ": " + streets[3] + " utca", result.get(3));
        assertEquals(LocalDate.now() + ": " + streets[4] + " utca", result.get(4));
    }
}