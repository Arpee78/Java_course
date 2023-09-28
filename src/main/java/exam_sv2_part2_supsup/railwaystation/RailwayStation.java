package exam_sv2_part2_supsup.railwaystation;

import java.util.ArrayList;
import java.util.List;

public class RailwayStation {

    private List<Train> trains = new ArrayList<>();

    public List<Train> getTrains() {
        return new ArrayList<>(trains);
    }

    public void addTrain(Train train) {
        if (trains.size() > 9) {
            throw new IllegalArgumentException("Too much trains!");
        }
        trains.add(train);
    }

    public Train getLongestTrain() {
        Train longest = trains.get(0);
        for (Train t : trains) {
            if (longest.getTotalLength() < t.getTotalLength()) {
                longest = t;
            }
        }
        return longest;
    }

    public int getHowManyTrainsHaveName() {
        int count = 0;
        for (Train t : trains) {
            if (t.name != null) {
                count++;
            }
        }
        return count;
    }

    public List<Train> getTrainsWithPassengersMoreThan(int number) {
        List<Train> result = new ArrayList<>();
        for (Train t : trains) {
            if (t.calculateTravellingPeople() > number) {
                result.add(t);
            }
        }
        return result;
    }
}
