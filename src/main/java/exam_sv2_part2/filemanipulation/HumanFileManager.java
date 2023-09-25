package exam_sv2_part2.filemanipulation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class HumanFileManager {

    private List<Human> humans = new ArrayList<>();

    public List<Human> getHumans() {
        return new ArrayList<>(humans);
    }

    public void readHumansFromFile(Path path) {
        try {
            processLines(Files.readAllLines(path));
        } catch (IOException ioe) {
            throw new IllegalStateException("Can't read file!", ioe);
        }
    }

    private void processLines(List<String> lines) {
        for (String s : lines) {
            String[] parts = s.split(";");
            humans.add(new Human(parts[0], parts[1]));
        }
    }

    public void writeMaleHumansToFile(Path path) {
        List<String> males = new ArrayList<>();
        for (Human h : humans) {
            char sex = h.getIdentityNumber().charAt(0);
            if (sex=='1' || sex=='3'){
                males.add(h.getName()+";"+h.getIdentityNumber());
            }
        }
        try {
            Files.write(path, males);
        } catch (IOException ioe){
            throw new IllegalStateException("Can't write file!", ioe);
        }

    }
}
