package operators;

public class HeadingNorth {

    public int getNumberOfNewDirections() {
        int count = 0;
        for (int degree = 0; degree <= 360; degree += (count+1) * 10) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {

        HeadingNorth headingNorth = new HeadingNorth();
        System.out.println(headingNorth.getNumberOfNewDirections());
    }

}
