package exam_sv2_part2_supsup.railwaystation;

public abstract class Train {

    protected String name;
    private int numberOfWagons;
    protected static final int LENGTH_OF_WAGON = 15;

    public Train(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public int getTotalLength() {
        return numberOfWagons * LENGTH_OF_WAGON;
    }

    public abstract int calculateTravellingPeople();
}
