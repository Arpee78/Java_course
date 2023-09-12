package interfacedefaultmethods.longword;

import java.nio.file.Path;
import java.util.List;

public class LongWord implements FileOperations{

    private Path path;

    public LongWord(Path path) {
        this.path = path;
    }

    @Override
    public List<String> readFromFile(Path pathActual) {
        return FileOperations.super.readFromFile(pathActual);
    }

    @Override
    public String getLongWord() {
        List<String> lines = readFromFile(path);
        StringBuilder sb = new StringBuilder(lines.get(0));
        for (int i = 1; i < lines.size(); i++) {
            String word = lines.get(i);
            sb.append(word.charAt(word.length()-1));
        }
        return sb.toString();
    }
}
