package exam_sv3_part2_supsup.abstraction;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String userName;
    private List<Rentable> earlierRents = new ArrayList<>();

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public List<Rentable> getEarlierRents() {
        return new ArrayList<>(earlierRents);
    }

    public void addEarlierRent(Rentable rentable) {
        earlierRents.add(rentable);
    }

    public int countFreeInEarlierRent() {
        int count = 0;
        for (Rentable r : earlierRents) {
            if (r.isFree()){
                count++;
            }
        }
        return count;
    }
}
