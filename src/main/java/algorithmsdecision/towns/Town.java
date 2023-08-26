package algorithmsdecision.towns;

import java.util.List;

public class Town {

    public boolean containsFewerHabitants(List<Integer> numbers, int min) {
        for (int actual : numbers) {
            if (actual < min) {
                return true;
            }
        }
        return false;
    }
}
