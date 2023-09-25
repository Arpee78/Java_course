package exam_sv3_part2.abstractions;

import java.util.ArrayList;
import java.util.List;

public class TextFile implements File {

    private static final String EXTENSION = "txt";
    private String title;
    private List<String> lines = new ArrayList<>();

    public TextFile(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getLines() {
        return new ArrayList<>(lines);
    }

    public void addLine(String newLine) {
        lines.add(newLine);
    }

    @Override
    public String getFullName() {
        return title + "."+ EXTENSION;
    }

    @Override
    public double calculateSize() {
        return lines.size() * File.KB_TO_MB;
    }
}
