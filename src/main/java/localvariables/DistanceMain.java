package localvariables;

public class DistanceMain {

    public static void main(String[] args) {
        Distance distance = new Distance(315.80, true);
        System.out.println(distance.getDistanceInKm());
        System.out.println(distance.isExact());

        int distanceInInt = (int) distance.getDistanceInKm();
        System.out.println(distanceInInt);
    }

}
