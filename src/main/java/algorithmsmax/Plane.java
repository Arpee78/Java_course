package algorithmsmax;

public class Plane {

    public int getLongestOcean(String map) {
        int longestOcean = 0;
        int actualOcean = 0;

        for (char c : map.toCharArray()) {
            if (c == '0') {
                actualOcean++;
            } else {
                if (actualOcean > longestOcean) {
                    longestOcean = actualOcean;
                }
                actualOcean = 0;
            }
        }

        return longestOcean;
    }

}
