package algorithmsmax.temperature;

import java.util.List;

public class Temperature {

    public int getMin(List<Integer> tempValues) {
        int min = Integer.MAX_VALUE;

        for (Integer actual : tempValues) {
            if (actual < min) {
                min = actual;
            }
        }
        return min;
    }


}
