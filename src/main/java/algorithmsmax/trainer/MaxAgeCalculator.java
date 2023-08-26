package algorithmsmax.trainer;

import java.util.List;

public class MaxAgeCalculator {

    public Trainer getTrainerWithMaxAge(List<Trainer> trainers) {
        Trainer eldest = trainers.get(0);

        for (Trainer actual : trainers) {
            if (actual.getAge() > eldest.getAge()) {
                eldest = actual;
            }
        }
        return eldest;
    }
}
