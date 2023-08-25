package introexceptionwritefiletestjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.Assert.*;

public class ElectricityTest {

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void writeNames() throws IOException {
        Path path = temporaryFolder.newFile("maintenance.txt").toPath();
        List<String> lines = new Electricity().makeLines(new String[]{"Diófa", "Cseralja", "Mogyoró", "Harkály", "Malomkert"});
        Files.write(path, lines);
        List<String> expected = Files.readAllLines(path);
        assertEquals(expected,lines);
    }


}