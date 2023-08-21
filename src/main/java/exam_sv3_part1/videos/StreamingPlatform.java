package exam_sv3_part1.videos;

import java.util.ArrayList;
import java.util.List;

public class StreamingPlatform {

    private List<User> users = new ArrayList<>();

    void addUser(User user) {
        users.add(user);
    }

    public List<User> getUsers() {
        return new ArrayList<>(users);
    }

    public int findMaxViews() {
        int maxView = 0;

        for (User actual : users) {
            int actualViews = actual.sumOfViews();
            if (maxView < actualViews) {
                maxView = actualViews;
            }
        }

        return maxView;
    }
}
