package exam_sv3_part2_supsup.abstraction;

public class RentingData {

    private User actualUser;
    private int actualKm;

    public RentingData(User actualUser, int actualKm) {
        this.actualUser = actualUser;
        this.actualKm = actualKm;
    }

    public User getActualUser() {
        return actualUser;
    }

    public int getActualKm() {
        return actualKm;
    }

    void addEarlierRentToUser(Rentable rentable){
        actualUser.addEarlierRent(rentable);
    }
}
