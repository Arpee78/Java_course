package exam_sv3_part2_sup.abstractions;

public class Video {

    private String title;
    private int length;

    public Video(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }
}
