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
            int pointPrevious = getValue(points.get(i));
            int pointNext = getValue(points.get(i+1));
            System.out.println(pointNext-pointPrevious);
        }
    }

    private int getValue(String point){
        return Integer.parseInt(point.split(";")[2]);
    }
}
