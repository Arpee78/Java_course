package algorithmscount.height;

import java.util.List;

public class Height {

    public int countChildrenWithHeightGreaterThan(List<Integer> heights, int maxHeight) {
        int count = 0;

        for (Integer actual : heights) {
            if (actual >= maxHeight) {
                count++;
            }
        }
        return count;
    }
}
