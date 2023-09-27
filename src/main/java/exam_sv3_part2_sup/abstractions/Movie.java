package exam_sv3_part2_sup.abstractions;

public class Movie implements Content{

    private Video video;

    public Movie(Video video) {
        this.video = video;
    }

    @Override
    public String getTitle() {
        return video.getTitle();
    }

    @Override
    public int getLength() {
        return video.getLength();
    }

}
