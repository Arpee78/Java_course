package exam_sv3_part1.videos;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String userName;
    private List<Video> videos = new ArrayList<>();

    public User(String userName) {
        this.userName = userName;
    }

    public void uploadVideo(Video video) {
        videos.add(video);
    }

    public String getUserName() {
        return userName;
    }

    public List<Video> getVideos() {
        return new ArrayList<>(videos);
    }

    public int countVideosByType(Type type) {
        int count = 0;

        for (Video actual : videos) {
            if (actual.getType() == type) {
                count++;
            }
        }

        return count;
    }

    public int sumOfViews() {
        int sum = 0;

        for (Video actual : videos) {
            sum += actual.getViews();
        }

        return sum;
    }
}
