package exam_sv3_part2_sup.abstractions;

import java.util.ArrayList;
import java.util.List;

public class Series implements Content {

    private String title;
    private List<Video> videos = new ArrayList<>();

    public Series(String title, Video video) {
        this.title = title;
        addVideo(video);
    }

    public Series(String title, List<Video> videos) {
        this.title = title;
        this.videos = videos;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public List<Video> getVideos() {
        return new ArrayList<>(videos);
    }

    @Override
    public int getLength() {
        int fullLength = 0;
        for (Video v : videos) {
            fullLength += v.getLength();
        }
        return fullLength;
    }

    @Override
    public void addVideo(Video video) {
        videos.add(video);
    }
}
