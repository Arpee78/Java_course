package exam_sv2_part2_supsup.railwaystation;

public class PassengerTrain extends Train {

    private boolean hasDiningCar;
    public static final int PEOPLE_PER_WAGON = 70;

    public PassengerTrain(int numberOfWagons) {
        super(numberOfWagons);
        hasDiningCar = false;
    }

    public PassengerTrain(String name, int numberOfWagons) {
        super(numberOfWagons);
        super.name = name;
        this.hasDiningCar = true;
    }

    public boolean hasDiningCar() {
        return hasDiningCar;
    }

    @Override
    public int calculateTravellingPeople() {
        return (super.getNumberOfWagons() - (hasDiningCar ? 1 : 0)) * PEOPLE_PER_WAGON;
    }
}
