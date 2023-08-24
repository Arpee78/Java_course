package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TrackPoints {

    public List<String> readTrackpoints(Path path) {
        List<String> points = new ArrayList<>();
        try {
            points = Files.readAllLines(path);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return points;
    }

    public void printHeightDifference(List<String> points) {

        for (int i = 0; i < points.size()-1; i++) {
            int pointPrevious = Integer.parseInt(points.get(i).split(";")[2]);
            int pointNext = Integer.parseInt(points.get(i+1).split(";")[2]);
            System.out.println(pointNext-pointPrevious);
        }

    }
}
