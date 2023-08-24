package introexceptioncause;

import java.nio.file.Paths;
import java.util.List;

public class Tracking {

    public static void main(String[] args) {
        TrackPoints trackPoints = new TrackPoints();

        List<String> points = trackPoints.readTrackpoints(Paths.get("src/main/resources/tracking.csv"));
        trackPoints.printHeightDifference(points);
    }
}
