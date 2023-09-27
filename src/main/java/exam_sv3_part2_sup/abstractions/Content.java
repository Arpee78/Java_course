package exam_sv3_part2_sup.abstractions;

public interface Content {

    String getTitle();
    int getLength();

    default void addVideo(Video video){
        throw new IllegalStateException("Cannot add more video for this type of content!");
    }
}
