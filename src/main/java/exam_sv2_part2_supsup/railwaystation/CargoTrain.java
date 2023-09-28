package exam_sv2_part2_supsup.railwaystation;

public class CargoTrain extends Train {

    public CargoTrain(int numberOfWagons) {
        super(numberOfWagons);
    }

    @Override
    public int calculateTravellingPeople() {
        int count = super.getNumberOfWagons() / 10;
        return count == 0 ? 1 : count;
    }
}
