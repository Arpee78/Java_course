package exam_sv3_part2.abstractions;

import java.util.ArrayList;
import java.util.List;

public class ZipFile implements File {

    private static final String EXTENSION = "zip";
    private String title;
    private List<File> files;

    public ZipFile(String title, List<File> files) {
        this.title = title;
        this.files = files;
    }

    public String getTitle() {
        return title;
    }

    public List<File> getFiles() {
        return files;
    }

    @Override
    public String getFullName() {
        return title + "." + EXTENSION;
    }

    @Override
    public double calculateSize() {
        double sum = 0;
        for (File f : files) {
            sum += f.calculateSize();
        }
        return sum * 20 / 100;
    }

    public File findBiggestFile() {
        if (files.isEmpty()){
            throw new IllegalStateException("Zip is empty!");
        }
        File biggest = files.get(0);
        for (File f : files) {
            if (f.calculateSize() > biggest.calculateSize()) {
                biggest = f;
            }
        }
        return biggest;
    }
}
