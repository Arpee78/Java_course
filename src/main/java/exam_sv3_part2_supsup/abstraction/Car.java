package exam_sv3_part2_supsup.abstraction;

public class Car implements Rentable {

    private String id;
    private RentingData rentingData;
    private int distanceCanMake;

    public Car(String id, int distanceCanMake) {
        this.id = id;
        this.distanceCanMake = distanceCanMake;
    }

    @Override
    public String getId() {
        return id;
    }

    public RentingData getRentingData() {
        return rentingData;
    }

    public int getDistanceCanMake() {
        return distanceCanMake;
    }

    @Override
    public void rent(User user, int km) {
        if (rentingData != null) {
            throw new IllegalStateException("The car is not available!");
        }
        if (distanceCanMake < km) {
            throw new IllegalArgumentException("Cannot make this distance: " + km);
        }
        rentingData = new RentingData(user, km);
    }

    @Override
    public void closeRent() {
        if (rentingData == null) {
            throw new IllegalStateException("Vehicle is not rented!");
        }
        distanceCanMake -= rentingData.getActualKm();
        rentingData.addEarlierRentToUser(this);
        rentingData = null;
    }

    @Override
    public boolean isFree() {
        return rentingData == null ? true : false;
    }

    public void tank(int km) {
        distanceCanMake += km;
    }
}
